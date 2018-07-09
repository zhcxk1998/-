/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            int[][] b = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            b=change(a);
            int flag=1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (flag==1){
                        System.out.print(b[i][j]);
                        flag=0;
                    }
                    else
                        System.out.print(" "+b[i][j]);
                }
                flag=1;
                System.out.println();
            }
        }
        sc.close();
    }

    public static int[][] change(int numsSource[][]) {
        int[][] numsDest=new int[numsSource.length][numsSource.length];
        for (int i = 0; i < numsSource.length; i++) {
            for (int j = 0; j < numsSource.length; j++) {
                numsDest[j][i] = numsSource[i][j];
            }
        }
        return numsDest;
    }
}*/



/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m, n;
            m = sc.nextInt();
            n = sc.nextInt();
            int[][] a = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j]=sc.nextInt();
                }
            }
            display(a);
        }
        sc.close();
    }

    public static void display(int nums[][]) {
        for (int i=0;i<nums[0].length;i++){
            System.out.print(nums[0][i]+" ");
        }
        for (int i=1;i<nums.length;i++){
            System.out.print(nums[i][nums[0].length-1]+" ");
        }
        for (int i=nums[0].length-2;i>=0;i--){
            System.out.print(nums[nums.length-1][i]+" ");
        }
        for (int i=nums.length-2;i>0;i--){
            if (i!=1)
                System.out.print(nums[i][0]+" ");
            else if(i==1)
                System.out.print(nums[i][0]);
        }
        System.out.println();
    }
}*/

/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            double[][] a=new double[n][n];
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    a[i][j]=sc.nextDouble();
                }
            }
            System.out.println(String.format("%.2f",sumMajorDiagonal(a)));
        }
        sc.close();
    }

    public static double sumMajorDiagonal(double nums[][]){
        double sum=0;
        for (int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if (i+j==nums.length-1)
                    sum+=nums[i][j];
            }
        }
        return sum;
    }
}*/

/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            double[][] a=new double[n][n];
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    a[i][j]=sc.nextDouble();
                }
            }
            System.out.println(String.format("%.2f", sumMinorDiagonal(a)));
        }
        sc.close();
    }

    public static double sumMinorDiagonal(double nums[][]){
        double sum=0;
        for (int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if (i==j)
                    sum+=nums[i][j];
            }
        }
        return sum;
    }
}*/


/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            int l=sc.nextInt();
            int[] a=new int[l];
            for (int i=0;i<l;i++){
                a[i]=sc.nextInt();
            }
            int[] b=new int[l];
            int flag=1;
            int t=0;
            b=binSearch(a,n);
            for (int x:b){
                if (x!=-999){
                    System.out.print(x);
                    t=x;
                    break;
                }
            }
            if (b[b.length-1]!=t)
                System.out.print(" "+b[b.length-1]);
            System.out.println();
        }
        sc.close();
    }

    public static int[] binSearch(int[] list, int key){
        int[] bb=new int[list.length];
        for (int i=0;i<bb.length;i++){
            bb[i]=-999;
        }
        bb[0]=-1;
        int i=0;
        int low=0;
//        int left=0,right=0;
        int high=list.length-1;
        while (high>=low){
            int mid=(low+high)/2;
            if (key<list[mid])
                high=mid-1;
            else if (key==list[mid]) {
                bb[i] = mid;
                i++;
                low=mid+1;
            }
            else low=mid+1;
        }
        low=0;high=bb.length-1;
        while (high>=low){
            int mid=(low+high)/2;
            if (key<list[mid])
                high=mid-1;
            else if (key==list[mid]) {
                bb[i] = mid;
                i++;
                high=mid-1;
            }
            else low=mid+1;
        }
        Arrays.sort(bb);
        return bb;
    }
}*/


/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m,n;
            m=sc.nextInt();
            n=sc.nextInt();
            int[][] a=new int[m][n];
            System.out.println(a.length);
            System.out.println(a[0].length);
        }
        sc.close();
    }
}*/
import java.util.Scanner;
public class Main {
	 public static int[] binSearch(int[] list, int key) {
		 	int []a = new int[2];
			int k1= -1,k2 = -1,t = 0,low = 0;
			int high = list.length -1;
			while(high >= low){
				int mid = (low + high)/2;
				if(key < list[mid]) high = mid-1;
				else if(key == list[mid]){
					t = mid;
					break;
				}
				else low = mid+1;
			}
			for(int i = low;i <= t;i++) {
				if(list[i] == key) {
					k1 = i;
					break;
				}
			}
			for(int i = high;i > t;i--) {
				if(list[i] == key) {
					k2 = i;
					break;
				}
			}
			a[0] = k1;a[1] = k2;
			return a;
	 }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int r = input.nextInt();
			int w = input.nextInt();
			int []b = new int[w];
			int []c = new int[2];
			for(int i = 0;i < w;i++)
				b[i] = input.nextInt();
			c = binSearch(b,r);
			System.out.printf("%d",c[0]);
			for(int i = 1;i < 2;i++) {
				if(c[i] != -1) {
					System.out.printf(" %d",c[i]);
				}
			}
			System.out.println();
		}
	}
}