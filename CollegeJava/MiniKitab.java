public class MiniKitab {
    public static void main(String[] args) {

        // Categories
        String[] categories = {"Fiction", "Nepali"};

        // 2 categories × 1 book each
        String[][] titles = new String[2][1];
        double[][] prices = new double[2][1];

        // Put one title and price for each category
        titles[0][0] = "Asahamati - 5";
        prices[0][0] = 750.0;

        titles[1][0] = "Karnali Blues";
        prices[1][0] = 650.0;

        double total = 0.0;

        // Print each category, its title and price
        System.out.println("Mini Kitab Corner:");
        for (int i = 0; i < categories.length; i++) {
            for (int j = 0; j < 1; j++) {   // 1 book per category
                String title = titles[i][j];
                if (title == null) {        // safety check for null [web:17]
                    title = "[no title]";
                }
                double price = prices[i][j];
                total += price;

                // Format price to 2 decimals using printf %.2f [web:23][web:26]
                System.out.printf("%s: %s - Rs %.2f%n",
                        categories[i], title, price);
            }
        }

        // Print total value
        System.out.printf("Total value: Rs %.2f%n", total);  // 2 decimal places [web:24][web:25]
    }
}
