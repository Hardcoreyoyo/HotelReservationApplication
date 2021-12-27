package HotelReservationApplication.Service.AdminService;

import HotelReservationApplication.Controller.AdminMenu.AdminMenu;
import HotelReservationApplication.DataBase.RoomDataBase;
import HotelReservationApplication.DataBase.UserDataBase;
import HotelReservationApplication.InterfaceApi.AdminResource;
import HotelReservationApplication.Model.Room;
import HotelReservationApplication.Model.RoomType;
import HotelReservationApplication.Model.User;

public class AdminService implements AdminResource {

    private final UserDataBase userDataBase = UserDataBase.getUserDataBase();
    private final RoomDataBase roomDataBase = RoomDataBase.getRoomDataBase();

    @Override
    public void getAllUser() {
        System.out.println("---------------- All User Data ----------------\n");
        for (User user:userDataBase.getUser().values()) {
            System.out.println("\n" +
                    "First Name: " + user.getFirst_name() + "\n" +
                    "Last Name: " + user.getLast_name() + "\n" +
                    "Email: " + user.getEmail() + "\n" +
                    "\n");
        }
        new AdminMenu().AdminMenu();
    }

    @Override
    public void getAllRoom() {
        System.out.println("---------------- All Room Data ----------------\n");
        for (Room room:roomDataBase.getRoom().values()) {
            System.out.println("\n" +
                    "Room Number: " + room.getRoom_number() + "\n" +
                    "Room Type: " + room.getRoomType() + "\n" +
                    "Room Price: " + room.getRoom_price() + "\n" +
                    "\n");
        }
        new AdminMenu().AdminMenu();
    }

    @Override
    public void getReservations() {
        System.out.println("getReservations");
    }

    @Override
    public void addRoom(Double room_price, Integer room_number, RoomType roomType) {
        roomDataBase.getRoom().put(room_number, new Room(room_price, room_number, roomType));

        System.out.println("\n---------------- Add Room successful ----------------\n" + "\n");
    }

}
