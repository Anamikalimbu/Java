import java.util.Scanner;

public class AgeExpection {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            if (age < 18 ){
                throw new Exception("Age must be 18 or above to vote");
            }
            else {
                System.out.println("You are eligible for voting");
            }
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally{
            System.out.println("Good");
        }
    }
}
