package HotelReservationApplication.Model;

public class Room {

    private Double room_price;
    private Integer room_number;
    private RoomType roomType;

    public Room(Double room_price, Integer room_number, RoomType roomType) {
        this.room_price = room_price;
        this.room_number = room_number;
        this.roomType = roomType;
    }

}
