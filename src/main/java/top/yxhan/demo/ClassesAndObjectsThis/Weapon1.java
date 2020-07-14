package top.yxhan.demo.ClassesAndObjectsThis;

public class Weapon1 {
    String name; //武器名字
    float damage; //武器伤害

    public void showAddressInMemmory () {
        System.out.println("这个this的内存地址是：" + this);
    }

    public static void main (String[] args){
        Weapon1 buLaMa = new Weapon1();
        buLaMa.name = "布拉码";
        System.out.println("这个对象的内存地址是：" + buLaMa);
        buLaMa.showAddressInMemmory();

        Weapon1 jueLu = new Weapon1();
        jueLu.name = "布拉码";
        System.out.println("这个对象的内存地址是：" + jueLu);
        jueLu.showAddressInMemmory();

    }

}
