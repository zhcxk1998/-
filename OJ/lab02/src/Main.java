import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String a="";
            a=sc.next();
            StringBuilder str=new StringBuilder(a);
            int pos=0;
            char max=a.charAt(0);
            for(int i=0;i<a.length();i++){
                if (a.charAt(i)>max){
                    max=a.charAt(i);
                    pos=i;
                }
            }
            for (int j=0;j<str.length();j++){
                if (str.charAt(j)==str.charAt(pos)){
                    str.insert(j+1,"(max)");
                    j+=5;
                }
            }
            System.out.println(str);
        }
        sc.close();
    }
}

/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            for (int i=1;i<=n;i++){
                for (int j=0;j<n-i;j++){
                    System.out.print(" ");
                }
                for (int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}*/

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String t = "";
            while (n > 0) {
                if (n % 16 == 10)
                    t += "a";
                else if (n % 16 == 11)
                    t += "b";
                else if (n % 16 == 12)
                    t += "c";
                else if (n % 16 == 13)
                    t += "d";
                else if (n % 16 == 14)
                    t += "e";
                else if (n % 16 == 15)
                    t += "f";
                else
                    t += (char) n % 16;
                n /= 16;
            }
            for (int i = t.length() - 1; i >= 0; i--)
                System.out.print(t.charAt(i));
            System.out.println();
        }
        sc.close();
    }
}*/
