import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int a, b, c, sıralma, first, second, third;
        out.print("ütfen 1. sayıyı giriniz : ");
        a = input.nextInt();
        out.print("ütfen 2. sayıyı giriniz : ");
        b = input.nextInt();
        out.print("ütfen 3. sayıyı giriniz : ");
        c = input.nextInt();

        if (a > b && a > c) {
            if (b > c) out.print(a + ">" + b + ">" + c);
            else out.print(a + ">" + c + ">" + b);
        }
        if (b > a && b > c) {
            if (a > c) out.print(b + ">" + a + ">" + c);
            else out.print(b + ">" + a + ">" + c);
        }
        if (c > a && c > b) {
            if (b > a) out.print(c + ">" + b + ">" + a);
            else out.print(c + ">" + a + ">" + b);
        }

    }
}