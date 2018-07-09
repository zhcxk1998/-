import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String t = "";
            while (n > 0) {
                if (n % 17 == 10)
                    t += "A";
                else if (n % 17 == 11)
                    t += "B";
                else if (n % 17 == 12)
                    t += "C";
                else if (n % 17 == 13)
                    t += "D";
                else if (n % 17 == 14)
                    t += "E";
                else if (n % 17 == 15)
                    t += "F";
                else if (n % 17 == 16)
                    t += "G";
                else
                    t += (char) n % 17;
                n /= 17;
            }
            for (int i = t.length() - 1; i >= 0; i--)
                System.out.print(t.charAt(i));
            System.out.println();
        }
        sc.close();
    }
}
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str="";
        while (sc.hasNext()) {
            int flag=1;
            int key=1;
            str=sc.next();
            if (str.length()<6){
                System.out.println("NO Password at least 6 digits");
                flag=0;
                continue;
            }

            for (int i=0;i<str.length();i++){
                if (!((str.charAt(i)>='A'&&str.charAt(i)<='Z')||(str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='0'&&str.charAt(i)<='9'))){
                    System.out.println("NO Passwords can only consist of letters and numbers");
                    flag=0;
                    key=0;
                    break;
                }
            }
            if (key==0)
                continue;
            int sum=0;
            for (int i=0;i<str.length();i++){
                if (str.charAt(i)>='0'&&str.charAt(i)<='9')
                    sum++;
            }
            if (sum<1){
                System.out.println("NO Password is at least one number");
                flag=0;
                continue;
            }
            if (flag==1){
                System.out.println("YES");
                continue;
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
        String str="";
        while (sc.hasNext()) {
            int flag=1;
            str=sc.next();
            if (str.length()<6){
                System.out.println("NO Password at least 6 digits");
                flag=0;
            }

            for (int i=0;i<str.length();i++){
                if (!((str.charAt(i)>='A'&&str.charAt(i)<='Z')||(str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='0'&&str.charAt(i)<='9'))){
                    System.out.println("NO Passwords can only consist of letters and numbers");
                    flag=0;
                    break;
                }
            }
            int sum=0;
            for (int i=0;i<str.length();i++){
                if (str.charAt(i)>='0'&&str.charAt(i)<='9')
                    sum++;
            }
            if (sum<1){
                System.out.println("NO Password is at least one number");
                flag=0;
            }
            if (flag==1)
                System.out.println("YES");

        }
        sc.close();
    }
}*/
