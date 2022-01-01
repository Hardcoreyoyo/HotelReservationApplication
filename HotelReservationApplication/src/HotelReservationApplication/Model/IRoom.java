package HotelReservationApplication.Model;

public interface IRoom {

    public String getRoom_number();

    public Double getRoom_price();

    public RoomType getRoomType();

    public boolean isFree();

}
