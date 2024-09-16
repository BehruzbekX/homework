package homework;

import java.util.Scanner;
import java.util.Vector;

public class while28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int e = in.nextInt();
        Vector<Double> a = new Vector<>();
        a.add(1.0); // 0
        a.add(2.0 + 1 / a.elementAt(0));
        int k = 1;
        for(;;++k){
            if(Math.abs(a.elementAt(k) - a.elementAt(k - 1)) < e){
                System.out.println(k);
                System.out.println(a.elementAt(k) + " " + a.elementAt(k - 1));
                System.exit(0);
            }
            else a.add(2.0 + 1 / a.elementAt(k - 1));
        }
    }
}
