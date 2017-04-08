import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

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

        System.out.println("List with items where price is not less than 1500: " + getPriceOver1500(list));
        System.out.println("List with no duplicates: " + deleteDuplicates(list));
        System.out.println("List without USD currency: " + deleteWhereUSD(list));
        System.out.println("Lists by currency, USD: " + listByCurrency(list, Currency.USD) + " and UAH:" + listByCurrency(list, Currency.UAH));
        System.out.println("Set of lists with orders in each unique city: ");
        createCitieslists(list).forEach(System.out::println);

        System.out.println("List sorted by Order price in decrease order: " + getDecreaseOrder(list));
        System.out.println("List sorted by Price in increasing order and User City: " + sortIncreasePriceAndCity(list));
        System.out.println("List sorted by Item name, Shop identifier and User City: " + sortItemAndShop(list));



    }


    //- sort list by Order price in decrease order
    private static List<Order> getDecreaseOrder(List<Order> list) {
        return list.stream().sorted((Order o1, Order o2) -> o2.getPrice().compareTo(o1.getPrice())).collect(Collectors.toList());
    }


    //- delete items where price less than 1500
    private static List<Order> getPriceOver1500(List<Order> list) {
        return list.stream().filter(n -> n.getPrice() >= 1500).collect(Collectors.toList());
    }

    //- delete duplicates from the list
    private static List<Order> deleteDuplicates(List<Order> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }

    //- delete orders where currency is USD
    private static List<Order> deleteWhereUSD(List<Order> list) {
        return list.stream().filter(o -> o.getCurrency() != Currency.USD).collect(Collectors.toList());
    }

    //- separate list for two list - orders in USD and UAH
    private static List<Order> listByCurrency(List<Order> list, Currency currency) {
        return list.stream().filter(o -> o.getCurrency() == currency).collect(Collectors.toList());
    }

    //- separate list for as many lists as many unique cities are in User
    private static Set<List<Order>> createCitieslists(List<Order> list) {

        Function<Order, List<Order>> f = (Order order) ->
                list.stream()
                        .filter((Order o) -> o.getUser().getCity().equals(order.getUser().getCity()))
                        .collect(Collectors.toList());

        return list.stream().map(f).collect(Collectors.toSet());
    }

    //- sort list by Order price in increase order AND User city
    private static List<Order> sortIncreasePriceAndCity(List<Order> list) {
        return list.stream().sorted((Order o1, Order o2) -> {
                    if (o1.equals(o2)) return 0;
                    else if (o1.getPrice() - o2.getPrice() != 0) return o1.getPrice().compareTo(o2.getPrice());
                    else return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                }
        ).collect(Collectors.toList());
    }

    //- sort list by Order itemName AND ShopIdentificator AND User city
    private static List<Order> sortItemAndShop(List<Order> list) {
        return list.stream().sorted((Order o1, Order o2) -> {
            if (o1.equals(o2)) return 0;
            else if (!o1.getItemName().equals(o2.getItemName())) return o1.getItemName().compareTo(o2.getItemName());
            else if (!o1.getShopIdentificator().equals(o2.getShopIdentificator()))
                return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            else return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        }).collect(Collectors.toList());
    }
}

