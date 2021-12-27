package HotelReservationApplication;

import HotelReservationApplication.Controller.MainMenu.MainMenu;
import HotelReservationApplication.Model.RoomType;
import HotelReservationApplication.Service.AdminService.AdminService;
import HotelReservationApplication.Service.CustomerService.CustomerService;

public class Main {

    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();
        AdminService adminService = new AdminService();

        customerService.UserRegisteration("first1", "second1", "test1@test.com");
        customerService.UserRegisteration("first2", "second2", "test2@test.com");
        customerService.UserRegisteration("first3", "second3", "test3@test.com");
        customerService.UserRegisteration("first4", "second4", "test4@test.com");
        customerService.UserRegisteration("first5", "second5", "test5@test.com");


        adminService.addRoom(125.0, 1, RoomType.Single);
        adminService.addRoom(150.0, 2, RoomType.Single);
        adminService.addRoom(200.0, 3, RoomType.Single);
        adminService.addRoom(300.0, 4, RoomType.Double);
        adminService.addRoom(350.0, 5, RoomType.Double);
        new MainMenu().MainMenu();
    }

}
