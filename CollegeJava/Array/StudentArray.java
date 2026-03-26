import java.util.Scanner;
public class StudentArray
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // String [] name = {"Asha","Ramesh","Sita","Binod","Sabita"};
        // name [4]="Smriti";
        // for(int i=0; i < name.length; i++){
            // System.out.println(name[i]);
        // }
        // System.out.println(name[2]);
        String [] name = new String[5];
        for(int i=0; i < name.length; i++){
           System.out.println("Enter a name:");
            name[i] = sc.nextLine();
        
        }
        for(String n: name){
            System.out.println(n);
        }
    }
}
