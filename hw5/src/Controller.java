/*ЗАДАНИЕ 6

Create Controller class. It contains global variable
API apis[] = new API[3];
which contains all implementations of API interface.
Also, controller contains two methods
Room[] requstRooms(int price, int persons, String city, String hotel)
which finds all the rooms with requested params. Method use all apis available to make search.
Found rooms create to DB

Room[] check(API api1, API api2)
Check how many the same rooms two different apis return*/

import java.util.ArrayList;

public class Controller {
    private int a = 3;
    private API[] apis = new API[a];

    public Controller() {
        this.apis[0] = new GoogleAPI();
        this.apis[1] = new TripAdviserAPI();
        this.apis[2] = new BookingComAPI();
    }

    public ArrayList<ArrayList<Room>> requestRooms(int price, int persons, String city, String hotel) {
        ArrayList<ArrayList<Room>> requested = new ArrayList<>();
        for (int i = 0; i < a; i++)
            requested.add(this.apis[i].findRooms(price, persons, city, hotel));
        return requested;
    }


    public ArrayList<Room> check(API a1, API a2) {
        ArrayList<Room> checked = new ArrayList<>();
        int count = 0;
        Room[] rooms = a1.getRooms();
        Room[] rooms1 = a2.getRooms();
        for (int i = 0; i < 5; i++)
            for (int a = 0; a < 5; a++) {
                if (rooms[a].equals(rooms1[i])) {
                    checked.add(rooms[a]);
                    count++;
                }
            }
        System.out.println(count);
        return checked;
    }


}
