package top.yxhan.demo.ClassesAndObjectTransferParameters;

public class Warframe4 {
    String name;    //战甲名字
    float hp;       //战甲生命值
    float armor;    //战甲护甲
    float shield;   //战甲护盾

    public Warframe4 () {}

    public Warframe4 (String name, float warframeHp) {
        this.name = name;
        hp = warframeHp;
    }

    //复活
    public void revive (Warframe4 warframe) {
        warframe  = new Warframe4("电男2", 300);
    }

    public static void main (String[] args) {
        Warframe4 volt = new Warframe4("电男1", 350);

        //受到400点伤害，暴毙了
        volt.hp = volt.hp - 400;

        volt.revive(volt);

        //问题来了，System.out.println输出是多少呢？怎么理解？
        System.out.println("当前电男的名字：" + volt.name);
        System.out.println("当前电男的血量：" + volt.hp);
    }

}
