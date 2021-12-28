package HotelReservationApplication.Model;

import java.util.Date;

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

    public IRoom getRoom() {
        return this.iRoom;
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
}
