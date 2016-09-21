import java.util.ArrayList;
import java.util.Date;

public class BookingComAPI implements API {

    private Room[] rooms = new Room[5];

    public BookingComAPI() {
        this.rooms = new Room[5];
        rooms[0] = new Room (149788, 10000, 2, new Date(), "NY city hotel", "NY");
        rooms[1] = new Room (149789, 700, 2, new Date(), "Hilton", "NY");
        rooms[2] = new Room (149790, 800, 3, new Date(), "Dublin", "NY");
        rooms[3] = new Room (149791, 1000, 2, new Date(), "Hilton", "LA");
        rooms[4] = new Room (149792, 90, 4, new Date(), "The cheapest hotel ever", "Paris");
    }

    @Override
    public ArrayList<Room> findRooms(int price, int persons, String hotel, String city) {
        DAOImpl db = new DAOImpl();
        Room room = new Room (price, persons, hotel, city);
        ArrayList<Room> match = new ArrayList<Room>();
        int a = 0;
        for (int i = 0; i < 5; i++) {
            if (room.equals(this.rooms[i])) {
                match.add(this.rooms[i]);
                db.save(this.rooms[i]);
                a++;
            }
        }
        if (a == 0)
            System.out.println("Sorry, no matches found at Booking.com");
        else
            for (int i = 0; i < match.size(); i++ )
                System.out.println(match.get(i));
        return match;
    }

    public Room[] getRooms() {
        return rooms;
    }
}
