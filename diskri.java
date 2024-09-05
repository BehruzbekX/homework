import java.util.Scanner;
import java.math.*;

public class diskri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        BigInteger c = in.nextBigInteger();
        BigInteger d = b.multiply(b).subtract(new BigInteger("4").multiply(a).multiply(c));
        if(d.equals(BigInteger.ZERO)) System.out.println(b.negate().divide(new BigInteger("2")));
        else if(d.compareTo(BigInteger.ZERO) > 0) System.out.println(b.negate().add(sqrt(d)).divide(a.multiply(new BigInteger("2"))) + "\n" + b.negate().subtract(sqrt(d)).divide(a.multiply(new BigInteger("2"))));
        else System.out.println("Javob yo'q");
    }
    public static BigInteger sqrt(BigInteger a){
        BigInteger x = a;
        BigInteger y = a.shiftRight(1).add(BigInteger.ONE);
        while(y.compareTo(x) < 0) {x = y;y = (a.divide(x).add(x).shiftRight(1));}
        return x;
    }

}
