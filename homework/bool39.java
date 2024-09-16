package homework;

import java.util.Scanner;
import java.awt.Point;
import java.lang.Math;
public class bool39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        Point from = new Point(x1,y1);
        Point to = new Point(x2,y2);
        boolean rook = (from.x == to.x) || (from.y == to.y);
        boolean fil = (Math.abs(from.x - to.x) == Math.abs(from.y - to.y));
        System.out.println( rook || fil ? "YES" : "NO");
    }
}
