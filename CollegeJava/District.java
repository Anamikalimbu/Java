import java.util.Scanner;
public class District
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String [] districts = new String [5];
        int j =1;
        for(int i=0; i < districts.length; i++){
           System.out.println("Enter a districts "+(i+1));
            districts[i] = sc.nextLine();
 
        }
        for(String d : districts){
        System.out.println( j + " " + d);
        j++;
    }
    }
}
