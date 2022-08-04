package Fak;

import java.util.Random;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] arcs) {
        var scanner = new Scanner(System.in);

        var number = scanner.nextInt();
        var rez = 1L;
        if (number > 20) {
            System.out.println("Ты ввел слишком большое число");
        } else {
            for (int i = 1; i <= number; i += 1) {
                rez *= i;
            }
            System.out.println(rez);
        }
    }
}



