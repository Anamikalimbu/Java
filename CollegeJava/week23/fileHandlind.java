
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class fileHandling {
    public static void main(String[] args) {
        File file = new File("MyRule.txt"); 
        //Creating new file
        try {
            if (file.exists()) {
                System.out.println("File already exists.");
            } else {
                System.out.println("File does not exist. Creating a new file...");
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
                
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Hello world, I am learning file handling in Java.");
            writer.close();
        } catch (IOException e) {
            System.out.println("Something went wrong while writing to the file.");
        }

        try {
            FileReader reader = new FileReader(file);
            Scanner sc = new Scanner(reader);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Something went wrong while reading the file.");
        }

        // try{
        //     if(file.exists()){
        //         System.out.println("File exists.");
        //         file.delete();
        //     } else {
        //         System.out.println("File does not exist.");
        //     }
        // } catch (Exception e) {
        //     System.out.println("Something went wrong while deleting the file.");
        // }
        
    }
}
