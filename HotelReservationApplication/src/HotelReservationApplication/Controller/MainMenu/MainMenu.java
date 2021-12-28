package HotelReservationApplication.Controller.MainMenu;

import HotelReservationApplication.Controller.AdminMenu.AdminMenu;
import HotelReservationApplication.Service.AdminService.AdminService;
import HotelReservationApplication.Service.ReservationService.ReservationService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;


public class MainMenu{

    private static final ReservationService reservationService = ReservationService.getReservationService();
    private static final AdminService adminService = AdminService.getAdminService();



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

    private void Select() {

        Scanner scanner = new Scanner(System.in);

        try{
            String userInput = scanner.nextLine();

            if(Objects.equals(userInput, "1")){
                FindAndReserveARoom();
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

    private void FindAndReserveARoom() throws ParseException {

        SimpleDateFormat ft = new SimpleDateFormat ("MM/dd/yyyy");

        Date dateIn = ft.parse("08/11/2021");
        Date dateOut = ft.parse("08/13/2021");

        reservationService.reserveARoom(
                adminService.getUser("test2@test.com"),
                reservationService.getRoom("2"),
                dateIn,
                dateOut);

        MainMenu();

    }

}
