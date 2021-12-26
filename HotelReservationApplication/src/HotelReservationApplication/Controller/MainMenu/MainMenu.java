package HotelReservationApplication.Controller.MainMenu;

import HotelReservationApplication.Controller.AdminMenu.AdminMenu;
import HotelReservationApplication.InterfaceApi.HotelResource;
import HotelReservationApplication.Service.CustomerService.Login;
import HotelReservationApplication.Service.CustomerService.UserRegistration;

import java.util.*;

public class MainMenu {




    public static void MainMenu(){

        System.out.println("1. Find and reserve a room");
        System.out.println("2. See my reservations");
        System.out.println("3. Create an account");
        System.out.println("4. Admin");
        System.out.println("5. Exit");
        System.out.println("---- Please Select Number 1 ~ 5 ----");
        Select();

    }

    private static void Select(){

        UserRegistration userRegistration = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        if(Objects.equals(userInput, "1")){
            Login.Login();
        }else if (Objects.equals(userInput, "2")){
            Login.Login();
        }else if (Objects.equals(userInput, "3")){
            userRegistration.Registration();
        }else if (Objects.equals(userInput, "4")){
            AdminMenu.AdminMenu();
        }else if (Objects.equals(userInput, "5")){
            scanner.close();
            System.exit(0);
        } else {
            MainMenu();
        }

    }

}
