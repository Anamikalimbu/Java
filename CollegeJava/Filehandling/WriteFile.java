import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("example.txt");
            String text = "Hello, this is Java file handling!";
            fos.write(text.getBytes());
            fos.close();
            System.out.println("File written successfully.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
