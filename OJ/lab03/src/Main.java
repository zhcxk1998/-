/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, i, t, c, flag;
        while (sc.hasNextInt()) {
            c=0;
            flag=1;
            a = sc.nextInt();
            b = sc.nextInt();
            if (a > b) {
                t = a;
                a = b;
                b = t;
            }
            for (i = a; i <= b; i++) {
                if (isPrime(i) == 1&&i>1) {
                    if (flag==1){
                        System.out.printf("%d",i);
                        flag=0;
                    }
                    else
                        System.out.printf(" %d", i);
                    c+=1;
                    if (c%10==0){
                        System.out.println();
                        flag=1;
                    }
                }
            }
            if (c%10!=0){
                System.out.println();
            }
        }
    }

    public static int isPrime(int n) {
        int i, f = 1;
        for (i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (i != n) {
                    f = 0;
                    break;
                }
            }
        }
        return f;
    }
    public static int huiwen(int n) {
        int q, m = 0, num;
        num = n;
        while (n != 0) {
            q = n % 10;
            n /= 10;
            m = m * 10 + q;
        }
        if (num == m)
            return 1;
        else
            return 0;
    }
}
*/


/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (sc.hasNext()) {
            n = sc.nextInt();
            if ((isPrime(n) == 1 && n > 1) && huiwen(n) == 1) {
                System.out.println("Remove Successfully");
            }
            else
                System.out.println("Ops");
        }
    }

    public static int isPrime(int n) {
        int i, f = 1;
        for (i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (i != n) {
                    f = 0;
                    break;
                }
            }
        }
        return f;
    }

    public static int huiwen(int n) {
        int q, m = 0, num;
        num = n;
        while (n != 0) {
            q = n % 10;
            n /= 10;
            m = m * 10 + q;
        }
        if (num == m)
            return 1;
        else
            return 0;
    }
}*/


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (sc.hasNext()) {
//            n=sc.nextInt();
//            for (int i=2;i<n;i++){
//                if (isPrime(i)==1&&isPrime(i+2)==1){
//                    System.out.println(String.format("( %d,%d )",i,i+2));
//                    i+=1;
//                }
//            }
            ArrayList a=new ArrayList();
            int s;
            for (int i=0;i<6;i++){
                s=sc.nextInt();
                a.add(s);
            }
            System.out.println(a.get(0));
            System.out.println(a.size());
        }
    }

    public static int isPrime(int n) {
        int i, f = 1;
        for (i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (i != n) {
                    f = 0;
                    break;
                }
            }
        }
        return f;
    }
}