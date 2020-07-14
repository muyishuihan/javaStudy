package top.yxhan.demo.ClassesAndObjectsStudy;

public class ADHero extends Hore {

    public void attack () {
        System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");
    }

    public void attack (Hore h1) {
        System.out.println(name + "对" + h1.name + "进行了一次攻击 ");
    }

    public void attack (Hore h1, Hore h2) {
        System.out.println(name + "同时对" + h1.name + "和" + h2.name + "进行了攻击 ");
    }

    public static void main (String args[]) {
        ADHero ADHore = new ADHero();
        ADHore.name = "好运姐";

        Hore Hore1 = new Hore();
        Hore1.name = "盖伦";

        Hore Hore2 = new Hore();
        Hore2.name = "马猴猫咪";

        ADHore.attack();
        ADHore.attack(Hore1);
        ADHore.attack(Hore1, Hore2);


    }


}
