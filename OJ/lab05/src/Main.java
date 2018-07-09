/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int []a=new int[11];
            for (int i=0;i<10;i++)
                a[i]=sc.nextInt();
            printArray(a,5,"#");
            a=shiftBackward(a);
            printArray(a,4,"*");
        }
        sc.close();
    }
     public static int[] shiftBackward(int[] a){
        int temp;
        temp=a[9];
        for (int i=9;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=temp;
        return a;
     }
     public static void printArray(int[] a , int numberOfRow,String spliter ){
        int count=0;
        int flag=1;
        for (int i=0;i<10;i++){
            if (flag==1){
                System.out.print(a[i]);
                flag=0;
            }else
                System.out.print(spliter+a[i]);
            count++;
            if (count%numberOfRow==0){
                System.out.println();
                flag=1;
            }

        }
        if (count%numberOfRow!=0)
            System.out.println();
     }
}
*/

/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int max = 0;
            int[] a = new int[10];
            int[] b = new int[10001];
            for (int i = 0; i < 10; i++) {
                a[i] = sc.nextInt();
                b[a[i]]++;
            }

            for (int i=0;i<10001;i++){
                if (b[i]>max){
                    max=b[i];
                }
            }

            for (int i = 0; i < 10000; i++){
                if(b[i]==max)
                    System.out.println(i+" "+b[i]);
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
            int max,min;
            int[] a= new int[10];
            for (int i=0;i<10;i++){
                a[i]=sc.nextInt();
            }
            max=a[0];
            min=a[0];
            for (int i=0;i<10;i++){
                if (a[i]>max)
                    max=a[i];
                if (a[i]<min)
                    min=a[i];
            }
            System.out.printf("Max:%d at position:",max);
            for (int i=0;i<10;i++){
                if (a[i]==max)
                    System.out.print(" "+i);
            }
            System.out.println();
            System.out.printf("Min:%d at position:",min);
            for (int i=0;i<10;i++){
                if (a[i]==min)
                    System.out.print(" "+i);
            }
            System.out.println();
        }
        sc.close();
    }
}*/

/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int[] array1 = new int[5];
            int[] array2 = new int[5];
            for (int i = 0; i < 5; i++)
                array1[i] = sc.nextInt();
            for (int i = 0; i < 5; i++)
                array2[i] = sc.nextInt();
            System.out.println(equals(array1, array2));
        }
        sc.close();
    }

    public static int equals(int[] array1, int[] array2) {
        int count=0;
        for (int i = 0; i < 5; i++) {
            if (array1[i] == array2[i]){
                count++;
            }
        }
        if (count==5)
            return 0;
        count=0;
        int temp1, temp2;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (array1[j]>array1[j+1]){
                    temp1 = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp1;
                }
                if (array2[j]>array2[j+1]){
                    temp2 = array2[j];
                    array2[j] = array2[j + 1];
                    array2[j + 1] = temp2;
                }
            }
        }
//        for (int x:array1)
//            System.out.println(x);
//        for (int x:array2)
//            System.out.println(x);
        for (int i = 0; i < 5; i++) {
            if (array1[i] == array2[i]){
                count++;
            }
        }
        if (count==5)
            return 1;
        return -1;
    }
}*/


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int[] list1=new int[6];
            int[] list2=new int[4];
            for (int i=0;i<6;i++){
                list1[i]=sc.nextInt();
            }
            for (int i=0;i<4;i++){
                list2[i]=sc.nextInt();
            }
            int[] b=sub(list1,list2);
            int count=0;
            int flag=1;
            for (int i=0;i<b.length;i++){
                if (b[i]!=99999){
                    if (flag==1){
                        System.out.print(b[i]);
                        count++;
                        flag=0;
                    }else {
                        System.out.print(" "+b[i]);
                        count++;
                    }
                    if (count%3==0){
                        System.out.println();
                        flag=1;
                        count=0;
                    }

                }
            }
            if (count%3!=0)
                System.out.println();
        }
        sc.close();
    }
    public static int[] sub(int[] list1,int[] list2){
        int a[]=new int[6];
        for (int i=0;i<6;i++){
            a[i]=list1[i];
        }
        for (int i=0;i<6;i++){
            for (int j=0;j<4;j++){
                if (a[i]==list2[j]){
                    a[i]=99999;
                }
            }
        }
        return a;
    }
}