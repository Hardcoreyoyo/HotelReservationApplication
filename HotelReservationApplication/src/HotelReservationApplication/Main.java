package HotelReservationApplication;


import HotelReservationApplication.Controller.MainMenu.MainMenu;
import HotelReservationApplication.Model.User;
import HotelReservationApplication.Service.CustomerService.CustomerService;

public class Main {

    public static void main(String[] args) throws Exception {

        CustomerService customerService = CustomerService.getSingleton();

        customerService.UserRegisteration("first1", "second1", "test1@test.com");
        customerService.UserRegisteration("first2", "second2", "test2@test.com");
        customerService.UserRegisteration("first3", "second3", "test3@test.com");
        customerService.UserRegisteration("first4", "second4", "test4@test.com");
        customerService.UserRegisteration("first5", "second5", "test5@test.com");

        new MainMenu().MainMenu();
    }

}
