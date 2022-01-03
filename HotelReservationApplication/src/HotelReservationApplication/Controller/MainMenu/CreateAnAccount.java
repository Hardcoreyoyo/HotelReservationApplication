package HotelReservationApplication.Controller.MainMenu;

import HotelReservationApplication.Api.HotelResource;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CreateAnAccount extends MainMenu {

    private static final HotelResource hotelResource = HotelResource.getHotelResource();

    protected void UserRegisteration(){

        Scanner scanner = new Scanner(System.in);

        final String first_name = Enterfirst_name(scanner);
        final String last_name = Enterlast_name(scanner);
        final String email  = EnterEmail(scanner);

        hotelResource.createACustomer(first_name, last_name, email);

        System.out.println("\n---------------- Registeration successful ----------------\n");

        new MainMenu().MainMenu();

    }

    private String Enterfirst_name(Scanner s){

        System.out.println("\n---------------- Please Enter First Name ----------------\n");

        String Input = s.nextLine();

        if(Input.length() == 0){
            return Enterfirst_name(s);
        }

        return Input;

    }

    private String Enterlast_name(Scanner s) {

        System.out.println("\n---------------- Please Enter Last Name ----------------\n");

        String Input = s.nextLine();

        if(Input.length() == 0){
            return Enterfirst_name(s);
        }
        return Input;

    }

    private String EnterEmail(Scanner s){

        System.out.println("\n---------------- Please Enter Email ----------------\n" +
                "Email format: xxxx@xxxx.com\n" +
                "--------------------------------\n"
        );

        String Input = s.nextLine();

        if(Input.length() == 0){
            return Enterfirst_name(s);
        }

        if(hotelResource.getUser(Input) != null){
            System.out.println("\n---------------- The Email is Exist !----------------\n");
            return EnterEmail(s);
        }

        Pattern pattern = Pattern.compile("^(\\w+)@(.+)\\.(.+)$");
        if (pattern.matcher(Input).matches()) {
            return Input;
        }else {
            System.out.println("\n---------------- Wrong Email format !----------------\n");
            return EnterEmail(s);
        }

    }

}
