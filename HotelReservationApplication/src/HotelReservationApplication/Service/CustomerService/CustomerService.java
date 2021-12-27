package HotelReservationApplication.Service.CustomerService;

import HotelReservationApplication.InterfaceApi.HotelResource;
import HotelReservationApplication.Model.User;
//import HotelReservationApplication.Model.UserDataBase;

import java.util.HashMap;
import java.util.Map;

public class CustomerService implements HotelResource {

//    UserDataBase userDataBase = new UserDataBase();

    private static final CustomerService SINGLETON = new CustomerService();

    private final Map<String, User> user = new HashMap<>();

    public static CustomerService getSingleton() {
        return SINGLETON;
    }

    @Override
    public void Login() {
        System.out.println("Login");
    }

    @Override
    public void UserRegisteration(String first_name, String last_name, String email) {
        System.out.println("---- UserRegisteration ----");
        user.put(email, new User(first_name, last_name, email));
    }

    @Override
    public void FindRoom() {
        System.out.println("FindRoom");
    }

    @Override
    public void CheckRoom() {
        System.out.println("CheckRoom");
    }

    @Override
    public User getCustom(String email) {
        return user.get(email);
    }

}
