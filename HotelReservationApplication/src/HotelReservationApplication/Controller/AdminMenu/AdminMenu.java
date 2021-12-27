package HotelReservationApplication.Controller.AdminMenu;

import HotelReservationApplication.Controller.MainMenu.MainMenu;
import HotelReservationApplication.Service.AdminService.AdminService;
import java.util.*;

public class AdminMenu {

    AdminService adminService = new AdminService();

    public void AdminMenu(){

        System.out.println("1. see all Custom");
        System.out.println("2. see all Room");
        System.out.println("3. See all Reservations");
        System.out.println("4. add a Room");
        System.out.println("5. Back to Main Menu");
        System.out.println("---- Please Select Number 1 ~ 5 ----");
        AdminSelect();

    }

    private void AdminSelect() {

        Scanner scanner = new Scanner(System.in);

        try{
            String userInput = scanner.nextLine();

            if(Objects.equals(userInput, "1")){
                adminService.getCustom();
            }else if (Objects.equals(userInput, "2")){
                adminService.getRoom();
            }else if (Objects.equals(userInput, "3")){
                adminService.getReservations();
            }else if (Objects.equals(userInput, "4")){
                adminService.addRoom();
            }else if (Objects.equals(userInput, "5")){
                new MainMenu().MainMenu();
            } else {
                AdminMenu();
            }
        }
        catch (Exception e){
            AdminMenu();
        }
        finally {
            scanner.close();
        }

    }

}
