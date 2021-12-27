package HotelReservationApplication;

import HotelReservationApplication.Controller.MainMenu.MainMenu;
import HotelReservationApplication.Dao.IRoom;
import HotelReservationApplication.Model.Room;
import HotelReservationApplication.Model.RoomType;
import HotelReservationApplication.Service.AdminService.AdminService;
import HotelReservationApplication.Service.CustomerService.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();
        AdminService adminService = new AdminService();

        customerService.UserRegisteration("first1", "second1", "test1@test.com");
        customerService.UserRegisteration("first2", "second2", "test2@test.com");
        customerService.UserRegisteration("first3", "second3", "test3@test.com");
        customerService.UserRegisteration("first4", "second4", "test4@test.com");
        customerService.UserRegisteration("first5", "second5", "test5@test.com");


        List<IRoom> iRooms = new ArrayList<>();
        iRooms.add(new Room(125.0, "1", RoomType.Single));
        iRooms.add(new Room(150.0, "2", RoomType.Single));
        iRooms.add(new Room(200.0, "3", RoomType.Single));
        iRooms.add(new Room(300.0, "4", RoomType.Double));
        iRooms.add(new Room(350.0, "5", RoomType.Double));
        adminService.addRoom(iRooms);

        new MainMenu().MainMenu();

    }

}
