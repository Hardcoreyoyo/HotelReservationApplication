package HotelReservationApplication.Service.CustomerService;

import HotelReservationApplication.InterfaceApi.HotelResource;

public class CustomerService implements HotelResource {

    @Override
    public void Login() {
        System.out.println("Login");
    }

    @Override
    public void UserRegisteration() {
        System.out.println("UserRegisteration");
    }

    @Override
    public void FindRoom() {
        System.out.println("FindRoom");
    }

    @Override
    public void CheckRoom() {
        System.out.println("CheckRoom");
    }

}
