package homework;

import java.util.Scanner;
import java.awt.Point;
import java.lang.Math;

public class if39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x == 0) print("Bu son nolga teng");
        else if (x > 0) {
            if (x % 2 == 0) print("Musbat juft son");
            else print("Musbat toq son");
        } else {
            if (x % 2 == 0) print("Manfiy juft son");
            else print("Manfiy toq son");
        }
    }

    public static void print(Object obj) {
        System.out.print(obj);
    }
}
