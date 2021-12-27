package HotelReservationApplication.DataBase;

import HotelReservationApplication.Model.User;
import java.util.HashMap;
import java.util.Map;

public class UserDataBase {

    private static final UserDataBase userDataBase = new UserDataBase();

    private final Map<String, User> user = new HashMap<>();

    public static UserDataBase getUserDataBase() {
        return userDataBase;
    }

    public Map<String, User> getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "UserDataBase{" +
                "user=" + user +
                '}';
    }
}
