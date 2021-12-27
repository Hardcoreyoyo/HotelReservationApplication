package HotelReservationApplication.InterfaceApi;

import HotelReservationApplication.Model.User;

public interface AdminResource {

    public User getCustom(String email);

    public void getRoom();

    public void getReservations();

    public void addRoom();

}
