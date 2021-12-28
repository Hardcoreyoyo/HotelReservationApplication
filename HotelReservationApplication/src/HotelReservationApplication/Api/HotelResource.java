package HotelReservationApplication.Api;

import HotelReservationApplication.Model.IRoom;
import HotelReservationApplication.Model.ReservationModel;
import HotelReservationApplication.Model.User;

import java.util.Date;

public interface HotelResource {

    public void UserRegisteration(String first_name, String last_name, String email);

    public void FindRoom();

    public void CheckRoom();

    public ReservationModel reserveARoom(User user, IRoom room, Date checkInDate, Date checkOutDate);

    public IRoom getRoom(String roomNumber);

}
