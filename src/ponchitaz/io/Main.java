package ponchitaz.io;

//TASK: Найдите значениефункции:z=((a–3)*b/2)+c

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        double a, b, c;
        try (Scanner scanner = new Scanner(System.in)) {
            String newLine = System.getProperty("line.separator");
            System.out.println("So we're working on: Z = ((A – 3) * B / 2)." + newLine + "What numbers do we take?" + newLine + "For A: ");
            a = Double.parseDouble(scanner.nextLine()); //parsing a string from user input to get a double
            System.out.println("Now for B: ");
            b = Double.parseDouble(scanner.nextLine());
            System.out.println("Finally for C: ");
            c = Double.parseDouble(scanner.nextLine());
            double z = ((a-3)*b/2)+c;
            System.out.println("And so we get the result: " + z);
        }
    }
}
