package HotelReservationApplication.Service.ReservationService;

import HotelReservationApplication.DataBase.ReservationDataBase;
import HotelReservationApplication.DataBase.RoomDataBase;
import HotelReservationApplication.Model.IRoom;
import HotelReservationApplication.Model.ReservationModel;
import HotelReservationApplication.Model.User;
import HotelReservationApplication.Service.AdminService.AdminService;
import java.util.*;


public class ReservationService {

    private static final ReservationService reservationService = new ReservationService();
    private static final AdminService adminService = AdminService.getAdminService();
    private static final RoomDataBase roomDataBase = RoomDataBase.getRoomDataBase();
    private static final ReservationDataBase reservationDataBase = ReservationDataBase.getReservationDataBase();
    private static final int ADD_RECOMMENDED_DAYS = 7;


    public static ReservationService getReservationService(){
        return reservationService;
    }

    public Collection<IRoom> FindRooms(Date checkInDate, Date checkOutDate){

        if(reservationDataBase.getReservationModelMap().isEmpty()){
            return roomDataBase.getRoom().values();

        } else {
            return FilterReservedRoom(CheckDateRange(checkInDate, checkOutDate));
        }

    }

    private Collection<IRoom> CheckDateRange(Date checkInDate, Date checkOutDate) {

        Collection<IRoom> ReservedRoom = new LinkedList<>();

        for (Collection<ReservationModel> reservationModel :
                reservationDataBase.getReservationModelMap().values()) {

            for (ReservationModel reservationModels : reservationModel) {

                Date ReservedDateIn = reservationModels.getCkeck_in_date();
                Date ReservedDateOut = reservationModels.getCkeck_out_date();

                boolean InspectDateIn =
                        ReservedDateIn.getTime() >= checkInDate.getTime() &&
                        ReservedDateIn.getTime() <= checkOutDate.getTime();

                boolean InspectDateOut =
                        ReservedDateOut.getTime() <= checkOutDate.getTime() &&
                        ReservedDateOut.getTime() >= checkInDate.getTime();

                boolean InspectDateReverse =
                        checkInDate.getTime() >= ReservedDateIn.getTime() &&
                        checkOutDate.getTime() <= ReservedDateOut.getTime();

                if (InspectDateIn || InspectDateOut || InspectDateReverse){
                    ReservedRoom.add(reservationModels.getiRoom());
                }
            }
        }

        return ReservedRoom;
    }

    private Collection<IRoom> FilterReservedRoom(Collection<IRoom> CheckedRoomRange){

        List<IRoom> FilterReservedRoomList = new LinkedList<>();

        for (IRoom iRoom :roomDataBase.getRoom().values()) {
            if(!CheckedRoomRange.contains(iRoom)){
                FilterReservedRoomList.add(iRoom);
            }
        }

        return FilterReservedRoomList;
    }

    public ReservationModel reserveARoom(User user, IRoom room, Date checkInDate, Date checkOutDate) {

        ReservationModel ReceiveReservationModel =
                new ReservationModel(user, room, checkInDate, checkOutDate);

        if(adminService.getUserReservations(user.getEmail()) == null){

            List<ReservationModel> reserveARoomList = new LinkedList<>();

            reserveARoomList.add(ReceiveReservationModel);
            reservationDataBase.getReservationModelMap().put(user.getEmail(), reserveARoomList);

            return ReceiveReservationModel;
        }

        Collection<ReservationModel> getReservationDataBaseCollection =
                reservationDataBase.getReservationModelMap().get(user.getEmail());

        getReservationDataBaseCollection.add(ReceiveReservationModel);
        reservationDataBase.getReservationModelMap().put(user.getEmail(), getReservationDataBaseCollection);

        return ReceiveReservationModel;

    }

    public IRoom getARoom(String roomNumber) {
        return roomDataBase.getRoom().get(roomNumber);
    }

    public Date RecommandDate(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, ADD_RECOMMENDED_DAYS);

        return calendar.getTime();
    }

    public Collection<IRoom> getRecommandRoom(Date checkInDate, Date checkOutDate){
        return FilterReservedRoom(
                CheckDateRange(
                        RecommandDate(checkInDate),
                        RecommandDate(checkOutDate)));
    }



}
