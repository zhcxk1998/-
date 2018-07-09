/*import java.util.*;

class GeometricObject {
    private String color = "white";
    private boolean filled = false;
    private java.util.Date dateCreated;

    public GeometricObject() {

    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "created on" + dateCreated + "\ncolor: ";
    }
}


class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double p = (side1 + side2 + side3) / 2;
        double s = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return s;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double side1,side2,side3;
            side1=sc.nextDouble();
            side2=sc.nextDouble();
            side3=sc.nextDouble();
            String color=sc.next();
            boolean filled=sc.nextBoolean();
            Triangle sanjiao=new Triangle(side1,side2,side3);
            sanjiao.setColor(color);
            sanjiao.setFilled(filled);
            System.out.println(String.format("%.2f %.2f %s %b",sanjiao.getArea(),sanjiao.getPerimeter(),sanjiao.getColor(),sanjiao.isFilled()));
        }
        sc.close();
    }
}*/



import java.util.*;

class People {
    private String name = "";
    private String address = "";
    private String phone = "";
    private String email = "";

    People() {

    }

    People(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return name + " " + address + " " + phone + " " + email;
    }
}

class MyDate{
    private int year;
    private int month;
    private int day;
    private String time = "";
    private Date MyDate;

    public MyDate() {
        this.MyDate = new Date();
    }

    public MyDate(long time) {
        this.MyDate = new Date(time);
    }

    public MyDate(String time) {
        int index = 0;
        for (int i = index; time.charAt(i) != '-'; i++) {
            this.year = this.year * 10 + (int) time.charAt(i) - 48;
//            System.out.println(index+"这是index");
            index++;

        }
        index++;
        for (int i = index; time.charAt(i) != '-'; i++) {
            this.month = this.month * 10 + (int) time.charAt(i) - 48;
//            System.out.println(index+"这是index22222222222");
            index++;
        }
        index++;
        for (int i = index; i < time.length(); i++) {
            this.day = this.day * 10 + (int) time.charAt(i) - 48;
        }
        this.time += this.year + "-" + this.month + "-" + this.day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime) {
        MyDate = new Date(elapsedTime);
    }

    public String getTime() {
        return time;
    }
}

class Employee extends People {
    private String office = "";
    private double salary;
    private String date = "";

    Employee() {

    }

    Employee(String name, String address, String phone, String email, String office, double salary, String date) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        MyDate mydate = new MyDate(date);
        this.date = mydate.getTime();
    }

    public String toString() {
        return super.toString() + " " + office + " " + salary + " " + date;
    }
}

class Student extends People {
    private final String nianji1 = "Freshman";
    private final String nianji2 = "Sophomore";
    private final String nianji3 = "Junior";
    private final String nianji4 = "Senior";
    private int status;
    private String nianji = "";

    Student(String name, String address, String phone, String email, int status) {
        super(name, address, phone, email);
        this.status = status;
        if (status == 1)
            this.nianji = nianji1;
        else if (status == 2)
            this.nianji = nianji2;
        else if (status == 3)
            this.nianji = nianji3;
        else if (status == 4)
            this.nianji = nianji4;
    }

    public String toString() {
        return super.toString() + " " + nianji;
    }


}

class Faculty extends Employee {
    private String time = "";
    private int level;

    Faculty(String name, String address, String phone, String email, String office, double salary, String date, String time, int level) {
        super(name, address, phone, email, office, salary, date);
        this.time = time;
        this.level = level;
    }

    public String toString() {
        return super.toString() + " " + time + " " + level;
    }

}

class Staff extends Employee {
    private String chenghao = "";

    Staff(String name, String address, String phone, String email, String office, double salary, String date, String chenghao) {
        super(name, address, phone, email, office, salary, date);
        this.chenghao = chenghao;
    }

    public String toString() {
        return super.toString() + " " + chenghao;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        String address;
        String phone;
        String email;
        int status;
        String office;
        double salary;
        String date;
        String time;
        int level;
        String chenghao;
        name = sc.nextLine();
        address = sc.nextLine();
        phone = sc.nextLine();
        email = sc.nextLine();
        People one = new People(name, address, phone, email);
        System.out.println(one.toString());


        name = sc.nextLine();
        address = sc.nextLine();
        phone = sc.nextLine();
        email = sc.nextLine();
        status = sc.nextInt();
        sc.nextLine();
        Student two = new Student(name, address, phone, email, status);
        System.out.println(two.toString());


        name = sc.nextLine();
        address = sc.nextLine();
        phone = sc.nextLine();
        email = sc.nextLine();
        office = sc.nextLine();
        salary = sc.nextDouble();
        sc.nextLine();
        date = sc.nextLine();
        Employee three = new Employee(name, address, phone, email, office, salary, date);
        System.out.println(three.toString());


        name = sc.nextLine();
        address = sc.nextLine();
        phone = sc.nextLine();
        email = sc.nextLine();
        office = sc.nextLine();
        salary = sc.nextDouble();
        sc.nextLine();
        date = sc.nextLine();
        time = sc.nextLine();
        level = sc.nextInt();
        sc.nextLine();
        Faculty four = new Faculty(name, address, phone, email, office, salary, date, time, level);
        System.out.println(four.toString());


        name = sc.nextLine();
        address = sc.nextLine();
        phone = sc.nextLine();
        email = sc.nextLine();
        office = sc.nextLine();
        salary = sc.nextDouble();
        sc.nextLine();
        date = sc.nextLine();
        chenghao = sc.nextLine();
        Staff five = new Staff(name, address, phone, email, office, salary, date, chenghao);
        System.out.println(five.toString());


        sc.close();
    }
}
