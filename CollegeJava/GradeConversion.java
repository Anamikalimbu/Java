import java.util.Scanner;
public class GradeConversion
{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter GPA (0.0 to 4.0):");
        double gpa = sc.nextDouble();
        String grade;
        if(gpa>=3.6 && gpa<=4.0){
            grade ="A+";
        }
        else if (gpa>=3.2 && gpa < 3.6){
            grade ="A";
        }
        else if (gpa>=2.8 && gpa <3.2){
            grade ="B+";
        }
        else if (gpa>=2.4 && gpa< 2.8){
            grade ="B";
        }
        else if (gpa>=2.0 && gpa<2.4){
            grade ="C+";
        }
        else if (gpa>=1.6 && gpa<2.0){
            grade ="C";
        }
        else if (gpa >=1.4 && gpa<1.6){
            grade="D+";
        }
        else if (gpa>=0.0 && gpa <1.4){
            grade="NG";
        }
        else {
            grade="Invalid GPA";
        }
        System.out.println("Grade: " +grade);
    }
}
