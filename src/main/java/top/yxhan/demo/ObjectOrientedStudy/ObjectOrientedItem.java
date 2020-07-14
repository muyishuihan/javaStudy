package top.yxhan.demo.ObjectOrientedStudy;

public class ObjectOrientedItem {//物品类

    String name; //属性：名字

    int price; //属性：价格

    public static void main (String[] args){
        ObjectOrientedItem healthPots = new ObjectOrientedItem();
        healthPots.name = "血瓶";
        healthPots.price = 50;
        System.out.println("第一个物品名字：" + healthPots.name + " 价格是：" + healthPots.price);

        ObjectOrientedItem strawSandals = new ObjectOrientedItem();
        strawSandals.name = "草鞋";
        strawSandals.price = 300;
        System.out.println("第二个物品名字：" + strawSandals.name + " 价格是：" + strawSandals.price);

        ObjectOrientedItem sword = new ObjectOrientedItem();
        sword.name = "长剑";
        sword.price = 350;
        System.out.println("第三个物品名字：" + sword.name + " 价格是：" + sword.price);

    }
}
