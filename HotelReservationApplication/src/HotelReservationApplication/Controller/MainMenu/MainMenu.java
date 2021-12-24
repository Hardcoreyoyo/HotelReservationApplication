package HotelReservationApplication.Controller.MainMenu;

import HotelReservationApplication.Service.Login;
import java.util.Scanner;

public class MainMenu {

    public static void MainMenu(){

        Scanner scanner = new Scanner(System.in);

        try{

            System.out.println("1. Find and reserve a room");
            System.out.println("2. See my reservations");
            System.out.println("3. Create an account");
            System.out.println("4. Admin");
            System.out.println("5. Exit");
            System.out.println("Please Enter Number 1~5");
            String userInput = scanner.nextLine();
            if(userInput == "1"){
                Login.Login();
            }else if (userInput == "2"){

            }else if (userInput == "3"){

            }else if (userInput == "4"){

            }else if (userInput == "5"){

            }else {

            }


        }catch (Exception e){
            e.getLocalizedMessage();
        }finally {
            scanner.close();
        }

    }

}
