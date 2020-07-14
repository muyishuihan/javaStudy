package top.yxhan.demo.ClassesAndObjectTransferParameters;

public class Warframe1 {
    String name;    //战甲名字
    float hp;       //战甲血量
    float armor;    //战甲护甲
    float shield;   //战甲护盾

    public Warframe1 () {}

    //回血
    public void recoveryHp (int hp) {
        this.hp = this.hp + hp;

        //回血完毕后，血瓶=0
        hp = 0;
    }

    public Warframe1 (String name, float warframeHp) {
        this.name = name;
        hp = warframeHp;
    }

    public static void main (String[] args) {
        Warframe1 volt = new Warframe1("电男", 350);

        System.out.println("当前电男的血量是：" + volt.hp);

        //血球，恢复50血
        int bloodBottle = 50;

        //电男骑了一个血球
        volt.recoveryHp(bloodBottle);

        System.out.println("电男恰了血球之后的血量：" + volt.hp);
        System.out.println("这个血球还剩多少血：" + bloodBottle);

    }
}
