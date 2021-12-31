package HotelReservationApplication.Service.AdminService;

import HotelReservationApplication.DataBase.ReservationDataBase;
import HotelReservationApplication.Model.IRoom;
import HotelReservationApplication.DataBase.RoomDataBase;
import HotelReservationApplication.DataBase.UserDataBase;
import HotelReservationApplication.Model.ReservationModel;
import HotelReservationApplication.Model.Room;
import HotelReservationApplication.Model.User;
import java.util.Collection;
import java.util.List;


public class AdminService {

    private static final AdminService adminService = new AdminService();
    private static final UserDataBase userDataBase = UserDataBase.getUserDataBase();
    private static final RoomDataBase roomDataBase = RoomDataBase.getRoomDataBase();
    private static final ReservationDataBase reservationDataBase = ReservationDataBase.getReservationDataBase();


    public static AdminService getAdminService(){
        return adminService;
    }

    public User getUser(String email) {
        return userDataBase.getUser().get(email);
    }

    public Collection<User> getAllUsers() {
        return userDataBase.getUser().values();
    }

    public Collection<IRoom> getAllRooms() {
        return roomDataBase.getRoom().values();
    }

    public Collection<ReservationModel> getReservations(String email) {
        return reservationDataBase.getReservationModelMap().get(email);
    }

    public void addRoom(List<IRoom> rooms){
        rooms.forEach(iRoom -> roomDataBase.getRoom().put(iRoom.getRoom_number(), new Room(iRoom.getRoom_price(), iRoom.getRoom_number(), iRoom.getRoomType())));
    }

    public void displayAllReservations() {

        if(reservationDataBase.getReservationModelMap().isEmpty()){
            System.out.println("---------------- No Reservations found ! ----------------\n");
        }

        reservationDataBase.getReservationModelMap().values().forEach(reservationModels ->
                reservationModels.forEach(System.out::println));

    }

}
