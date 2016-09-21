import java.util.ArrayList;
import java.util.Date;

public class GoogleAPI implements API {

    private Room[] rooms = new Room[5];

    public GoogleAPI() {
        this.rooms = new Room[5];
        rooms[0] = new Room (1497885, 500, 2, new Date(), "NY city hotel", "NY");
        rooms[1] = new Room (1497886, 600, 2, new Date(), "Hilton", "NY");
        rooms[2] = new Room (1497887, 700, 3, new Date(), "Dublin", "NY");
        rooms[3] = new Room (1497888, 800, 2, new Date(), "Hilton", "LA");
        rooms[4] = new Room (1497889, 900, 4, new Date(), "The cheapest hotel ever", "Paris");
    }

    @Override
    public ArrayList<Room> findRooms(int price, int persons, String hotel, String city) {
        DAOImpl db = new DAOImpl();
        Room room = new Room (price, persons, hotel, city);
        ArrayList<Room> match = new ArrayList<Room>();
        int a = 0;
        for (int i = 0; i < 5; i++)
            if (room.equals(this.rooms[i])) {
                match.add(this.rooms[i]);
                db.save(this.rooms[i]);
                a++;
            }
        if (a == 0)
            System.out.println("Sorry, no matches found at Google");
        else
            for (int i = 0; i < match.size(); i++ )
                System.out.println(match.get(i));
        return match;
    }

    public Room[] getRooms() {
        return rooms;
    }
}
