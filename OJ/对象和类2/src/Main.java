/*
import java.util.Scanner;

class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0, y = 0;

    public RegularPolygon() {

    }

    public RegularPolygon(int numberOfSide, double side) {
        this.n=numberOfSide;
        this.side=side;
    }

    public RegularPolygon(int numberOfSide, double side, double x, double y) {
        this.n=numberOfSide;
        this.side=side;
        this.x=x;
        this.y=y;
    }

    public int getN(){
        return n;
    }
    public double getSide(){
        return side;
    }
    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public double getPerimeter(){
        return side*n;
    }
    public double getArea(){
        return n*side*side/(4*Math.tan(Math.PI/n));
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            double side = input.nextDouble();
            double x = input.nextDouble();
            double y = input.nextDouble();
            // 三种方式构造正多边形，并输出其周长和面积
            RegularPolygon rp1 = new RegularPolygon();
            rp1.setN(n);
            rp1.setSide(side);
            rp1.setX(x);
            rp1.setY(y);
            RegularPolygon rp2 = new RegularPolygon(n, side);
            rp2.setX(x);
            rp2.setY(y);
            RegularPolygon rp3 = new RegularPolygon(n, side, x, y);
            System.out.printf("%d %.2f %.2f %.2f\n", rp1.getN(), rp1.getSide(),
                    rp1.getPerimeter(), rp1.getArea());
            System.out.printf("%d %.2f %.2f %.2f\n", rp2.getN(), rp2.getSide(),
                    rp2.getPerimeter(), rp2.getArea());
            System.out.printf("%d %.2f %.2f %.2f\n", rp3.getN(), rp3.getSide(),
                    rp3.getPerimeter(), rp3.getArea());
        }
        input.close();
    }

}*/


/*
import java.util.Scanner;

class GameNumber {
    private int max, min, featureValue;

    public GameNumber(int min, int max, int feature) {
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        this.min = min;
        this.max = max;
        this.featureValue = feature;
    }

    public String listAllFeatureNumbers() {
        String bb="";
        int flag=1;
        bb+="(";
        for (int i = min; i <= max; i++) {
            if (featureValue!=0){
                if (i%featureValue==0&&flag==1){
                    bb+=i;
                    flag=0;
                    continue;
                }
                else if (i%featureValue==0&&flag!=1){
                    bb+=",";
                    bb+=i;
                    continue;
                }
                if (i%10==featureValue&&flag==1){
                    bb+=i;
                    flag=0;
                    continue;
                }
                else if(i%10==featureValue&&flag!=1){
                    bb+=",";
                    bb+=i;
                    continue;
                }
            }
            else{
                if (i%10==featureValue&&flag==1){
                    bb+=i;
                    flag=0;
                    continue;
                }
                else if(i%10==featureValue&&flag!=1){
                    bb+=",";
                    bb+=i;
                    continue;
                }
            }

        }
        bb+=")";
        return bb;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public int getFeatureValue() {
        return featureValue;
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int min = input.nextInt();
            int max = input.nextInt();
            int f = input.nextInt();
            GameNumber gn = new GameNumber(min, max, f);
            System.out.printf("%d-%d-%d\n", gn.getMin(), gn.getMax(), gn.getFeatureValue());
            System.out.println(gn.listAllFeatureNumbers());
        }
    }
}*/


/*
import java.util.Scanner;

class Student{
    private int[] scores;
    private String name;

    public Student(String name, int[] scores) {
        int[] bb=new int[scores.length];
        for (int i=0;i<scores.length;i++){
            bb[i]=scores[i];
        }
        this.scores=bb;
        this.name=name;
    }

    public double getSum() {
        double sum=0;

        for (int i=0;i<scores.length;i++){
            sum+=scores[i];
        }
        return sum;
    }

    public double getAverage() {
        double sum=0;
        for (int i=0;i<scores.length;i++){
            sum+=scores[i];
        }
        return sum/scores.length;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            // 学生数和科目数
            int numberOfStudent = input.nextInt();
            int numberOfCourse = input.nextInt();
            Student[] stu = new Student[numberOfStudent];
            String name;
            int[] scores = new int[numberOfCourse];
            // 构建同学和每个课的成绩
            for (int i = 0; i < numberOfStudent; i++) {
                name = input.next();
                for (int j = 0; j < numberOfCourse; j++) {
                    scores[j] = input.nextInt();

                }
                stu[i] = new Student(name, scores);// 注意引用问题

            }
            // 按学生输出学生的总分和平均分
            for (int i = 0; i < stu.length; i++) {
                System.out.printf("%s %.2f %.2f\n", stu[i].getName(),
                        stu[i].getSum(), stu[i].getAverage());

            }
        }
        input.close();

    }

}*/


import java.util.Scanner;

class NumberValid {
    private static final String regx16 = "[+-]?0[Xx][0-9A-Fa-f]+"; //16进制模式
    private static final String regx8 = "[+-]?0[0-7]+";//8进制模式
    private static final String regx2 = "[+-]?0[Bb][0-1]+";//2进制模式
    private static final String regx10 = "[+-]?[0-9]+"; //10进制模式

    public static boolean isBin(String v) {
        boolean flag = java.util.regex.Pattern.matches(regx2, v);
        return flag;
    }

    public static boolean isOct(String v) {
        boolean flag = java.util.regex.Pattern.matches(regx8, v);
        return flag;
    }

    public static boolean isHex(String v) {
        boolean flag = java.util.regex.Pattern.matches(regx16, v);
        return flag;
    }

    public static boolean isInt(String v) {
        boolean flag = java.util.regex.Pattern.matches(regx10, v);
        return flag;
    }
}

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String v = input.next();
            System.out.printf("%b %b %b %b\n", NumberValid.isBin(v), NumberValid.isOct(v),
                    NumberValid.isHex(v), NumberValid.isInt(v));
        }

    }

}


/*
import java.util.Scanner;

class GameNumber {
    private int min;
    private int max;
    private int featureValue;

    public GameNumber(int min, int max, int feature) {
        this.min = min;
        this.max = max;
        this.featureValue = feature;
        if (min > max) {
            int temp = this.max;
            this.max = this.min;
            this.min = temp;
        }
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setFeatureValue(int featureValue) {
        this.featureValue = featureValue;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getFeatureValue() {
        return featureValue;
    }

    public String listAllFeatureNumbers() {
        String s = "";
        s += "(";
        int flag = 1;
        for (int i = this.min; i <= this.max; i++) {
            if (i == 0 && featureValue == 0 && flag == 1) {
                s += i;
                flag = 0;
            } else if (i == 0 && featureValue == 0 && flag == 0) {
                s += "," + i;
            } else {
                if (featureValue != 0 && (i % featureValue == 0 || i % 10 == featureValue) && flag == 1) {
                    s += i;
                    flag = 0;
                } else if (featureValue != 0 && (i % featureValue == 0 || i % 10 == featureValue) && flag == 0) {
                    s += "," + i;
                } else if (i % 10 == featureValue && flag == 1) {
                    s += i;
                    flag = 0;
                } else if (i % 10 == featureValue && flag == 0)
                    s += "," + i;
            }
        }
        s += ")";
        return s;
    }
}

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int min = input.nextInt();
            int max = input.nextInt();
            int f = input.nextInt();
            GameNumber gn = new GameNumber(min, max, f);
            System.out.printf("%d-%d-%d\n", gn.getMin(), gn.getMax(), gn.getFeatureValue());
            System.out.println(gn.listAllFeatureNumbers());

        }

    }

}*/
