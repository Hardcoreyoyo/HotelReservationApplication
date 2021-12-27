package HotelReservationApplication.InterfaceApi;

import HotelReservationApplication.Dao.IRoom;
import HotelReservationApplication.Model.Room;
import HotelReservationApplication.Model.User;
import java.util.Collection;
import java.util.List;

public interface AdminResource {

    public User getUser(String email);

    public Collection<User> getAllUsers();

    public Collection<Room> getAllRooms();

    public void getReservations();

    public void addRoom(List<IRoom> rooms);

}
