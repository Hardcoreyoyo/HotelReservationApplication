package HotelReservationApplication.Controller.AdminMenu;

import HotelReservationApplication.Api.AdminResource;
import HotelReservationApplication.Controller.MainMenu.MainMenu;
import HotelReservationApplication.Model.IRoom;
import HotelReservationApplication.Model.Room;
import HotelReservationApplication.Model.RoomType;
import java.util.*;

public class AdminMenu {

    private static final AdminResource adminResource = AdminResource.getAdminResource();

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
        new AdminMenu().AdminMenu();

    }

    private void ShowAllReservations(){

        System.out.println("---------------- All Reservations Data ----------------\n");
        adminResource.displayAllReservations();
        new AdminMenu().AdminMenu();

    }

    private void ShowAllRooms(){

        System.out.println("---------------- All Room Data ----------------\n");

        if (adminResource.getAllRooms().isEmpty()) {
            System.out.println("---------------- No Room found ! ----------------\n");
        } else {
            adminResource.getAllRooms().forEach(System.out::println);
        }
        new AdminMenu().AdminMenu();

    }

    private void AddNewRoom(){

        Room room = new Room(600.0, "6", RoomType.Double);

        List<IRoom> list = new ArrayList<>();
        list.add(room);
        adminResource.addRoom(list);

        System.out.println("\n---------------- Add Room successful ----------------\n" + "\n");

        new AdminMenu().AdminMenu();
    }



}