package top.yxhan.demo.ClassesAndObjectsStudy;

public class Hore {

    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public static void main(String[] args) {
        //创建一个对象
        new Hore();

//        new ObjectOrientedHero();

        //使用一个引用来指向这个对象
        Hore garen = new Hore();

        garen = new Hore();

    }

}