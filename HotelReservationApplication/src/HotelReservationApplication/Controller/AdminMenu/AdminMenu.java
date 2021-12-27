package HotelReservationApplication.Controller.AdminMenu;

import HotelReservationApplication.Controller.MainMenu.MainMenu;
import HotelReservationApplication.Service.AdminService.AdminService;
import HotelReservationApplication.Service.CustomerService.CustomerService;

import java.util.*;

public class AdminMenu {

//    AdminService adminService = new AdminService();
//    CustomerService customerService = new CustomerService();

    private final CustomerService customerService = CustomerService.getSingleton();

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

//        try{
//            String userInput = scanner.nextLine();
//
//            if(Objects.equals(userInput, "1")){
//                System.out.println(adminService.getCustom("test2@test.com").toString());
//
//            }else if (Objects.equals(userInput, "2")){
//                adminService.getRoom();
//            }else if (Objects.equals(userInput, "3")){
//                adminService.getReservations();
//            }else if (Objects.equals(userInput, "4")){
//                adminService.addRoom();
//            }else if (Objects.equals(userInput, "5")){
//                new MainMenu().MainMenu();
//            } else {
//                AdminMenu();
//            }
//        }
//        catch (Exception e){
//            System.out.println("AdminMenu Exception");
//            AdminMenu();
//        }
//        finally {
//            scanner.close();
//        }





            String userInput = scanner.nextLine();

            if(Objects.equals(userInput, "1")){
//                System.out.println(adminService.getCustom("test2@test.com"));
                System.out.println(customerService.getCustom("test2@test.com"));

            }else if (Objects.equals(userInput, "2")){
//                adminService.getRoom();
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

}
