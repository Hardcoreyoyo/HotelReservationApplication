package HotelReservationApplication.Controller.AdminMenu;

import HotelReservationApplication.Api.AdminResource;
import HotelReservationApplication.Api.HotelResource;
import HotelReservationApplication.Controller.MainMenu.MainMenu;
import HotelReservationApplication.Model.IRoom;
import HotelReservationApplication.Model.Room;
import HotelReservationApplication.Model.RoomType;
import java.util.*;

public class AdminMenu {

    private static final AdminResource adminResource = AdminResource.getAdminResource();
    private static final HotelResource hotelResource = HotelResource.getHotelResource();

    public void AdminMenu(){

        System.out.print("\nAdmin Menu\n" +
                "--------------------------------------------\n" +
                "1. See all Customers\n" +
                "2. See all Rooms\n" +
                "3. See all Reservations\n" +
                "4. Add a Room\n" +
                "5. Back to Main Menu\n" +
                "--------------------------------------------\n" +
                "-------- Please Select Number 1 ~ 5 --------\n");
        AdminMenuSelect();

    }

    private void AdminMenuSelect() {

        String InputString = new Scanner(System.in).nextLine();

        try{
            if (InputString.length() == 1) {
                switch (InputString) {
                    case "1" -> ShowAllUsers();
                    case "2" -> ShowAllRooms();
                    case "3" -> ShowAllReservations();
                    case "4" -> AddNewRoom();
                    case "5" -> new MainMenu().MainMenu();
                    default -> AdminMenu();
                }
            } else {
                AdminMenu();
            }
        }
        catch (Exception e){
            System.out.println("---------------- Opes! ----------------\n");
            AdminMenu();
        }

    }

    private void ShowAllUsers(){

        System.out.println("---------------- All User Data ----------------\n");

        if (adminResource.getAllUser().isEmpty()) {
            System.out.println("---------------- No User found ! ----------------\n");
        } else {
            adminResource.getAllUser().forEach(System.out::println);
        }
        AdminMenu();

    }

    private void ShowAllReservations(){

        System.out.println("---------------- All Reservations Data ----------------\n");
        adminResource.displayAllReservations();
        AdminMenu();

    }

    private void ShowAllRooms(){

        System.out.println("---------------- All Room Data ----------------\n");

        if (adminResource.getAllRooms().isEmpty()) {
            System.out.println("---------------- No Room found ! ----------------\n");
        } else {
            adminResource.getAllRooms().forEach(System.out::println);
        }
        AdminMenu();

    }

    private void AddNewRoom(){

        Scanner scanner = new Scanner(System.in);

        final String EnterRoomNumber = EnterRoomNumber(scanner);
        final Double EnterRoomPrice = EnterRoomPrice(scanner);
        final RoomType roomType  = EnterRoomType(scanner);

        Room room = new Room(EnterRoomPrice, EnterRoomNumber, roomType);
        List<IRoom> list = new ArrayList<>();
        list.add(room);
        adminResource.addRoom(list);

        System.out.println("\n---------------- Add Room successful ----------------\n" + "\n");

        AdminMenu();
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

    private double EnterRoomPrice(Scanner s) {

        System.out.println("---------------- Please Enter room Price EX: 125.0----------------\n");

        String Input = s.nextLine();
        try {
            return Double.parseDouble(Input);
        } catch (Exception e) {
            System.out.println("---------------- Wrong Price format EX: 125.0----------------\n");
            EnterRoomPrice(s);
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

//    private void AddNewRoom(){
//
//        Room room = new Room(600.0, "6", RoomType.Double);
//
//        List<IRoom> list = new ArrayList<>();
//        list.add(room);
//        adminResource.addRoom(list);
//
//        System.out.println("\n---------------- Add Room successful ----------------\n" + "\n");
//
//        AdminMenu();
//    }



}