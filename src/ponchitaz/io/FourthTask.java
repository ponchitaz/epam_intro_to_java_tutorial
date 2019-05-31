package ponchitaz.io;

// Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        //String rawInput;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number like nnn.bbb: ");
            String rawInput = scanner.nextLine();
            System.out.println("So the number is: " + rawInput);  //test the input

            //List<String> firstPart = new ArrayList<>(Arrays.asList(rawInput.split(".")));
            String[] parsedArray = rawInput.split(".");

            System.out.println(parsedArray);

            //System.out.println("After the magic is done we get: " + parsedArray[1] + "." + parsedArray[0]);
            //System.out.println("After the magic is done we get: " + Array.get(parsedArray, 1) + "." + Array.get(parsedArray, 0));

            //char[] inputAsList = rawInput.toCharArray();
            //ArrayList<String> inputAsList = new ArrayList<String>();
            //for element in rawInput

            //int thatDouble = rawInput.length();

            //char[] firstPart;
            //char[] secondPart;
//            int i, j;
//
//            StringBuilder firstPart=new StringBuilder();
//
//            for (i = 0; i < thatDouble; i++) {
//                for (char i:inputAsList){
//                    while (inputAsList[i] != '.'){
//                        firstPart.append(inputAsList[i]);
//                    }
//                else {
//                    break;
//                }
            }
//            for (j = thatDouble + 1; j < thatDouble; j--) {
//                if (b[j] != '.'){
//                    char[] secondPart.add(b[j]);
//                }
//                else {
//                    break;
//                }
//            }

            //double d = Double.parseDouble(b);
        //}

    }
}
