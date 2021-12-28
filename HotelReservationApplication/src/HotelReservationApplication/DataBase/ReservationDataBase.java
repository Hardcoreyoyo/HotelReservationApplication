package HotelReservationApplication.DataBase;

import HotelReservationApplication.Model.ReservationModel;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ReservationDataBase {

    private static final ReservationDataBase reservationDataBase = new ReservationDataBase();
    private final Map<String, Collection<ReservationModel>> reservationModelMap = new HashMap<>();

    public static ReservationDataBase getReservationDataBase() {
        return reservationDataBase;
    }

    public Map<String, Collection<ReservationModel>> getReservationModelMap() {
        return reservationModelMap;
    }

    @Override
    public String toString() {
        return "ReservationDataBase{" +
                "reservationModelMap=" + reservationModelMap +
                '}';
    }

}
