package HotelReservationApplication.DataBase;

import HotelReservationApplication.Model.IRoom;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomDataBase that = (RoomDataBase) o;
        return room.equals(that.room);
    }

    @Override
    public int hashCode() {
        return Objects.hash(room);
    }

}
