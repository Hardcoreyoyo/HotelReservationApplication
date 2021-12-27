package HotelReservationApplication.Service.AdminService;

import HotelReservationApplication.Controller.AdminMenu.AdminMenu;
import HotelReservationApplication.DataBase.RoomDataBase;
import HotelReservationApplication.DataBase.UserDataBase;
import HotelReservationApplication.InterfaceApi.AdminResource;
import HotelReservationApplication.Model.Room;
import HotelReservationApplication.Model.RoomType;
import HotelReservationApplication.Model.User;

import java.util.Collection;

public class AdminService implements AdminResource {

    private static final AdminService adminService = new AdminService();
    private static final UserDataBase userDataBase = UserDataBase.getUserDataBase();
    private static final RoomDataBase roomDataBase = RoomDataBase.getRoomDataBase();

    public static AdminService getAdminService(){
        return adminService;
    }

    @Override
    public User getUser(String email) {
        return null;
    }

    @Override
    public Collection<User> getAllUsers() {
        return userDataBase.getUser().values();
    }

    @Override
    public Collection<Room> getAllRooms() {
        return roomDataBase.getRoom().values();
    }

    @Override
    public void getReservations() {
        System.out.println("getReservations");
    }

    @Override
    public void addRoom(Double room_price, String room_number, RoomType roomType) {
        roomDataBase.getRoom().put(room_number, new Room(room_price, room_number, roomType));

        System.out.println("\n---------------- Add Room successful ----------------\n" + "\n");
    }

}
