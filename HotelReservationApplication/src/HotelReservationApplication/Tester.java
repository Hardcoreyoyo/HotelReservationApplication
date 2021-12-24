package HotelReservationApplication;

import HotelReservationApplication.Controller.MainMenu.MainMenu;
import HotelReservationApplication.Model.User;

public class Tester {

    public static void main(String[] args) throws Exception {

        try {
            User user = new User("first", "second", "enmadm");
            System.out.println(user);
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }

    }

}
