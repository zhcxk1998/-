import java.math.BigInteger;
import java.util.*;

public class emm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextBigInteger()){
            int n=sc.nextInt();
            int i;
            for (i=1;i<=n;i++){
                BigInteger a=sc.nextBigInteger();
                BigInteger b=sc.nextBigInteger();
                BigInteger s=a.add(b);
                System.out.println("Case "+i+":\n"+a+" + "+b+" = "+s);
                if (i!=n)
                    System.out.println();
            }
        }
    }
}
