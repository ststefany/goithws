/*
Create Main class where you create 10 Orders with 10 Users and put it to the TreeSet. You should create 8 unique and two duplicated Orders

- check if set contain Order where User’s lastName is - “Petrov”
- print Order with largest price using only one set method - get
- delete orders where currency is USD using Iterator
 */

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {

    public static void main(String[] args) {
        User user1 = new User(23435, "John", "Luid", "LA", 2000);
        User user2 = new User(234356, "John", "0101", "New-York3", 90000);
        User user3 = new User(234357, "John", "Frank", "New-York6", 90000);
        User user4 = new User(234358, "John", "Luid", "New-York5", 90000);
        User user5 = new User(234359, "John", "MAAAAAAAAAAAARK", "New-York789", 90000);
        User user6 = new User(2343523, "Colly", "Luid", "LA", 5751);
        User user7 = new User(2343524, "John", "Luid", "New-York3", 20575);
        User user8 = new User(2343525, "John", "Marry", "New-York2", 1575);
        User user9 = new User(2343528, "Holly", "Luid", "AA", 575);
        User user10 = new User(2343589, "John", "Petrov", "New-York79", 76);

        Order order1 = new Order(1, 0, Currency.USD, "Cola", "1", user1);
        Order order2 = new Order(14, 2587, Currency.UAH, "Pepsi", "2", user2);
        Order order3 = new Order(10, 243, Currency.USD, "Cola", "3", user3);
        Order order4 = new Order(15, 235, Currency.USD, "Spite", "4", user4);
        Order order5 = new Order(1, 0, Currency.USD, "Cola", "1", user1);
        Order order6 = new Order(13, 0, Currency.UAH, "NOTHING I WANT NOTHING", "6", user6);
        Order order7 = new Order(165, 1023, Currency.UAH, "Ice-Cream", "7", user7);
        Order order8 = new Order(167, 456723, Currency.USD, "Fanta", "8", user8);
        Order order9 = new Order(187, 0, Currency.UAH, "Cola", "9", user9);
        Order order10 = new Order(18, 423, Currency.USD, "Pizza", "0", user10);


        Set<Order> orders = new TreeSet<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);
        orders.add(order6);
        orders.add(order7);
        orders.add(order8);
        orders.add(order9);
        orders.add(order10);

        System.out.println(orders.size());


        //- check if set contain Order where User’s lastName is - “Petrov”
        boolean n = false;
        for (Order o : orders)
            if (o.getUser().getLastName().equals("Petrov"))
                n = true;
        if (n == true)
            System.out.println("Petrov в наличии");
        else System.out.println("Нет такого");


        //- print Order with largest price using only one set method - get
        int largestPrice = 0;
        for (Order o : orders) {
            if (o.getPrice() > largestPrice) largestPrice = o.getPrice();
        }
        System.out.println("Наибольшая цена - " + largestPrice);


        //- delete orders where currency is USD using Iterator

        Iterator<Order> iter = orders.iterator();

        while (iter.hasNext())
            if (iter.next().getCurrency() == Currency.USD) iter.remove();

        System.out.print(orders);

    }
}
