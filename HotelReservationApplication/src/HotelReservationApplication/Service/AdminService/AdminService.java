package HotelReservationApplication.Service.AdminService;

import HotelReservationApplication.Controller.AdminMenu.AdminMenu;
import HotelReservationApplication.Dao.IRoom;
import HotelReservationApplication.DataBase.RoomDataBase;
import HotelReservationApplication.DataBase.UserDataBase;
import HotelReservationApplication.InterfaceApi.AdminResource;
import HotelReservationApplication.Model.Room;
import HotelReservationApplication.Model.RoomType;
import HotelReservationApplication.Model.User;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

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
    public void addRoom(List<IRoom> rooms){
        rooms.forEach(iRoom -> roomDataBase.getRoom().put(iRoom.getRoom_number(), new Room(iRoom.getRoom_price(), iRoom.getRoom_number(), iRoom.getRoomType())));
    }

}
