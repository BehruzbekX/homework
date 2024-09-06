import java.util.Scanner;
import java.math.*;

public class diskri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = b * b - 4 * a * c;
        if(d < 0) System.out.println("Javob yo'q");
        else if(d == 0) System.out.println(-b / 2 * a);
        else System.out.println((-b + d) / 2 * a + " " + (-b - d) / 2 * a);
    }
}
