package HotelReservationApplication.Service.AdminService;

import HotelReservationApplication.InterfaceApi.AdminResource;

public class AdminService implements AdminResource {

    @Override
    public void getCustom() {
        System.out.println("getCustom");
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
