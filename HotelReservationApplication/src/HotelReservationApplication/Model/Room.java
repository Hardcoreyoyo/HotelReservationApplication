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

    public Double getRoom_price() {
        return room_price;
    }

    public void setRoom_price(Double room_price) {
        this.room_price = room_price;
    }

    public Integer getRoom_number() {
        return room_number;
    }

    public void setRoom_number(Integer room_number) {
        this.room_number = room_number;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "Room{" +
                "room_price=" + room_price +
                ", room_number=" + room_number +
                ", roomType=" + roomType +
                '}';
    }

}
