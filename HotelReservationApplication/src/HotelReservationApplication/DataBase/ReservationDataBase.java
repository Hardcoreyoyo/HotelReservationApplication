package HotelReservationApplication.DataBase;

import HotelReservationApplication.Model.ReservationModel;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservationDataBase that = (ReservationDataBase) o;
        return reservationModelMap.equals(that.reservationModelMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reservationModelMap);
    }

}
