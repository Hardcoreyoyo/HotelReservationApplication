package HotelReservationApplication.Dao;

import HotelReservationApplication.Model.RoomType;

public interface IRoom {

    public String getRoomNumber();

    public Double getRoomPrice();

    public RoomType getRoomType();

    public boolean isFree();

}
