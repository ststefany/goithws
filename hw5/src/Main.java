/*You need to create part of the System that can find hotel rooms for booking and save it to DataBase.
The architecture is: class Room which represent room entity that is used in system.
Interface API and three implementations of it. DAO interface with its implementation.
And finally Controller that will contain all the logic. Also create Main class with main method to demonstrate results.

Create UML diagrams first, and only after this write code.

ЗАДАНИЕ 7

In Main class method just create Controller and make three requests with different parameters to find rooms.
Also, all check methods three times with different apis to demonstrate how programs works.
*/

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        GoogleAPI google = new GoogleAPI();
        BookingComAPI booking = new BookingComAPI();
        TripAdviserAPI trip = new TripAdviserAPI();

        controller.requestRooms(700, 3, "Dublin", "NY");
        System.out.println();
        controller.requestRooms(924, 3, "NY", "NY");
        System.out.println();
        controller.requestRooms(500, 2, "NY city hotel", "NY");
        System.out.println();

        controller.check(google, booking);
        controller.check(google, trip);
        controller.check(trip, booking);
    }
}
