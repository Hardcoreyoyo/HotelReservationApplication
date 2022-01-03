package HotelReservationApplication.Controller.AdminMenu;

import HotelReservationApplication.Api.AdminResource;
import HotelReservationApplication.Api.HotelResource;
import HotelReservationApplication.Model.IRoom;
import HotelReservationApplication.Model.Room;
import HotelReservationApplication.Model.RoomType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class AddNewRoom extends AdminMenu{

    private static final AdminResource adminResource = AdminResource.getAdminResource();
    private static final HotelResource hotelResource = HotelResource.getHotelResource();

    protected void AddNewRoom(){

        Scanner scanner = new Scanner(System.in);

        final String EnterRoomNumber = EnterRoomNumber(scanner);
        final Double EnterRoomPrice = EnterRoomPrice(scanner);
        final RoomType roomType  = EnterRoomType(scanner);

        Room room = new Room(EnterRoomPrice, EnterRoomNumber, roomType);
        List<IRoom> list = new ArrayList<>();
        list.add(room);
        adminResource.addRoom(list);

        System.out.println("\n---------------- Add Room successful ----------------\n" + "\n");

        new AdminMenu().AdminMenu();
    }

    private String EnterRoomNumber(Scanner s){

        System.out.println("---------------- Please Enter room number ----------------\n");

        String Input = s.nextLine();

        if(Input.length() == 0){
            return EnterRoomNumber(s);
        }

        if(hotelResource.getRoom(Input) != null){

            System.out.println("---------------- The room number is Exist !----------------\n");
            return EnterRoomNumber(s);
        }

        return Input;

    }

    private Double EnterRoomPrice(Scanner s) {

        System.out.println("---------------- Please Enter room Price EX: 125.0----------------\n");

        String Input = s.nextLine();
        try {
            return Double.parseDouble(Input);
        } catch (Exception e) {
            System.out.println("---------------- Wrong Price format EX: 125.0----------------\n");
            return EnterRoomPrice(s);
        }


    }

    private RoomType EnterRoomType(Scanner s){

        System.out.println("---------------- Please Enter Room Type----------------\n" +
                "1. Single" + "\n" +
                "2. Double" + "\n" +
                "---------------- Please Select Number 1 or 2----------------\n" );

        String Input = s.nextLine();

        if(Objects.equals(Input, "1")){
            return RoomType.Single;

        } else if (Objects.equals(Input, "2")){
            return RoomType.Double;
        }

        else {
            return EnterRoomType(s);
        }

    }

}
