package HotelReservationApplication.Service.CustomerService;

import HotelReservationApplication.InterfaceApi.HotelResource;
import HotelReservationApplication.DataBase.UserDataBase;
import HotelReservationApplication.Model.User;

public class CustomerService implements HotelResource {

    private final UserDataBase userDataBase = UserDataBase.getUserDataBase();

    @Override
    public void Login() {
        System.out.println("Login");
    }

    @Override
    public void UserRegisteration(String first_name, String last_name, String email) {
        userDataBase.getUser().put(email, new User(first_name, last_name, email));
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
        return userDataBase.getUser().get(email);
    }

}



//    private static CustomerService customerService = new CustomerService();

//    public static CustomerService getCustomerService(){
//        return customerService;
//    }