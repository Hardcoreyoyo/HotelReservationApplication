package HotelReservationApplication.Api;

import HotelReservationApplication.Model.IRoom;
import HotelReservationApplication.Model.User;
import HotelReservationApplication.Service.AdminService.AdminService;
import java.util.Collection;
import java.util.List;

public class AdminResource {

    private static final AdminResource adminResource = new AdminResource();
    private static final AdminService adminService = AdminService.getAdminService();

    public static AdminResource getAdminResource(){
        return adminResource;
    }

    public User getUser(String email){
        return adminService.getUser(email);
    }

    public Collection<User> getAllUser(){
        return adminService.getAllUsers();
    }

    public void addRoom(List<IRoom> rooms){
        adminService.addRoom(rooms);
    }

    public Collection<IRoom> getAllRooms(){
        return adminService.getAllRooms();
    }

    public void displayAllReservations(){
        adminService.printAllReservation();
    }

}
