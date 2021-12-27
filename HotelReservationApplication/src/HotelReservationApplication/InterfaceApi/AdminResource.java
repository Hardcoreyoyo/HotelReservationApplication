package HotelReservationApplication.InterfaceApi;

import HotelReservationApplication.Model.RoomType;
import HotelReservationApplication.Model.User;

public interface AdminResource {

    public void getAllUser();

    public void getAllRoom();

    public void getReservations();

    public void addRoom(Double room_price, Integer room_number, RoomType roomType);

}
