import java.util.Scanner;

class House implements Comparable<House> {
    private double unitPrice;
    private double area;

    House(double unitPrice, double area) {
        this.unitPrice = unitPrice;
        this.area = area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getArea() {
        return area;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public int compareTo(House o) {
        if (this.area * this.unitPrice > o.area * o.unitPrice)
            return 1;
        if (this.area * this.unitPrice == o.area * o.unitPrice)
            return 0;
        if (this.area * this.unitPrice < o.area * o.unitPrice)
            return -1;
        return 1;
    }

    @Override
    public String toString() {
        return "UnitPrice:" + String.format("%.2f", this.unitPrice) + " Area:" + String.format("%.2f", this.area) + " Total：" + String.format("%.2f", this.area * this.unitPrice);
    }
}


public class TestHouse {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            //构造五套房子 （单价，面积）
            House[] houses = new House[5];
            for (int i = 0; i < 5; i++) {
                houses[i] = new House(input.nextDouble(), input.nextDouble());
            }
            //房子按总价排序
            java.util.Arrays.sort(houses);
            for (House h : houses) {
                System.out.println(h);
            }
            //或者用传统for循环
//			for(int i = 0 ; i <houses.length;i++) {
//				System.out.println(houses[i]);
//			}


        }
        input.close();

    }

}