package homework;

import java.util.Scanner;
import java.util.Vector;

public class while29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int e = in.nextInt();
        Vector<Integer> a = new Vector<>();
        a.add(1); // 0
        a.add(2); // 1
        a.add((a.elementAt(0) + 2 * a.elementAt(1)) / 3); // 2
        System.out.println(a.elementAt(2));
        int k = 2;
        for(;;++k){
            if(Math.abs(a.elementAt(k) - a.elementAt(k - 1)) < e){
                System.out.println(k + 1);
                System.out.println(a.elementAt(k) + " " + a.elementAt(k - 1));
                System.exit(0);
            }
            else a.add((a.elementAt(k - 2) + 2 * a.elementAt(k - 1)) / 3);
        }
    }
}
