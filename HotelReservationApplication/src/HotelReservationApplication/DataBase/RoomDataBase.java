package HotelReservationApplication.DataBase;

import HotelReservationApplication.Model.IRoom;
import HotelReservationApplication.Model.Room;
import java.util.HashMap;
import java.util.Map;

public class RoomDataBase {

    private static final RoomDataBase roomDataBase = new RoomDataBase();
    private final Map<String, IRoom> room = new HashMap<>();

    public static RoomDataBase getRoomDataBase() {
        return roomDataBase;
    }

    public Map<String, IRoom> getRoom() {
        return room;
    }

    @Override
    public String toString() {
        return "UserDataBase{" +
                "user=" + room +
                '}';
    }

}
