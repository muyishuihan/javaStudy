package top.yxhan.demo.ClassesAndObjectTransferParameters;

public class Warframe3 {
    String name;    //战甲名字
    float hp;       //战甲血量
    float armor;    //战甲护甲
    float shield;   //战甲护盾

    public Warframe3 () {}

    //回血
    public void recoveryHp (int hp) {
        this.hp = this.hp + hp;

        //回血完毕后，血瓶=0
        hp = 0;
    }

    public Warframe3 (String name, float warframeHp) {
        this.name = name;
        hp = warframeHp;
    }

    //攻击一个warframe，并让他掉damage的血量
    public void attack (Warframe3 warframe, int damage) {
        warframe.hp = warframe.hp - damage;
    }

    public static void main (String[] args) {
        Warframe3 volt = new Warframe3("电男", 350);
        Warframe3 mag = new Warframe3("磁妹", 300);

        volt.attack(mag, 100);
        System.out.println("磁妹血量是：" + mag.hp);
    }

}
