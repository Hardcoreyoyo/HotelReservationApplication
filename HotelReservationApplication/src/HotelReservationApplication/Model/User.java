package HotelReservationApplication.Model;

import java.util.regex.Pattern;

public class User {

    private String first_name;
    private String last_name;
    private String email;

    public User(String first_name, String last_name, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\n" +
               "First Name: " + first_name + "\n" +
               "Last Name: " + last_name + "\n" +
               "Email: " + email + "\n" +
               "\n";
    }

}
