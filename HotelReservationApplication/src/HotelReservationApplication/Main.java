package HotelReservationApplication;

import HotelReservationApplication.Controller.MainMenu.MainMenu;
import HotelReservationApplication.Model.IRoom;
import HotelReservationApplication.Model.Room;
import HotelReservationApplication.Model.RoomType;
import HotelReservationApplication.Service.AdminService.AdminService;
import HotelReservationApplication.Service.CustomerService.CustomerService;
import HotelReservationApplication.Service.ReservationService.ReservationService;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();
        AdminService adminService = new AdminService();
        ReservationService reservationService = new ReservationService();

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

        ReservedInject(reservationService, adminService);

        new MainMenu().MainMenu();
    }

    private static void ReservedInject(ReservationService reservationService,
                                       AdminService adminService) {

            SimpleDateFormat ft = new SimpleDateFormat ("MM/dd/yyyy");

            try{
                Date dateIn = ft.parse("08/10/2021");
                Date dateOut = ft.parse("08/13/2021");

                reservationService.reserveARoom(
                        adminService.getUser("test2@test.com"),
                        reservationService.getRoom("2"),
                        dateIn,
                        dateOut);
            } catch (Exception e){
                System.out.println("---------------- ReservedInject Date Wrong ! ----------------\n");

            }

    }

}
