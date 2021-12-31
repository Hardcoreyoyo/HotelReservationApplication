package HotelReservationApplication.DataBase;

import HotelReservationApplication.Model.User;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDataBase that = (UserDataBase) o;
        return user.equals(that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }

}
