import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// If numbers were passed on the command line, process them and exit
		if (args.length > 0) {
			for (String arg : args) {
				processInput(arg);
			}
			sc.close();
			return;
		}

		// Interactive mode
		System.out.println("Even or Odd Checker");
		System.out.println("Type an integer and press Enter to check. Type 'q' or 'quit' to exit.");

		while (true) {
			System.out.print("Enter a number (or 'q' to quit): ");
			String line = sc.nextLine().trim();
			if (line.equalsIgnoreCase("q") || line.equalsIgnoreCase("quit")) {
				System.out.println("Goodbye!");
				break;
			}
			processInput(line);
		}

		sc.close();
	}

	private static void processInput(String input) {
		try {
			long n = Long.parseLong(input);
			if (n % 2 == 0) {
				System.out.println(n + " is even.");
			} else {
				System.out.println(n + " is odd.");
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid input: '" + input + "' — please enter a valid integer.");
		}
	}
}
