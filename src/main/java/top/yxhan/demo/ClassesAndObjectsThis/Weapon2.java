package top.yxhan.demo.ClassesAndObjectsThis;

public class Weapon2 {
    String name; //武器名字
    float damage; //武器伤害


    //参数名和属性名一样
    //在方法体中，只能访问到参数name
    public void setName1(String name){
        name = name;
    }

    //为了避免出现setName1中的问题，参数名不得不使用其他变量名
    public void setName2(String weaponName){
        name = weaponName;
    }

    //通过this访问属性
    public void setName3(String name){
        //name这里指的是参数name
        //this.name这里值得就是属性name
        this.name = name;
    }

    public static void main (String[] args) {
        Weapon2 weapon2 = new Weapon2();

        weapon2.setName1("布拉码");
        System.out.println(weapon2.name);

        weapon2.setName2("绝路");
        System.out.println(weapon2.name);

        weapon2.setName3("海波");
        System.out.println(weapon2.name);
    }


}
