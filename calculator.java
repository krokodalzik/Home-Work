package New_Krokodil;

import java.io.PrintWriter;
import java.io.Reader;
import java.util.Scanner;

public class calculator {
    public static void main(String[] arcs) {
        var str = ("Введите первое число");

        System.out.println(str);
        var scanner = new Scanner(System.in);
        var number1 = scanner.nextDouble();
        var ktr = ("Введите второе число");
        System.out.println(ktr);
        var number2 = scanner.nextDouble();
        var operatsiya = ("Введите номер оперции");
        System.out.println(operatsiya);
        var slog = ("1) Сложение");
        System.out.println(slog);
        var razn = ("2) Разность");
        System.out.println(razn);
        var umn = ("3) Умножение");
        System.out.println(umn);
        var del = ("4) Целочисленное деление");
        System.out.println(del);

        var krok = scanner.nextInt();
        switch (krok) {
            case 1:
                Double i = number1 + number2;
                System.out.println(i);
                break;
            case 2:
                Double d = number1 - number2;
                System.out.println(d);
                break;
            case 3:
                Double c = number1 * number2;
                System.out.println(c);
                break;
            case 4:
                Double m = number1 / number2;
                System.out.println(m);
                if (number2 > -1 && number2 < 1)
                    System.out.println("Ты ебалай?");
                break;
        }
    }
}


