package HotelReservationApplication.Controller.AdminMenu;

import HotelReservationApplication.Controller.MainMenu.MainMenu;
import HotelReservationApplication.Service.AdminService.AdminService;
import java.util.*;

public class AdminMenu {

    private static final AdminService adminService = AdminService.getAdminService();

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
        AdminSelect();

    }

    private void AdminSelect() {

        Scanner scanner = new Scanner(System.in);

        try{
            String userInput = scanner.nextLine();

            if(Objects.equals(userInput, "1")){
                ShowAllUsers();
            }else if (Objects.equals(userInput, "2")){
                ShowAllRooms();
            }else if (Objects.equals(userInput, "3")){
//                adminService.getReservations();
            }else if (Objects.equals(userInput, "4")){
//                adminService.addRoom();
            }else if (Objects.equals(userInput, "5")){
                new MainMenu().MainMenu();
            } else {
                AdminMenu();
            }
        }
        catch (Exception e){
            System.out.println("AdminMenu Exception");
            AdminMenu();
        }
        finally {
            scanner.close();
        }

    }

    private void ShowAllUsers(){

        System.out.println("---------------- All User Data ----------------\n");

        if (adminService.getAllUsers().isEmpty()) {
            System.out.println("---------------- No User found ! ----------------\n");
        } else {
            adminService.getAllUsers().forEach(System.out::println);
        }
        new AdminMenu().AdminMenu();

    }

    private void ShowAllRooms(){

        System.out.println("---------------- All Room Data ----------------\n");

        if (adminService.getAllRooms().isEmpty()) {
            System.out.println("---------------- No Room found ! ----------------\n");
        } else {
            adminService.getAllRooms().forEach(System.out::println);
        }
        new AdminMenu().AdminMenu();

    }

}