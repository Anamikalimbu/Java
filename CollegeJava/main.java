
class SumDigits {

    // Method to calculate and return sum of digits
    int sumOfDigits(int n) {
        int sum = 0;

        while(n > 0) {
            int digit = n % 10;   // get last digit
            sum = sum + digit;    // add to sum
            n = n / 10;           // remove last digit
        }

        return sum;
    }
}
public class main {
    public static void main(String[] args) {

        SumDigits obj = new SumDigits();

        int result = obj.sumOfDigits(3489);  // Example number

        System.out.println("Sum of digits: " + result);
    }
}
