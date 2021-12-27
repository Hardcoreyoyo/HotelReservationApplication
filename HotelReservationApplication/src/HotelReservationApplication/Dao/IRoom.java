package HotelReservationApplication.Dao;

import HotelReservationApplication.Model.RoomType;

public interface IRoom {

    public String getRoom_number();

    public Double getRoom_price();

    public RoomType getRoomType();

    public boolean isFree();

}
