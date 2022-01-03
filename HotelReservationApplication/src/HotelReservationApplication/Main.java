package HotelReservationApplication;

import HotelReservationApplication.Api.AdminResource;
import HotelReservationApplication.Api.HotelResource;
import HotelReservationApplication.Controller.MainMenu.MainMenu;
import HotelReservationApplication.Model.IRoom;
import HotelReservationApplication.Model.Room;
import HotelReservationApplication.Model.RoomType;
import HotelReservationApplication.Service.ReservationService.ReservationService;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        AdminResource adminResource = AdminResource.getAdminResource();
        HotelResource hotelResource = HotelResource.getHotelResource();




        hotelResource.createACustomer("first1", "second1", "test1@test.com");
        hotelResource.createACustomer("first2", "second2", "test2@test.com");
        hotelResource.createACustomer("first3", "second3", "test3@test.com");
        hotelResource.createACustomer("first4", "second4", "test4@test.com");
        hotelResource.createACustomer("first5", "second5", "test5@test.com");




        List<IRoom> iRooms = new ArrayList<>();
        iRooms.add(new Room(125.0, "1", RoomType.Single));
        iRooms.add(new Room(150.0, "2", RoomType.Single));
        iRooms.add(new Room(200.0, "3", RoomType.Single));
        iRooms.add(new Room(300.0, "4", RoomType.Double));
        iRooms.add(new Room(350.0, "5", RoomType.Double));
        iRooms.add(new Room(0.0, "6", RoomType.Single));
        adminResource.addRoom(iRooms);




        ReservationService reservationService =
                ReservationService.getReservationService();
        SimpleDateFormat ft = new SimpleDateFormat ("MM/dd/yyyy");

        try{
            Date dateIn = ft.parse("08/03/2021");
            Date dateOut = ft.parse("08/20/2021");

            reservationService.reserveARoom(
                    adminResource.getUser("test2@test.com"),
                    reservationService.getARoom("1"),
                    dateIn,
                    dateOut);

            reservationService.reserveARoom(
                    adminResource.getUser("test2@test.com"),
                    reservationService.getARoom("2"),
                    dateIn,
                    dateOut);

            reservationService.reserveARoom(
                    adminResource.getUser("test2@test.com"),
                    reservationService.getARoom("3"),
                    dateIn,
                    dateOut);

            reservationService.reserveARoom(
                    adminResource.getUser("test2@test.com"),
                    reservationService.getARoom("4"),
                    dateIn,
                    dateOut);

            reservationService.reserveARoom(
                    adminResource.getUser("test2@test.com"),
                    reservationService.getARoom("5"),
                    dateIn,
                    dateOut);

        } catch (Exception e){
            System.out.println("---------------- ReservedInject Date Wrong ! ----------------\n");

        }

        new MainMenu().MainMenu();
    }


}
