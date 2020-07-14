package top.yxhan.demo.ObjectOrientedStudy;

public class ObjectOrientedHero {
    String heroName; //姓名

    float heroHealthPoints; //生命值

    //超神
    void legendary(){
        System.out.println("超神杀戮！！！");
    }

    //获取血量
    float getHeroHealthPoints (){
        return heroHealthPoints;
    }

    //回血
    void recoveryBlood (float needRecoveryBlood){
        heroHealthPoints = heroHealthPoints + needRecoveryBlood;
    }

    public static void main (String[] args) {
        ObjectOrientedHero garen = new ObjectOrientedHero();
        garen.heroHealthPoints = 500;

        System.out.println("盖伦当前的血量是 " + garen.heroHealthPoints);
        System.out.println("回血100");
        garen.recoveryBlood(100);
        System.out.println("盖伦当前的血量是 " + garen.getHeroHealthPoints());
    }
}
