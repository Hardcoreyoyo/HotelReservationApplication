package HotelReservationApplication.Api;

import HotelReservationApplication.Model.IRoom;
import HotelReservationApplication.Model.ReservationModel;
import HotelReservationApplication.Model.User;

import java.util.Collection;
import java.util.List;

public interface AdminResource {

    public User getUser(String email);

    public Collection<User> getAllUsers();

    public Collection<IRoom> getAllRooms();

    public Collection<ReservationModel> getReservations(String email);

    public void addRoom(List<IRoom> rooms);

    public void displayAllReservations();

}
