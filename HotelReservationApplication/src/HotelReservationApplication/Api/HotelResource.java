package HotelReservationApplication.Api;

import HotelReservationApplication.Model.IRoom;
import HotelReservationApplication.Model.ReservationModel;
import HotelReservationApplication.Model.User;
import HotelReservationApplication.Service.AdminService.AdminService;
import HotelReservationApplication.Service.CustomerService.CustomerService;
import HotelReservationApplication.Service.ReservationService.ReservationService;

import java.util.Collection;
import java.util.Date;

public class HotelResource {

    private static final HotelResource hotelResource = new HotelResource();
    private static final AdminService adminService = AdminService.getAdminService();
    private static final ReservationService reservationService = ReservationService.getReservationService();
    private static final CustomerService customerService = CustomerService.getCustomerService();

    public static HotelResource getHotelResource(){
        return hotelResource;
    }

    public Collection<IRoom> findARoom(Date checkIn, Date checkOut){
        return reservationService.FindRooms(checkIn,checkOut);
    }

    public ReservationModel bookARoom(String customerEmail, IRoom room, Date checkInDate, Date checkOutDate) {
        return reservationService.reserveARoom(adminService.getUser(customerEmail), room, checkInDate, checkOutDate);
    }

    public IRoom getRoom(String roomNumber){
        return reservationService.getARoom(roomNumber);
    }

    public void createACustomer(String first_name, String last_name, String email){
        customerService.UserRegisteration(first_name, last_name, email);
    }

    public User getUser(String email){
        return adminService.getUser(email);
    }

    public Collection<ReservationModel> getUserReservations(String email){
        return adminService.getUserReservations(email);
    }

    public Collection<IRoom> RecommandRoom(Date checkIn, Date checkOut){
        return reservationService.getRecommandRoom(checkIn, checkOut);
    }







}
