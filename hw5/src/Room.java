/*ЗАДАНИЕ 1

Class Room should contain fields

long id
int price
int persons
Date dateAvailableFrom
String hotelName
String cityName

Generate getters and setters. And create constructor with all fields.

ЗАДАНИЕ 2

Override equals and hashCode methods. Rooms are equal when price, persons and cityName are equal.*/


import java.util.Date;

public class Room {

    private long id;
    private int price;
    private int persons;
    private Date dateAvailableFrom;
    private String hotelName;
    private String cityName;

    public Room(long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    public Room(int price, int persons, String hotelName, String cityName) {
        this.price = price;
        this.persons = persons;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    public Room(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        if (((Room) o).getId() == this.getId()) return true;
        if (getPrice() != room.getPrice()) return false;
        if (getPersons() != room.getPersons()) return false;
        return getCityName().equals(room.getCityName());

    }

    @Override
    public int hashCode() {
        int result = 87*getPrice();
        result = 31 * result + getPersons();
        result = 31 * result + getCityName().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Room " +
                "ID: " + id +
                " is AvailableFrom " + dateAvailableFrom +
                " at " + hotelName + '\'' +
                " in '" + cityName + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
