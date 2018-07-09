/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            while (sc.hasNext()){
                double[] a=new double[10];
                for (int i=0;i<10;i++)
                    a[i]=sc.nextDouble();
                System.out.println(String.format("%.2f",min(a)));
                System.out.println(String.format("%.2f",max(a)));
                System.out.println(String.format("%.2f",average(a)));
            }
        sc.close();
    }

    public static double min(double[] array) {
        double min=array[0];
        for (int i=1;i<10;i++){
            if (array[i]<min)
                min=array[i];
        }
        return min;
    }

    public static double max(double[] array) {
        double max=array[0];
        for (int i=1;i<10;i++){
            if (array[i]>max)
                max=array[i];
        }
        return max;
    }

    public static double average(double[] array) {
        double sum=0;
        for (int i=0;i<10;i++){
            sum+=array[i];
        }
        return sum/10;
    }
}
*/

/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int[] a = new int[101];
            int[] b = new int[102];
            int count = 0;
            for (int i = 0; i < 100; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 0)
                    break;
                b[a[i]]++;
                count++;
            }
//            System.out.println(count);
            Arrays.sort(a,0,count);
//            List<Integer>list=new ArrayList<Integer>();
//            int time=count;
//            for (int i=0;i<count;i++){
//                if (list.contains(a[i]))
//                    time--;
//                if (!list.contains(a[i])){
//                    list.add(a[i]);
//                }
//            }
//            for (int i=0;i<time;i++){
//                if (b[list.get(i)]>1)
//                    System.out.println(list.get(i)+" occurs "+b[a[i]]+" times");
//                else
//                    System.out.println(list.get(i)+" occurs "+b[a[i]]+" time");
//            }

            for (int i = 0; i < count; i++) {
                if (a[i]==a[i+1])
                    continue;
                if (b[a[i]]>1)
                    System.out.println(a[i]+" occurs "+b[a[i]]+" times");
                else
                    System.out.println(a[i]+" occurs "+b[a[i]]+" time");
            }

        }
        sc.close();
    }

}*/

/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n;
            int[] a=new int[10];
            for (int i=0;i<10;i++){
                a[i]=sc.nextInt();
            }
            n=sc.nextInt();
            pritfFormat(a,n);
        }
        sc.close();
    }
    public static void pritfFormat(int[] array,int countPerline) {
        int flag=1;
        int count=0;
        for (int i=0;i<array.length;i++){
            if (flag==1){
                System.out.print(array[i]);
                flag=0;
                count++;
            }
            else {
                System.out.print(" "+array[i]);
                count++;
            }
            if (count%countPerline==0){
                System.out.println();
                flag=1;
                count=0;
            }
        }
        if (count%countPerline!=0)
            System.out.println();
    }

}*/

/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int[] a=new int[10];
            for (int i=0;i<10;i++) {
                a[i] = sc.nextInt();
            }
            int[] c=new int[10];
            c=eliminateDuplicates(a);
            int flag=1;
            for (int i=0;i<10;i++){
                if (c[i]!=99999){
                    if (flag==1){
                        System.out.print(c[i]);
                        flag=0;
                    }
                    else
                        System.out.print(" "+c[i]);
                }
            }
            System.out.println();
        }
        sc.close();
    }
    public static int[] eliminateDuplicates(int[] list){
        for (int i=0;i<10;i++){
            for (int j=i+1;j<10;j++){
                if (list[i]==list[j]){
                    list[j]=99999;
                }
            }
        }
        return list;
    }
}*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int[] a = new int[101];
            int[] b = new int[102];
            int[] c = new int[102];
            int count = 0;
            for (int i = 0; i < 100; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 0)
                    break;
                b[a[i]]++;
                c[a[i]]++;
                count++;
            }
            Arrays.sort(b);
            Arrays.sort(a, 0, count);
            for (int i = 0; i < count; i++) {
                if (a[i] == a[i + 1])
                    a[i + 1] = 0;
            }
            Arrays.sort(a, 0, count);
            for (int i = b.length - 1; i >= 0; i--) {
                if (b[i] == 0)
                    break;
                for (int j = count - 1; j >= 0; j--) {
                    if (c[a[j]] == b[i]) {
                        if (b[i]>1)
                            System.out.println(a[j]+" occurs "+c[a[j]]+" times");
                        else
                            System.out.println(a[j]+" occurs "+c[a[j]]+" time");
                        a[j] = 0;
                        break;
                    }
                }
            }
        }
        sc.close();
    }

}
