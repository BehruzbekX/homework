package homework;

import java.util.Scanner;

public class for38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int s = 0;
        for(int i = 1;i <= N;++i){
            s += binpow(i,N - i + 1);
        }
        System.out.println(s);
        }
        public static int binpow(int a,int b){
        int res = 1;
        while(b > 0){
            if(b % 2 != 0) res*=a;
            a*=a;
            b >>= 1;
        }
        return res;
        }
    }

