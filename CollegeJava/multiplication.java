class MultiplyNumbers {

    // Instance method that accepts two integers and returns their multiplication
    int multiply(int a, int b) {
        int result = a * b;   // calculate multiplication
        return result;        // return result
    }
}

public class multiplication
{
    public static void main(String[] args) {

        // Create an object of the class
        MultiplyNumbers obj = new MultiplyNumbers();

        // Call the method with two integer values
        int product = obj.multiply(4, 7); // example: 4 * 7

        // Print the returned value
        System.out.println("Multiplication result: " + product);

    }
}
