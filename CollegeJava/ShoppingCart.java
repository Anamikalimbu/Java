import java.time.LocalDate;
// Base class
class NepaliProduct {
    public String productId;
    public String name;
    public double price;
    public String manufacturerLocation;

    // Constructor
    NepaliProduct(String productId, String name, double price, String manufacturerLocation) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.manufacturerLocation = manufacturerLocation;
    }

    // Display product info
    public void displayInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Manufacturer Location: " + manufacturerLocation);
    }

    // Calculate total price (default with no VAT)
    public double calculateTotalPrice() {
        return price;
    }
}

class HandicraftProduct extends NepaliProduct {
    String artisanName;
    String craftType;
    String culturalSignificance;

    HandicraftProduct(String productId, String name, double price, String manufacturerLocation,
                      String artisanName, String craftType, String culturalSignificance) {
        super(productId, name, price, manufacturerLocation);
        this.artisanName = artisanName;
        this.craftType = craftType;
        this.culturalSignificance = culturalSignificance;
    }

    // Override: no VAT for handicrafts
    @Override
    public double calculateTotalPrice() {
        return price; // no extra charges
    }

    public boolean isCulturallySignificant() {
        return culturalSignificance != null && !culturalSignificance.isEmpty();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Artisan Name: " + artisanName);
        System.out.println("Craft Type: " + craftType);
        System.out.println("Cultural Significance: " + culturalSignificance);
    }
}

class FoodProduct extends NepaliProduct {
    LocalDate expiryDate;
    String ingredients;
    boolean isOrganic;
    String certifiedBy;

    FoodProduct(String productId, String name, double price, String manufacturerLocation,
                LocalDate expiryDate, String ingredients, boolean isOrganic, String certifiedBy) {
        super(productId, name, price, manufacturerLocation);
        this.expiryDate = expiryDate;
        this.ingredients = ingredients;
        this.isOrganic = isOrganic;
        this.certifiedBy = certifiedBy;
    }

    // Override: add 5% VAT
    @Override
    public double calculateTotalPrice() {
        return price * 1.05;
    }

    public boolean isExpiringSoon() {
        return LocalDate.now().plusDays(7).isAfter(expiryDate); // expires in 7 days
    }

    public boolean isLocallySourced() {
        return manufacturerLocation.equalsIgnoreCase("Nepal");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Ingredients: " + ingredients);
        System.out.println("Organic: " + isOrganic);
        System.out.println("Certified By: " + certifiedBy);
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        // Handicraft Product
        HandicraftProduct h1 = new HandicraftProduct("H101", "Dhaka Topi", 1500, "Kathmandu",
                "Ram Bahadur", "Weaving", "Traditional Nepali hat");

        // Food Product
        FoodProduct f1 = new FoodProduct("F201", "Organic Honey", 800, "Chitwan",
                LocalDate.of(2026, 1, 20), "Honey", true, "Nepal Organic Cert");

        // Display products
        System.out.println("----Handicraft Product----");
        h1.displayInfo();
        System.out.println("Total Price: " + h1.calculateTotalPrice());
        System.out.println("Culturally Significant? " + h1.isCulturallySignificant());

        System.out.println("\n----Food Product----");
        f1.displayInfo();
        System.out.println("Total Price (with VAT): " + f1.calculateTotalPrice());
        System.out.println("Expiring Soon? " + f1.isExpiringSoon());
        System.out.println("Locally Sourced? " + f1.isLocallySourced());
    }
}

