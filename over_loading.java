class Restaurant {
    // Order by item name & quantity
    void order(String itemName, int quantity) {
        System.out.println("Order placed: " + itemName + " x " + quantity);
    }

    // Order by combo code & quantity
    void order(int comboCode, int quantity) {
        System.out.println("Order placed: Combo #" + comboCode + " x " + quantity);
    }

    // Order by online ID & list of items
    void order(String orderId, String[] items) {
        System.out.println("Online Order ID: " + orderId);
        System.out.print("Items: ");
        for (String item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("Total items: " + items.length);
    }
}

public class RestaurantDemo {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        r.order("Burger", 2);
        r.order(101, 1);
        r.order("ORD123", new String[]{"Pizza", "Pasta", "Coke"});
    }
}
