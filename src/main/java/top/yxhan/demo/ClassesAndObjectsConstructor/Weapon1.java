package top.yxhan.demo.ClassesAndObjectsConstructor;

public class Weapon1 {
    String name; //武器名字
    float damage; //伤害
    float attackSpeed; //攻速
    float range; //范围


    //方法名与类名一样（包括大小写）
    //没有返回类型
//    public Weapon() {
//        System.out.println("实例化一个对象时，必然调用构造方法");
//    }



//    public static void main (String[] args) {
//        //实例化一个对象的时候，必然调用构造方法
//        Weapon buLaMa = new Weapon();
//        buLaMa.name = "布拉码";
//        buLaMa.damage = 35f;
//
//        Weapon jueLu = new Weapon();
//        jueLu.name = "绝路";
//        jueLu.damage = 200f;
//    }

    //有参的构造方法
    //默认的无参构造方法就失效了
//    public Weapon (String weaponName){
//        name = weaponName;
//    }
//
//    public static void main (String[] args){
//        Weapon BuLaMa = new Weapon("布拉码");
//
//        Weapon JueLu = new Weapon();//无参的构造方法“木有了”
//    }

    //带一个参数得构造方法
    public Weapon1(String weaponName){
        name = weaponName;
    }

    //带两个参数得构造方法
    public Weapon1(String weaponName, float weaponDamage){
        name = weaponName;
        damage = weaponDamage;
    }

    //带四个参数得构造方法
    public Weapon1(String weaponName, float weaponDamage, float weaponAttackSpeed, float weaponRange){
        name = weaponName;
        damage = weaponDamage;
        attackSpeed = weaponAttackSpeed;
        range = weaponRange;
    }

    public static void main (String[] args){
        Weapon1 buLaMa = new Weapon1("布拉码");

        Weapon1 jueLu = new Weapon1("绝路", 200);

        Weapon1 haiBo = new Weapon1("海波对剑", 35, 1, 2);

    }



}
