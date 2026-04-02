import java.util.Scanner;

public class ExpectionHandling{
     public static void main(String[] args) {
         Scanner sc= new Scanner (System.in);
         try {
            System.out.print("Enter a number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter another number: ");
            int num2 = sc.nextInt();
            System.out.println("The division is: "+ (num1/num2));
             
         } catch (Exception e) {
            throw new ArrayIndexOutOfBoundsException();
            //System.out.println("Please enter a valid integer.");
         } finally{
            System.out.println("This block will always execute");
         }
            

         sc.close();
     }   
