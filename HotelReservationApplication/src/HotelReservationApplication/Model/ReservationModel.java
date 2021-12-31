package HotelReservationApplication.Model;

import java.util.Date;
import java.util.Objects;

public class ReservationModel {

    private User user;
    private IRoom iRoom;
    private Date ckeck_in_date;
    private Date ckeck_out_date;

    public ReservationModel(User user, IRoom iRoom, Date ckeck_in_date, Date ckeck_out_date) {
        this.user = user;
        this.iRoom = iRoom;
        this.ckeck_in_date = ckeck_in_date;
        this.ckeck_out_date = ckeck_out_date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public IRoom getiRoom() {
        return iRoom;
    }

    public void setiRoom(IRoom iRoom) {
        this.iRoom = iRoom;
    }

    public Date getCkeck_in_date() {
        return ckeck_in_date;
    }

    public void setCkeck_in_date(Date ckeck_in_date) {
        this.ckeck_in_date = ckeck_in_date;
    }

    public Date getCkeck_out_date() {
        return ckeck_out_date;
    }

    public void setCkeck_out_date(Date ckeck_out_date) {
        this.ckeck_out_date = ckeck_out_date;
    }

    @Override
    public String toString() {
        return "------------------ Reservations Data ----------\n" +
               "\n" +
               "First Name: " + user.getFirst_name() + "\n" +
               "Last Name: " + user.getLast_name() + "\n" +
               "Email: " + user.getEmail() + "\n" +
               "\n" +
               "Room Number: " + iRoom.getRoom_number() + "\n" +
               "Room Type: " + iRoom.getRoomType() + "\n" +
               "Room Price: " + iRoom.getRoom_price() + "\n" +
               "\n" +
               "Ckeck In Date: " + ckeck_in_date + "\n" +
               "Ckeck Out Date: " + ckeck_out_date + "\n" +
               "\n" +
               "-----------------------------------------------\n" +
               "\n" + "\n" + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservationModel that = (ReservationModel) o;
        return user.equals(that.user) && iRoom.equals(that.iRoom) && ckeck_in_date.equals(that.ckeck_in_date) && ckeck_out_date.equals(that.ckeck_out_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, iRoom, ckeck_in_date, ckeck_out_date);
    }

}
