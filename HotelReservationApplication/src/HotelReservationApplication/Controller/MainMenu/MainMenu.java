package HotelReservationApplication.Controller.MainMenu;

import HotelReservationApplication.Controller.AdminMenu.AdminMenu;
import HotelReservationApplication.InterfaceApi.HotelResource;
import HotelReservationApplication.Service.CustomerService.CustomerService;
import java.util.*;

public class MainMenu{

    public void MainMenu() {

        System.out.print("\nHotel Reservation Application\n" +
                "--------------------------------------------\n" +
                "1. Find and reserve a room\n" +
                "2. See my reservations\n" +
                "3. Create an Account\n" +
                "4. Admin\n" +
                "5. Exit\n" +
                "--------------------------------------------\n" +
                "-------- Please Select Number 1 ~ 5 --------\n");
                Select();

    }

    private void Select(){

        Scanner scanner = new Scanner(System.in);

        try{
            String userInput = scanner.nextLine();

            if(Objects.equals(userInput, "1")){
//                customerService.FindRoom();
            }else if (Objects.equals(userInput, "2")){
//                customerService.CheckRoom();
            }else if (Objects.equals(userInput, "3")){
//                customerService.UserRegisteration();
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
