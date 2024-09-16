package homework;

import java.util.Scanner;
import java.awt.Point;
import java.lang.Math;

public class int30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        print(x / 100 + 1);
    }

    public static void print(Object obj) {
        System.out.print(obj);
    }
}
