package top.yxhan.demo.ClassesAndObjectsThis;

public class Weapon3 {
    String name;
    float damage;

    public Weapon3 (String name) {
        System.out.println("----<1>----");
        System.out.println("一个参数的构造方法。");

        this.name = name;
        System.out.println("武器名字：" + name);

        System.out.println("----</1>----");
    }

    public Weapon3 (String name, float damage) {
        this(name);

        System.out.println("----<2>----");
        System.out.println("两个参数的构造方法。");

//        this(name);
        this.damage = damage;
        System.out.println("武器名字：" + name);
        System.out.println("武器攻击力：" + damage);

        System.out.println("----</2>----");
    }

    public static void main (String[] args) {
        Weapon3 buLaMa = new Weapon3("布拉码", 800);

        System.out.println(buLaMa.name);
    }
}
