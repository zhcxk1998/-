/*import java.time.LocalDate;
import java.util.Scanner;

class Employee {
    private String name;
    private double salary;
    LocalDate hireDate=LocalDate.now();
    public Employee(String name,double salary) {
        this.name=name;
        this.salary=salary;
    }
    public void setname(String name){
        this.name=name;
    }
    private void setsalary(double salary){
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public void raiseSalary(double byPercent){
        this.salary=salary*(1+byPercent/100);
    }
    public double getSalary(){
        return salary;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        double salary = input.nextDouble();
        Employee employee = new Employee(name, salary);
        double rate = input.nextDouble();
        employee.raiseSalary(rate);
        System.out.println(employee.getName() + " " + employee.getSalary());
        input.close();
    }
}*/
/*import java.util.*;

class Rectangle{
    private double width=1;
    private double height=1;
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public Rectangle(){

    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            while (sc.hasNext()){
                double width=sc.nextDouble();
                double height=sc.nextDouble();
                Rectangle rectangle = new Rectangle(width,height);
                System.out.println(String.format("%.2f %.2f %.2f %.2f",width,height,rectangle.getArea(),rectangle.getPerimeter()));
            }
        sc.close();
    }

}*/
/*import java.util.*;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                long time=sc.nextLong();
                Date bb=new Date(time);
                System.out.println(bb.toString());
            }
        sc.close();
    }

}*/


import java.util.*;

class Matrix {
    private double[][] m;

    public Matrix(double[][] m) {
        this.m = m;
    }

    public double[][] getCenter() {
        double[][] bb = new double[2][2];
        if (m.length % 2 == 0) {
            bb[0][0] = m[m.length / 2 - 1][m.length / 2 - 1];
            bb[0][1] = m[m.length / 2 - 1][m.length / 2];
            bb[1][0] = m[m.length / 2][m.length / 2 - 1];
            bb[1][1] = m[m.length / 2][m.length / 2];
        } else {
            bb[0][0] = m[m.length / 2][m.length / 2];
        }

        return bb;
    }

    public double getSum() {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                sum += m[i][j];
            }
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n < 1) {
                System.out.println("ERROR!");
                continue;
            }
            double[][] bb = new double[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    bb[i][j] = sc.nextInt();
                }
            }
            Matrix matrix = new Matrix(bb);
            System.out.println(String.format("%.2f", matrix.getSum()));
            double[][] list = matrix.getCenter();
            if (bb.length % 2 != 0) {
                System.out.println(String.format("%.2f", list[0][0]));
            } else {
                System.out.println(String.format("%.2f %.2f\n%.2f %.2f", list[0][0], list[0][1], list[1][1], list[1][1]));
            }
        }
        sc.close();
    }

}


/*import java.util.*;

class MyVector {
    private double[] list;
    private int n;

    MyVector(double[] list) {
        this.list = list;
        this.n = list.length;
    }

    MyVector dot(MyVector v2) {
        double[] bb = new double[v2.list.length];
        for (int i = 0; i < n; i++) {
            bb[i] = v2.list[i] * list[i];
        }
        MyVector bb1 = new MyVector(bb);
        return bb1;
    }

    MyVector add(MyVector v2) {
        double[] bb = new double[v2.list.length];
        for (int i = 0; i < n; i++) {
            bb[i] = v2.list[i] + list[i];
        }
        MyVector bb1 = new MyVector(bb);
        return bb1;
    }

    public String toString() {
        String bb = "";
        bb += "(";
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                String temp = String.format("%.2f", list[i]);
                bb += temp;
            } else {
                bb += ", ";
                String temp = String.format("%.2f", list[i]);
                bb += temp;
            }
        }
        bb += ")";
        return bb;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int n = sc.nextInt();
            double[] one = new double[n];
            double[] two = new double[n];
            for (int i = 0; i < n; i++)
                one[i] = sc.nextDouble();
            for (int j = 0; j < n; j++)
                two[j] = sc.nextDouble();
            MyVector first = new MyVector(one);
            MyVector second = new MyVector(two);
            MyVector third = first.dot(second);
            MyVector fourth = first.add(second);
            System.out.println(third.toString());
            System.out.println(fourth.toString());
        }
        sc.close();
    }
}*/


