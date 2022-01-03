package HotelReservationApplication.Controller.MainMenu;

import HotelReservationApplication.Api.HotelResource;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserCheckReservation extends MainMenu{

    private static final HotelResource hotelResource = HotelResource.getHotelResource();


    protected void CheckReservation(){

        System.out.println("---------------- Please Enter Your Email ----------------\n");

        Scanner scanner = new Scanner(System.in);
        final String Input = scanner.nextLine();

        Pattern pattern = Pattern.compile("^(\\w+)@(.+)\\.(.+)$");

        if (pattern.matcher(Input).matches()) {

            if(hotelResource.getUser(Input) == null){
                System.out.println("---------------- Account is not Exist ----------------\n");
                CheckReservation();
            } else {

                if (hotelResource.getUserReservations(Input) == null){

                    System.out.println("---------------- " +
                            "Reservation not Found ! " +
                            "----------------\n");
                    CheckReservation();

                } else {

                    System.out.println("\n" +
                            "-------------------------------- \n" +
                            "Hi ! " +
                            hotelResource.getUser(Input).getFirst_name() +
                            "\n" +
                            "This is your all reservations\n" +
                            " --------------------------------\n");

                    hotelResource.getUserReservations(Input).forEach(System.out::println);

                }

            }

        }else {
            System.out.println("\n---------------- Wrong Email format !----------------\n");
            CheckReservation();
        }

        new MainMenu().MainMenu();
    }

}
