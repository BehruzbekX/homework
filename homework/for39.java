package homework;

import java.util.Scanner;

public class for39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        for(int i = A;i <= B;++i){
            for(int j = 1;j <= i;++j) System.out.print(i + " ");
        }
    }
}
