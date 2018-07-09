/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        while (sc.hasNext()){
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(a*b);
        }
        sc.close();
    }
}*/

//-------------------------------------------------------------

/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, x, y, s;
        while (sc.hasNext()) {
            a = sc.nextInt();
            b = sc.nextInt();

            if (a>=90)
                x=0;
            else if (a>=80)
                x=1;
            else if (a>=70)
                x=2;
            else if (a>=60)
                x=3;
            else
                x=4;
            if (b>=90)
                y=0;
            else if (b>=80)
                y=1;
            else if (b>=70)
                y=2;
            else if (b>=60)
                y=3;
            else
                y=4;
            s=(x+y)/2;
            char c=(char)(s+65);
            System.out.println(c);
        }
        sc.close();
    }
}*/
//---------------------------------------------------------

/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,i,j,k,l,b;
        while (sc.hasNext()) {
            a = sc.nextInt();
            a++;
            for (i = 1; i <= a; i++) {
                for (j = 0; j < a - i; j++) {
                    System.out.print(".");
                }
                for (k = 0; k < 2 * i - 1; k++) {
                    System.out.print("*");
                }
                for (l = 0; l < a - i; l++) {
                    System.out.print(".");
                }
                System.out.println();
            }
            for (i = a - 1; i > 0; i--) {
                for (l = a - i; l > 0; l--) {
                    System.out.print(".");
                }
                for (b = 2 * i - 1; b > 0; b--) {
                    System.out.print("*");
                }
                for (l = 0; l < a - i; l++) {
                    System.out.print(".");
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}*/

//---------------------------------------------------------------

/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,t,s;
        while (sc.hasNext()) {
            a = sc.nextInt();
            s=0;
            b=sc.nextInt();
            if (a>b){
                t=a;
                a=b;
                b=t;
            }
            for (int i =a;i<=b;i++){
                s+=i;
            }
            System.out.println(s);
        }
        sc.close();
    }
}*/
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()){
            int a = input.nextInt();
            int b = input.nextInt();
            int x=0;
            int y=0;
            if(a>=90&&a<=100){
                x=1;
            }
            else if(a>=80&&a<90){
                x=2;
            }
            else if(a>=70&&x<80){
                x=3;
            }
            else if(a>=60&&x<70){
                x=4;
            }
            else
                x=5;
            if(b>=90&&b<=100){
                y=1;
            }
            else if(b>=80&&b<90){
                y =2;
            }
            else if(b>=70&&b<80){
                y =3;
            }
            else if(b>=60&&b<70){
                y=4;
            }
            else{
                y=5;
            }
            int w=x+y;
            System.out.printf("%c", w / 2 + 64);
            System.out.print('\n');


        }
        input.close();
    }
}*/

//--------------------------------------------------------------

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (sc.hasNext()) {
            n=sc.nextInt();
            if (huiwen(n)==1)
                System.out.println(n+" is a palondrome");
            else
                System.out.println(n+" is not a palondrome");
        }
        sc.close();
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
