package homework;

import java.util.Scanner;
import java.awt.Point;
import java.lang.Math;

public class if40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x < 10) {
            if (x % 2 == 0) System.out.println("Bir xonali juft son");
            else System.out.println("bir xonali toq son");
        } else if (x < 100) {
            if (x % 2 == 0) System.out.println("Ikki xonali juft son");
            else System.out.println("Ikki xonali toq son");
        } else {
            if (x % 2 == 0) print("Uch xonali juft son");
            else print("Uch xonali toq son");
        }
    }

    public static void print(Object obj) {
        System.out.print(obj);
    }
}
