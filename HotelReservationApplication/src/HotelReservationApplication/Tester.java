package HotelReservationApplication;

import HotelReservationApplication.Model.User;

public class Tester {

    public static void main(String[] args) throws Exception {

        try {
            User user1 = new User("first1", "second1", "test1@test.com");
            User user2 = new User("first2", "second2", "test2@test.com");
            User user3 = new User("first3", "second3", "test3@test.com");
            User user4 = new User("first4", "second4", "test4@test.com");
            User user5 = new User("first5", "second5", "test5@test.com");
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }

    }

}
