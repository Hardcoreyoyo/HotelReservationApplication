package HotelReservationApplication.Service.AdminService;

import HotelReservationApplication.InterfaceApi.AdminResource;
import HotelReservationApplication.Model.User;
//import HotelReservationApplication.Model.UserDataBase;

public class AdminService implements AdminResource {

//    UserDataBase userDataBase = new UserDataBase();

    @Override
    public User getCustom(String email) {
//        return userDataBase.getUser().get(email);
        return null;
    }

    @Override
    public void getRoom() {
        System.out.println("getRoom");
    }

    @Override
    public void getReservations() {
        System.out.println("getReservations");
    }

    @Override
    public void addRoom() {
        System.out.println("addRoom");
    }

}
