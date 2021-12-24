package HotelReservationApplication.Model;

public class FreeRoom extends Room {

    private Double room_price;

    public FreeRoom(Double room_price, Integer room_number, RoomType roomType) {
        super(room_price, room_number, roomType);
        this.room_price = 0.0;
    }

}
