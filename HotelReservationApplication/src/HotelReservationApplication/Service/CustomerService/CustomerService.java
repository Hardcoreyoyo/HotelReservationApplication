package HotelReservationApplication.Service.CustomerService;

import HotelReservationApplication.Api.HotelResource;
import HotelReservationApplication.DataBase.UserDataBase;
import HotelReservationApplication.Model.IRoom;
import HotelReservationApplication.Model.ReservationModel;
import HotelReservationApplication.Model.User;

import java.util.Date;

public class CustomerService implements HotelResource {

    private static final CustomerService customerService = new CustomerService();
    private static final UserDataBase userDataBase = UserDataBase.getUserDataBase();

    public static CustomerService getCustomerService(){
        return customerService;
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
    public ReservationModel reserveARoom(User user, IRoom room, Date checkInDate, Date checkOutDate) {
        return null;
    }

    @Override
    public IRoom getRoom(String roomNumber) {
        return null;
    }


}