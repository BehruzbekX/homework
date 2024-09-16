package homework;

import java.util.Scanner;
import java.awt.Point;
import java.lang.Math;

public class if38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        print(x % 400 == 0 || (x % 4 == 0 && x % 100 != 0) ? "366" : "365");
    }

    public static void print(Object obj) {
        System.out.print(obj);
    }
}
