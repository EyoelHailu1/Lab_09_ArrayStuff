import java.util.Scanner;

public class SafeInput {

    public static int getRangedInt(Scanner pipe, String prompt,
                                   int low, int high) {
        while (true) {
            System.out.print(prompt + " [" + low + "-" + high + "]: ");

            if (pipe.hasNextInt()) {
                int value = pipe.nextInt();
                pipe.nextLine();

                if (value >= low && value <= high) {
                    return value;
                }

                System.out.println(
                        "Please enter a number between " + low + " and " + high + ".");
            } else {
                System.out.println("Please enter a whole number.");
                pipe.nextLine();
            }
        }
    }
}