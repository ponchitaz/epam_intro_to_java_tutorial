package ponchitaz.io;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//(𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦) / (𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦) ∗ 𝑡𝑔(𝑥𝑦)

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        double x, y;
        try (Scanner scanner = new Scanner(System.in)) {
            String newLine = System.getProperty("line.separator");
            System.out.println("Here is another one: (sinX + cosY) / (cosX - sinY) * tg(x * y)" + newLine + "What numbers for this one?" + newLine + "For X: ");
            x = Double.parseDouble(scanner.nextLine()); //parsing a string from user input to get a double
            System.out.println("Now for Y: ");
            y = Double.parseDouble(scanner.nextLine());
            double z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(Math.toRadians(x * y));
            System.out.println("And the answer is: " + z);
        }
    }
}
