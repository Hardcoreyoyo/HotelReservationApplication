package HotelReservationApplication.Controller.MainMenu;

import HotelReservationApplication.Api.HotelResource;
import HotelReservationApplication.Controller.AdminMenu.AdminMenu;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainMenu{

    private static final HotelResource hotelResource = HotelResource.getHotelResource();

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
        MainMenuSelect();

    }

    private void MainMenuSelect() {

        String InputString = new Scanner(System.in).nextLine();

        try{
            if (InputString.length() == 1) {
                switch (InputString) {
                    case "1" -> FindAndReserveARoom();
                    case "2" -> UserCheckReservation();
                    case "3" -> UserRegisteration();
                    case "4" -> new AdminMenu().AdminMenu();
                    case "5" -> Exit();
                    default -> MainMenu();
                }
            } else {
                MainMenu();
            }
        }
        catch (Exception e){
            MainMenu();
        }

    }

    private void Exit(){
        System.out.println("---- Close Hotel Reservation System ----");
        System.exit(0);
    }

    private void FindAndReserveARoom(){

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat ft = new SimpleDateFormat ("MM/dd/yyyy");

        try{
            System.out.println("---- checkInDate ----");
            Date dateIn = ft.parse(scanner.nextLine());

            System.out.println("---- checkOutDate ----");
            Date dateOut = ft.parse(scanner.nextLine());

            if(dateIn.getTime() < dateOut.getTime()) {

                    if (hotelResource.findARoom(dateIn, dateOut).isEmpty()) {

                        if (hotelResource.RecommandRoom(dateIn, dateOut).isEmpty()) {
                            System.out.println("---- No Room Found ! ----");
                        }else {
                            hotelResource.RecommandRoom(dateIn, dateOut).forEach(System.out::println);
                        }

                    } else {
                        hotelResource.findARoom(dateIn, dateOut).forEach(System.out::println);
                    }

            }else {
                System.out.println("---- Wrong Date Order----");
            }

        } catch (ParseException e){
            System.out.println("---- Wrong Date Format ----");
        } catch (Exception ignored){
        }

        MainMenu();


//            Date dateIn = ft.parse("08/10/2021");
//            Date dateOut = ft.parse("08/13/2021");

//            Date dateIn = ft.parse("08/03/2021");
//            Date dateOut = ft.parse("08/20/2021");

    }

    private void UserCheckReservation(){

    }

    private void UserRegisteration(){

    }







}
