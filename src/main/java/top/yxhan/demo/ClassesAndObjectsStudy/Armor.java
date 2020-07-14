package top.yxhan.demo.ClassesAndObjectsStudy;

// 防具 继承
public class Armor extends Item {
    int armor; //装备护甲值

    public static void main (String[] args) {
        Armor angelGuard = new Armor();

        angelGuard.armor = 999;

        angelGuard.name = "守护天使";
        angelGuard.price = 5200;
    }



}