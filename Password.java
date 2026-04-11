import java.util.Scanner;
import java.util.regex.*;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        System.out.println("Password: " + password);
        System.out.println("Strength: " + checkStrength(password));

        sc.close();
    }

    public static String checkStrength(String pass) {
        int score = 0;

        if (pass.length() >= 8) score++;
        if (Pattern.compile("[0-9]").matcher(pass).find()) score++;
        if (Pattern.compile("[a-z]").matcher(pass).find()) score++;
        if (Pattern.compile("[A-Z]").matcher(pass).find()) score++;
        if (Pattern.compile("[^a-zA-Z0-9]").matcher(pass).find()) score++;

        switch (score) {
            case 5: return "Very Strong";
            case 4: return "Strong";
            case 3: return "Medium";
            case 2: return "Weak";
            default: return "Very Weak";
        }
    }
}
