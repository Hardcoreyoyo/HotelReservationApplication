package HotelReservationApplication.Controller.AdminMenu;

import HotelReservationApplication.Controller.MainMenu.MainMenu;
import HotelReservationApplication.Service.AdminService.AdminService;
import java.util.*;

public class AdminMenu {

    AdminService adminService = new AdminService();

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
                adminService.getAllUser();
            }else if (Objects.equals(userInput, "2")){
                adminService.getAllRoom();
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

}




//    private final CustomerService customerService = CustomerService.getCustomerService();

//    AdminService adminService = new AdminService();
//    CustomerService customerService = new CustomerService();