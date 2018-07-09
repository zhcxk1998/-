import java.util.*;
import java.util.ArrayList;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void wow() {

    }

    public String getName() {
        return name;
    }
}

class Zoo {
    private ArrayList<Object> list = new ArrayList<Object>();
    private String name;

    public Zoo() {

    }

    public Zoo(String str) {
        this.name = str;
    }

    public String getName() {
        return name;
    }

    public int count() {
        return list.size();
    }

    public void listAnimals() {
        for (Object x : list) {
            Animal a = (Animal) x;
            System.out.println(x.getClass().getName() + ":" + a.getName());
        }
    }

    public void add(Animal animal) {
        list.add(animal);
    }

    public void remove(Animal animal) {
        list.remove(animal);
    }
}

class Manager {

    private String name;
    private Zoo zoo;

    public Manager(String name) {
        this.name = name;
    }

    public void setManage(Zoo zoo) {
        this.zoo = zoo;
    }

    public void add(Animal animal) {
        zoo.add(animal);
    }

    public void remove(Animal animal) {
        zoo.remove(animal);
    }

    public Zoo getManage() {
        return zoo;
    }
}

class Tiger extends Animal {

    public Tiger(String name) {
        super(name);
        wow();
    }

    public void wow() {
        System.out.println(super.getName() + " is roaring!");
    }

}

class Snake extends Animal {

    public Snake(String name) {
        super(name);
        wow();
    }

    public void wow() {
        System.out.println(super.getName() + " is hissing!");
    }
}

public class Game {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //用户输入动物园名称 管理员名称 老虎名1 老虎名2 蛇名1 蛇名2（名字之间不允许空格）
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            // 创建一个动物园
            Zoo zoo = new Zoo(input.next());
            // 有个管理员
            Manager manager = new Manager(input.next());
            // 管理刚才创建的动物园
            manager.setManage(zoo);
            // 创建2只老虎
            Tiger tiger1 = new Tiger(input.next());
            Tiger tiger2 = new Tiger(input.next());
            // 创建2条蛇
            Snake snake1 = new Snake(input.next());
            Snake snake2 = new Snake(input.next());
            // 管理员将他们放到动物园.每次放动物到动物园时，动物都会发出叫声
            //叫声的格式：动物名 is 叫声！
            //老虎叫声用roaring,蛇叫声hissing
            manager.add(tiger1);
            manager.add(tiger2);
            manager.add(snake1);
            manager.add(snake2);
            // 查看动物园里有多少动物，和列出所有动物
            System.out.println(
                    "There are " + manager.getManage().count() + " Animals in Zoo " + manager.getManage().getName());
            manager.getManage().listAnimals();
            // 移除一只老虎后，查看动物情况
            manager.remove(tiger2);
            System.out.println(
                    "There are " + manager.getManage().count() + " Animals in Zoo " + manager.getManage().getName());
            manager.getManage().listAnimals();
        }

    }

}