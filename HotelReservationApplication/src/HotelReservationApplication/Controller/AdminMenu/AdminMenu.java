package HotelReservationApplication.Controller.AdminMenu;

import HotelReservationApplication.Service.CustomerService.Login;

import java.util.*;

public class AdminMenu {

    public static void AdminMenu(){

        System.out.println("1. see all Custom");
        System.out.println("2. see all Room");
        System.out.println("3. See all Reservations");
        System.out.println("4. add a Room");
        System.out.println("5. Back to Main Menu");
        System.out.println("---- Please Select Number 1 ~ 5 ----");
        AdminSelect();

    }

    private static void AdminSelect(){

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        if(Objects.equals(userInput, "1")){
            Login.Login();
        }else if (Objects.equals(userInput, "2")){
            Login.Login();
        }else if (Objects.equals(userInput, "3")){

        }else if (Objects.equals(userInput, "4")){
            AdminMenu.AdminMenu();
        }else if (Objects.equals(userInput, "5")){
            scanner.close();
            System.exit(0);
        } else {
            AdminMenu();
        }

    }

}
