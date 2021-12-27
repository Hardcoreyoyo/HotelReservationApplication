package HotelReservationApplication.Controller.MainMenu;

import HotelReservationApplication.Controller.AdminMenu.AdminMenu;
import HotelReservationApplication.Service.CustomerService.CustomerService;
import java.util.*;

public class MainMenu{

    CustomerService customerService = new CustomerService();

    public void MainMenu() {

        System.out.println("1. Find and reserve a room");
        System.out.println("2. See my reservations");
        System.out.println("3. Create an account");
        System.out.println("4. Admin");
        System.out.println("5. Exit");
        System.out.println("---- Please Select Number 1 ~ 5 ----");
        Select();

    }

    private void Select(){

        Scanner scanner = new Scanner(System.in);

        try{
            String userInput = scanner.nextLine();

            if(Objects.equals(userInput, "1")){
                customerService.FindRoom();
            }else if (Objects.equals(userInput, "2")){
                customerService.CheckRoom();
            }else if (Objects.equals(userInput, "3")){
                customerService.UserRegisteration();
            }else if (Objects.equals(userInput, "4")){
                new AdminMenu().AdminMenu();
            }else if (Objects.equals(userInput, "5")){
                System.out.println("---- Close Hotel Reservation System ----");
                System.exit(0);
            } else {
                MainMenu();
            }
        }
        catch (Exception e){
            MainMenu();
        }
        finally {
            scanner.close();
        }

    }

}
