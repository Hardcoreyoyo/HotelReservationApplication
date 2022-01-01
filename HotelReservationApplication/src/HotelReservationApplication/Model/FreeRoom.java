package HotelReservationApplication.Model;

public class FreeRoom extends Room {

    public FreeRoom(Double room_price, String room_number, RoomType roomType) {
        super(0.0, room_number, roomType);
    }

    @Override
    public String toString() {
        return "\n" +
                "-------- Free Room --------" + "\n" +
                super.toString() +
                "\n";
    }

}
