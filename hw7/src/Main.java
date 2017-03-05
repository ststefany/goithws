import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

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
        User user10 = new User(2343589, "John", "Luid", "New-York79", 76);

        Order order1 = new Order(1, 0, Currency.USD, "Cola", "1", user1);
        Order order2 = new Order(14, 2587, Currency.UAH, "Pepsi", "2", user2);
        Order order3 = new Order(10, 243, Currency.USD, "Cola", "3", user3);
        Order order4 = new Order(15, 235, Currency.USD, "Spite", "4", user4);
        Order order5 = new Order(18, 423, Currency.USD, "Pizza", "0", user10);
        Order order6 = new Order(13, 0, Currency.UAH, "NOTHING I WANT NOTHING", "6", user6);
        Order order7 = new Order(165, 1023, Currency.UAH, "Ice-Cream", "7", user7);
        Order order8 = new Order(167, 456723, Currency.USD, "Fanta", "8", user8);
        Order order9 = new Order(187, 0, Currency.UAH, "Cola", "9", user9);
        Order order10 = new Order(18, 423, Currency.USD, "Pizza", "0", user10);

        //- sort list by Order price in decrease order
        List<Order> list = new ArrayList<Order>();
        list.add(order1);
        list.add(order2);
        list.add(order3);
        list.add(order4);
        list.add(order5);
        list.add(order6);
        list.add(order7);
        list.add(order8);
        list.add(order9);
        list.add(order10);

        list.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.equals(o2)) return 0;
                if (o1.getPrice() > o2.getPrice()) return -1;
                if (o1.getPrice() < o2.getPrice()) return 1;
                return 0;
            }
        });

        System.out.println(list);

        //- sort list by Order price in increase order AND User city
        list.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.equals(o2)) return 0;
                else if (o1.getPrice() != o2.getPrice()) return o1.getPrice() - o2.getPrice();
                else return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
        });

        System.out.println(list);


        //- sort list by Order itemName AND ShopIdentificator AND User city
        list.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.equals(o2)) return 0;
                else if (o1.getPrice() != o2.getPrice()) return o1.getPrice() - o2.getPrice();
                else if (!o1.getShopIdentificator().equals(o2.getShopIdentificator()))
                    return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                else return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
        });


        //- delete duplicates from the list

        for (int i = 0; i < list.size(); i++)
            if (list.indexOf(list.get(i)) - list.lastIndexOf(list.get(i)) != 0) list.remove(i);

        System.out.println(list);

        //- delete items where price less than 1500

        for (int i = 0; i < list.size(); i++)
            if (list.get(i).getPrice() < 1500) list.remove(i);

        System.out.println(list);

        //- separate list for two list - orders in USD and UAH
        List<Order> ordersUSD = new ArrayList<>();
        List<Order> ordersUAH = new ArrayList<>();

        for (Order i : list)
            if (i.getCurrency().equals(Currency.USD)) ordersUSD.add(i);
            else ordersUAH.add(i);

        System.out.println(ordersUAH);
        System.out.println(ordersUSD);

        //- separate list for as many lists as many unique cities are in User

        for (Order o : list) {
            if (isUnique(o.getUser(), list)) {
                new ArrayList<Order>().add(o);
                System.out.println(o);
            } else {
                System.out.println(oneCityOrders(o.getUser(), list));
                new ArrayList<>().addAll(oneCityOrders(o.getUser(), list));
            }
            ;
        }

    }


    static boolean isUnique(User user, List<Order> list) {
        int i = 0;
        for (Order j : list)
            if (user.getCity().equals(j.getUser().getCity())) i++;
        if (i > 1) return false;
        return true;
    }

    static ArrayList<Order> oneCityOrders(User user, List<Order> list) {
        ArrayList<Order> temp = new ArrayList<Order>();
        for (Order o : list)
            if (temp.contains(o) && list.lastIndexOf(o) != list.size() - 1) break;
            else if (user.getCity().equals(o.getUser().getCity())) temp.add(o);
        return temp;
    }

}
