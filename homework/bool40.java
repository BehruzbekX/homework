package homework;

import java.util.Scanner;
import java.awt.Point;
import java.lang.Math;
public class bool40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        Point from = new Point(x1,y1);
        Point to = new Point(x2,y2);
        System.out.println((Math.abs(from.x - to.x) == 1 && Math.abs(from.y - to.y) == 2) || ((Math.abs(from.x - to.x) == 2 && Math.abs(from.y - to.y) == 1)) ? "YES" : "NO");
        }
    }
