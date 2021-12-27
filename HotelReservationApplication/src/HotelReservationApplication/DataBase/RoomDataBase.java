package HotelReservationApplication.DataBase;

import HotelReservationApplication.Model.Room;
import java.util.HashMap;
import java.util.Map;

public class RoomDataBase {

    private static final RoomDataBase roomDataBase = new RoomDataBase();

    private final Map<Integer, Room> room = new HashMap<>();

    public static RoomDataBase getRoomDataBase() {
        return roomDataBase;
    }

    public Map<Integer, Room> getRoom() {
        return room;
    }

    @Override
    public String toString() {
        return "UserDataBase{" +
                "user=" + room +
                '}';
    }

}