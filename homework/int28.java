package homework;

import java.util.Scanner;
import java.awt.Point;
import java.lang.Math;

public class int28 {
    public static void main(String[] args) {
        int n = INT(),k = INT();
        print((k + n - 1) % 7 + 1);
    }

    public static void print(Object obj) {
        System.out.print(obj);
    }
    public static int INT(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
