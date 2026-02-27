import java.util.Scanner;
public class GradeEvaluator
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade:\n");
        int grade = sc.nextInt();
        var check = (grade >= 40) ? "Pass" : "Fail";
        System.out.println(check);
    }
}