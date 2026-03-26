import java.util.Scanner;
public class MyFriends
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name:");
        String name = sc.nextLine();
        String[] friend = {"Prajuna","Rebika","Jharna","Alishma","Gaurav","Smriti"};
        friend[3]="Ragita";
        friend[4] = name;
        for(String s: friend){
            System.out.println(s);
        }
    }
}
