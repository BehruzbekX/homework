package homework;

import java.util.Scanner;

public class while30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        int ans = get(c,a);
        int ans2 = get(c,b);
        int real_ans = 0;
        while(ans2 > 0){ real_ans += ans;ans2--; }
        System.out.println(real_ans);
    }

    public static int get(int a, int c) {
        int cnt = 0;
        int s = 0;
        while (s + a <= c) {s += a; cnt++;}
        return cnt;
        //a
    }
}
