package HotelReservationApplication.InterfaceApi;

import HotelReservationApplication.Model.User;

public interface HotelResource {

    public void Login();

    public void UserRegisteration(String first_name, String last_name, String email);

    public void FindRoom();

    public void CheckRoom();

    public User getCustom(String email);

}
