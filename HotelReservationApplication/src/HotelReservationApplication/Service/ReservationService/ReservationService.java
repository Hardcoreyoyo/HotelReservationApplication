package HotelReservationApplication.Service.ReservationService;

import HotelReservationApplication.DataBase.ReservationDataBase;
import HotelReservationApplication.DataBase.RoomDataBase;
import HotelReservationApplication.DataBase.UserDataBase;
import HotelReservationApplication.Api.HotelResource;
import HotelReservationApplication.Model.IRoom;
import HotelReservationApplication.Model.ReservationModel;
import HotelReservationApplication.Model.User;
import HotelReservationApplication.Service.AdminService.AdminService;

import java.util.*;

public class ReservationService implements HotelResource {

    private static final ReservationService reservationService = new ReservationService();
    private static final AdminService adminService = AdminService.getAdminService();
    private static final UserDataBase userDataBase = UserDataBase.getUserDataBase();
    private static final RoomDataBase roomDataBase = RoomDataBase.getRoomDataBase();
    private static final ReservationDataBase reservationDataBase = ReservationDataBase.getReservationDataBase();

    public static ReservationService getReservationService(){
        return reservationService;
    }

    @Override
    public ReservationModel reserveARoom(User user, IRoom room, Date checkInDate, Date checkOutDate) {

        if(adminService.getReservations(user.getEmail()) == null){

            List<ReservationModel> reserveARoomList = new LinkedList<>();

            reserveARoomList.add(new ReservationModel(user, room, checkInDate, checkOutDate));
            reservationDataBase.getReservationModelMap().put(user.getEmail(), reserveARoomList);

            return new ReservationModel(user, room, checkInDate, checkOutDate);
        }

        Collection<ReservationModel> getReservationDataBaseCollection =
                reservationDataBase.getReservationModelMap().get(user.getEmail());

        getReservationDataBaseCollection.add(new ReservationModel(user, room, checkInDate, checkOutDate));
        reservationDataBase.getReservationModelMap().put(user.getEmail(), getReservationDataBaseCollection);

        return new ReservationModel(user, room, checkInDate, checkOutDate);

    }

    @Override
    public IRoom getRoom(String roomNumber) {
        return roomDataBase.getRoom().get(roomNumber);
    }


    @Override
    public void FindRoom() {

    }

    @Override
    public void CheckRoom() {

    }




    @Override
    public void UserRegisteration(String first_name, String last_name, String email) {}
}
