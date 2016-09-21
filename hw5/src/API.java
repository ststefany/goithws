/*ЗАДАНИЕ 3

Create API interface which contains one method

Room[] findRooms(int price, int persons, String city, String hotel)

ЗАДАНИЕ 4

Create three implementations of API called: BookingComAPI, TripAdvisorAPI, GoogleAPI.
 very implementation has global variable Rooms[] rooms which must be initialized in empty constructor with 5 differentRooms.

*/

import java.util.ArrayList;

public interface API {

    ArrayList<Room> findRooms(int price, int persons, String city, String hotel);
    Room[] getRooms();
}
