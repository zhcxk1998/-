import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[][] bb=new int[5][];
//        sc.close();

//        System.out.println("a"+1);
//        System.out.println('a'+1);
//        System.out.println("a+1");
//
//        System.out.println("-----------------------------");
//
//        System.out.println((int)'a'+1);
//        System.out.println('a'+'b');
//        System.out.println((char)('a'+1));


//        String bb=sc.nextLine();
//        String cc="abc";
////        cc=cc.concat(bb);
//        char a[];
////        a=bb.toCharArray();
////        System.out.println(a.length);
////        System.out.println(a[0]);
////        System.out.println(a);
//        System.out.println(bb);
//        System.out.println(bb==cc);
//        System.out.println(bb.compareTo(cc));
//        System.out.println(bb.equals(cc));

//        String a="123";
//        String b="abc";
//        System.out.println(Integer.parseInt(a));
//        System.out.println(Double.parseDouble(a));
//
//        int num=1;
//        System.out.println(num+"");
//        System.out.println(Integer.parseInt(b));


//        int i=4,j=5,k=2;
//        if (i > j)
//            if (i > k)
//                System.out.println("A");
//            else
//                System.out.println("B");
//
//
//        System.out.println("=====================");
//        if (i > j)
//            if (i > k)
//                System.out.println("A");
//        else
//            System.out.println("B");


//        int a = 10 - 1 - 1 - 1 - 1 - 1;
//        System.out.println(a == 5);
//        double x = 1.0 - 0.1 - 0.1 - 0.1 -0.1 - .1;
//        System.out.println(x);
//        System.out.println(x == 0.5);

//        char ch='a';
//        switch (ch){
//            case 'a':
//                System.out.println("a");
//                break;
//            case 'b':
//                System.out.println("b");
//                break;
//            case 'c':
//                System.out.println("c");
//                break;
//        }

//        int a=1;
//        if (a==1);{
//            System.out.println("emm");
//        }
//
//        while(a==1);{
//            System.out.println("emmmmm");
//        }
//        System.out.println("jieshu");


//        int n=1;
//        double a=1.0;
//        System.out.println(sign(n));
//        System.out.println(sign(a));


//        int i=1;
//        for (i=0;i<10;i++){
//            System.out.println(i);
//        }
//        System.out.println(i);


//        int x=0;
//        for (int i=1;i<=10;i++){
//            x+=i;
//        }
//        System.out.println(x);

//        for (int i=1;i<=10;i++){
//            int x=0;
//            x+=i;
//        }
//        System.out.println(x);

//        int x=1;
//        int y=2;
//        int z=3;
//        y+=z--/++x;
//        System.out.println(y
//        );

//
//        int x=0;
//        int y=3;
//        switch (y){
//            case 1:x++;
//            case 2:x++;x++;
//            case 3:x++;x++;x++;
//            case 4:x+=4;
//        }
//        System.out.println(x);

//        int x=3;
////        float y=10.0f;
//        double y=10.0;
//        System.out.println(y%x);


//        String s=sc.next();
//        String str="";
//        for (int i=0;i<s.length();i++){
//            if (s.charAt(i)>='A'&&s.charAt(i)<='Z')
//                str+=(char)(s.charAt(i)+32);
//            if (s.charAt(i)>='a'&&s.charAt(i)<='z')
//                str+=(char)(s.charAt(i)-32);
//        }
//        System.out.println(str);

        /*while (sc.hasNext()) {
            int[] a = new int[6];
            int[] b = new int[4];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < b.length; i++) {
                b[i] = sc.nextInt();
            }
            int[] c = sub(a, b);
            int time = 0;
            for (int x : c) {
                System.out.print(x + " ");
                time++;
                if (time % 3 == 0)
                    System.out.println();
            }
            if (time % 3 != 0)
                System.out.println();
        }*/

        /*int k = 0;
        do {
            ++k;
        } while (k < 1);
        System.out.println(k);*/
//        System.out.print(1 + 1 + "12");
//        System.out.print(1 + "12" + 1);
//        Object o=new GraduateStudent();
//        System.out.println(o.toString());
//        o=new Student();
//        System.out.println(o.toString());
//        o=new Person();
//        System.out.println(o.toString());
//        o=new Object();
//        System.out.println(o.toString());



        int a=3;
        int b=4;
        File f=new File("bb.txt");
        try {
            BufferedReader fip=new BufferedReader(new FileReader(f));
            FileOutputStream fileOutputStream=new FileOutputStream(f,true);
            OutputStreamWriter writer=new OutputStreamWriter(fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static int[] sub(int[] a, int[] b) {
//        int[] bb=new int[a.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    a[i] = -1;
                    count++;
                }
            }
        }
        int[] bb = new int[a.length - count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                bb[index++] = a[i];
            }
        }
        return bb;
    }
}

class Person extends Object{
    @Override
    public String toString() {
        return "Person";
    }
}

class Student extends Person{
    @Override
    public String toString() {
        return "Student";
    }
}
class GraduateStudent extends Student{

}