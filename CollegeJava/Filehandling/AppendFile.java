import java.io.*;

public class AppendFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("example.txt", true); // true → append
            fw.write("\nThis line is appended in Java!");
            fw.close();
            System.out.println("Data appended.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
