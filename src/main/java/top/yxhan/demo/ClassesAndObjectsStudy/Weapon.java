package top.yxhan.demo.ClassesAndObjectsStudy;


//武器类 不继承
//public class ClassesAndObjectsWeapon {
//    String name; //武器名字
//    int price; //武器价格
//    int damage; //攻击力
//
//}




//武器类 继承
public class Weapon extends Item {
    int damage; //攻击力

    public static void main (String[] args) {
        Weapon infinityEdge = new Weapon();

        infinityEdge.damage = 64; //damage属性在ClassAndObjectsWeapon中新增

        infinityEdge.name = "无尽之刃"; //name属性继承ClassAndObjectsItem
        infinityEdge.price = 6666;


    }

}





