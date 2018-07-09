/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s="";
            s=sc.next();
            s=s.toLowerCase();
            for (int i=0;i<s.length();i++){
                if (s.charAt(i)=='-')
                    System.out.print('-');
                else if(Character.isDigit(s.charAt(i)))
                    System.out.print(s.charAt(i));
                else
                    System.out.print(getNumber(s.charAt(i)));
            }
            System.out.println();
        }
        sc.close();
    }
    public static int getNumber(char uppercaseLetter){
        if (uppercaseLetter=='.')
            return 1;
        else if (uppercaseLetter==']')
            return 0;
        else if (uppercaseLetter=='a'||uppercaseLetter=='b'||uppercaseLetter=='c')
            return 2;
        else if (uppercaseLetter=='d'||uppercaseLetter=='e'||uppercaseLetter=='f')
            return 3;
        else if (uppercaseLetter=='g'||uppercaseLetter=='h'||uppercaseLetter=='i')
            return 4;
        else if (uppercaseLetter=='j'||uppercaseLetter=='k'||uppercaseLetter=='l')
            return 5;
        else if (uppercaseLetter=='m'||uppercaseLetter=='n'||uppercaseLetter=='o')
            return 6;
        else if (uppercaseLetter=='p'||uppercaseLetter=='q'||uppercaseLetter=='r'||uppercaseLetter=='s')
            return 7;
        else if (uppercaseLetter=='t'||uppercaseLetter=='u'||uppercaseLetter=='v')
            return 8;
        else if (uppercaseLetter=='w'||uppercaseLetter=='x'||uppercaseLetter=='y'||uppercaseLetter=='z')
            return 9;
        return 1;
    }
}*/


/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            long n=sc.nextLong();
            System.out.println(conuertMillis(n));
        }
        sc.close();
    }
    public static String conuertMillis(long millis){
        String time="";
        long a=0,b=0,c;
        c=millis/1000;
        if (c>=60){
            b+=c/60;
            c-=60*(c/60);
        }
        if (b>=60){
            a+=b/60;
            b-=60*(b/60);
        }
        time=a+":"+b+":"+c;
        return time;
    }

}*/


/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s="";
            s=sc.next();
            System.out.println(changeUpperLowerCase(s));
        }
        sc.close();
    }
    public static String changeUpperLowerCase(String str) {
        String zimu="";
        for (int i=0;i<str.length();i++){
            if (Character.isUpperCase(str.charAt(i)))
                zimu+=Character.toLowerCase(str.charAt(i));
            else if (Character.isLowerCase(str.charAt(i)))
                zimu+=Character.toUpperCase(str.charAt(i));
        }
        return zimu;
    }
}*/

/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s="";
            s=sc.next();
            String a=sc.next();
            char zifu=a.charAt(0);
            System.out.println(count(s,zifu));
        }
        sc.close();
    }
    public static int count(String str,char a){
        int time=0;
        for (int i=0;i<str.length();i++){
            if (a==str.charAt(i))
                time++;
        }
        return time;
    }
}*/

/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            if (isRefNumber(n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
    public static boolean isRefNumber(int number){
        int n=0;
        for (int i=1;i<number;i++){
            if (number%i==0){
//                System.out.println("i是~~~~~~"+i);
                n+=i;
//                System.out.println("和是~"+n);
            }
        }
        if (n==number)
            return true;
        return false;
    }
}*/


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String n;
            n=sc.nextLine();
            char c=n.charAt(n.length()-1);

            int ct=count(n,c);
            System.out.println(ct);
        }
        sc.close();
    }
    public static int count(String str,char a) {
        int t=0;
        for (int i=0;i<str.length()-2;i++){
            if (str.charAt(i)==a){
                t++;
            }
        }
        return t;
    }
}










/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            long a = input.nextLong();
            System.out.println(conuertMillis(a));
        }
    }

    public static String conuertMillis(long m) {
//        System.out.println("ehhehe");
        long b = m / 1000;
//        System.out.println(b);
        long h = 0, s = 0, t = 0;
        h = b / 3600;
        s = (b - h * 3600) / 60;
        t = b - h * 3600 - s * 60;
        String h1 = String.valueOf(h);
        String s1 = String.valueOf(s);
        String t1 = String.valueOf(t);
        String p = ":";
        String a="";
        a = h1 + p + s1 + p + t1;
        return a;
    }
}
*/


/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str="";
            str=sc.next();
            for (int i=0;i<str.length();i++){
                System.out.print((int)str.charAt(i));
                System.out.println("       "+(char)((int)str.charAt(i)-32));
            }
        }
        sc.close();
    }

}*/
