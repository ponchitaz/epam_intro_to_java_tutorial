package ponchitaz.io;

//TASK:Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// (( 𝑏 + √𝑏^2+4𝑎𝑐 ) / 2a) − 𝑎^3 * 𝑐 + 𝑏^(−2)

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        double a, b, c;
        try (Scanner scanner = new Scanner(System.in)) {
            String newLine = System.getProperty("line.separator");
            System.out.println("Now we're working on: ((B + {{sqrt| B^2 + 4AC}}) / 2A) - A^3 * C + B^(-2)" + newLine + "What numbers do we take here?" + newLine + "For A: ");
            a = Double.parseDouble(scanner.nextLine()); //parsing a string from user input to get a double
            System.out.println("Now for B: ");
            b = Double.parseDouble(scanner.nextLine());
            System.out.println("Finally for C: ");
            c = Double.parseDouble(scanner.nextLine());
            double z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
            System.out.println("And here we get: " + z);
        }
    }
}

