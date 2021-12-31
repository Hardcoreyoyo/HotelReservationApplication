package HotelReservationApplication.Service.CustomerService;

import HotelReservationApplication.DataBase.UserDataBase;
import HotelReservationApplication.Model.IRoom;
import HotelReservationApplication.Model.ReservationModel;
import HotelReservationApplication.Model.User;

import java.util.Date;

public class CustomerService {

    private static final CustomerService customerService = new CustomerService();
    private static final UserDataBase userDataBase = UserDataBase.getUserDataBase();

    public static CustomerService getCustomerService(){
        return customerService;
    }

    public void UserRegisteration(String first_name, String last_name, String email) {
        userDataBase.getUser().put(email, new User(first_name, last_name, email));
    }


}