 class Menu {
     public String itemName;
     public String category;
     public double price;
     public boolean isVegetarian;
     public boolean isAvailable;

    public Menu(String itemName, double price, String category,
                boolean isVegetarian, boolean isAvailable) {

        this.itemName = itemName;
        this.price = price;
        this.category = category;
        this.isVegetarian = isVegetarian;
        this.isAvailable = isAvailable;
    }

    public String toString() {
        return "Item Name: " + itemName +
               "\nPrice: " + price +
               "\nCategory: " + category +
               "\nVeg food: " + (isVegetarian ? "Yes" : "No") +
               "\nAvailable status: " + (isAvailable ? "Yes" : "No");
    }

    void vegOnly() {
        if (isVegetarian) {
            System.out.println("Item Name: " + itemName);
            System.out.println("Price: " + price);
            System.out.println("Category: " + category);
            System.out.println("Available status: " + (isAvailable ? "Yes" : "No"));
            System.out.println();
        }
    }

    void nonVegOnly() {
        if (!isVegetarian) {
            System.out.println("Item Name: " + itemName);
            System.out.println("Price: " + price);
            System.out.println("Category: " + category);
            System.out.println("Available status: " + (isAvailable ? "Yes" : "No"));
            System.out.println();
        }
    }

    void nonVegOver100Available() {
        if (!isVegetarian && price > 100 && isAvailable) {
            System.out.println("Item Name: " + itemName);
            System.out.println("Price: " + price);
            System.out.println("Category: " + category);
            System.out.println("Available status: " + (isAvailable ? "Yes" : "No"));
            System.out.println();
        }
    }

    void vegUnder50Available() {
        if (isVegetarian && price < 50 && isAvailable) {
            System.out.println("Item Name: " + itemName);
            System.out.println("Price: " + price);
            System.out.println("Category: " + category);
            System.out.println("Available status: " + (isAvailable ? "Yes" : "No"));
            System.out.println();
        }
    }
}

public class KhanaGharMenu {
    public static void main(String[] args) {

        Menu mn1 = new Menu("Momo", 150.0, "Snacks", false, true);
        Menu mn2 = new Menu("Chowmein", 120.0, "Main Course", true, true);
        Menu mn3 = new Menu("Chicken Fried Rice", 90.0, "Main Course", false, false);
        Menu mn4 = new Menu("Chicken Curry", 200.0, "Main Course", false, true);
        Menu mn5 = new Menu("Spring Roll", 160.0, "Snacks", true, false);
        Menu mn6 = new Menu("Noodles", 110.0, "Main Course", true, true);
        Menu mn7 = new Menu("Salad", 40.0, "Appetizer", true, true);

        System.out.println(mn1 + "\n");
        System.out.println(mn2 + "\n");
        System.out.println(mn3 + "\n");
        System.out.println(mn4 + "\n");
        System.out.println(mn5 + "\n");
        System.out.println(mn6 + "\n");
        System.out.println(mn7 + "\n");

        System.out.println("===============================");
        System.out.println("Vegetarian Menu Items:");
        mn1.vegOnly();
        mn2.vegOnly();
        mn3.vegOnly();
        mn4.vegOnly();
        mn5.vegOnly();
        mn6.vegOnly();
        mn7.vegOnly();

        System.out.println("===============================");
        System.out.println("Non-Vegetarian Menu Items:");
        mn1.nonVegOnly();
        mn2.nonVegOnly();
        mn3.nonVegOnly();
        mn4.nonVegOnly();
        mn5.nonVegOnly();
        mn6.nonVegOnly();
        mn7.nonVegOnly();

        System.out.println("===============================");
        System.out.println("Non-Vegetarian Menu Items with price > 100 and Available:");
        mn1.nonVegOver100Available();
        mn2.nonVegOver100Available();
        mn3.nonVegOver100Available();
        mn4.nonVegOver100Available();
        mn5.nonVegOver100Available();
        mn6.nonVegOver100Available();
        mn7.nonVegOver100Available();

        System.out.println("===============================");
        System.out.println("Vegetarian Menu Items with price < 50 and Available:");
        mn1.vegUnder50Available();
        mn2.vegUnder50Available();
        mn3.vegUnder50Available();
        mn4.vegUnder50Available();
        mn5.vegUnder50Available();
        mn6.vegUnder50Available();
        mn7.vegUnder50Available();
    }
}
