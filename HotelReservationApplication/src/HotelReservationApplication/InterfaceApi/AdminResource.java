package HotelReservationApplication.InterfaceApi;

import HotelReservationApplication.Model.Room;
import HotelReservationApplication.Model.RoomType;
import HotelReservationApplication.Model.User;
import java.util.Collection;

public interface AdminResource {

    public User getUser(String email);

    public Collection<User> getAllUsers();

    public Collection<Room> getAllRooms();

    public void getReservations();

    public void addRoom(Double room_price, String room_number, RoomType roomType);

}
