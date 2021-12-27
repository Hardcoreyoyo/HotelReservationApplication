package HotelReservationApplication.Model;

import HotelReservationApplication.Dao.IRoom;

public class Room implements IRoom {

    private final Double room_price;
    private final String room_number;
    private final RoomType roomType;

    public Room(Double room_price, String room_number, RoomType roomType) {
        this.room_price = room_price;
        this.room_number = room_number;
        this.roomType = roomType;
    }

    @Override
    public String getRoom_number() {
        return this.room_number;
    }

    @Override
    public Double getRoom_price() {
        return this.room_price;
    }

    @Override
    public RoomType getRoomType() {
        return this.roomType;
    }

    @Override
    public boolean isFree() {
        return this.room_price != null && this.room_price.equals(0.0);
    }

    @Override
    public String toString() {
        return "\n" +
                "Room Number: " + room_number + "\n" +
                "Room Type: " + room_price + "\n" +
                "Room Price: " + roomType + "\n" +
                "\n";
    }


}
