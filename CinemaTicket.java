import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Read inputs from user
        // child, adult, senior
        System.out.print("Enter age group (child/adult/senior): ");
        String ageGroup = input.next().toLowerCase();  
        // nepali, hindi, english
        System.out.print("Enter movie language (nepali/hindi/english): ");
        String language = input.next().toLowerCase();           

        System.out.print("Are you a student? (yes/no): ");
        String studentAns = input.next().toLowerCase();        

        System.out.print("Is it a festival day? (yes/no): ");
        String festivalAns = input.next().toLowerCase();       

        double price = 0;

        // Base price by age
        if (ageGroup.equals("child")) {
            price = 150;
        } else if (ageGroup.equals("adult")) {
            price = 250;
        } else if (ageGroup.equals("senior")) {
            price = 200;
        } else {
            System.out.println("Invalid age group.");
            return;
        }

        //Surcharge by language
        if (language.equals("hindi")) {
            price += 50;
        } else if (language.equals("english")) {
            price += 100;
        } else if (language.equals("nepali")) {
            // no extra charge
        } else {
            System.out.println("Invalid movie language.");
            return;
        }

        // Student discount 20%
        if (studentAns.equals("yes")) {
            price = price - (price * 20 / 100.0);            
        }

        // Festival discount 15%
        if (festivalAns.equals("yes")) {
            price = price - (price * 15 / 100.0);             
        }

        // Final output
        System.out.println("Final ticket price: Rs. " + price);
        input.close();
    }
}
