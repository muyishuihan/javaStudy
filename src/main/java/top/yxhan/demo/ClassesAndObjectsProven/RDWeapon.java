package top.yxhan.demo.ClassesAndObjectsProven;

//重载
public class RDWeapon extends Weapon {
    public void equivalentFusion() {
        System.out.println("武器：" + name + " 使用材料进行了一次等效融合。");
    }

//    public void equivalentFusion(Weapon W1){
//        System.out.println("武器A：" + name +  " 对武器B：" + W1.name + " 使用了一次等效融合。");
//    }
//
//    public void equivalentFusion(Weapon W1, Weapon W2){
//        System.out.println("武器A：" + name +  " 对武器B：" + W1.name + "和武器C：" + W2.name + " 使用了一次等效融合。");
//    }

    public void equivalentFusion(Weapon... Ws) {
        for (int i = 0; i < Ws.length; i++) {
            System.out.println("武器：" + name + " 等效融合了武器：" + Ws[i].name);
        }
    }

    public static void main (String[] args) {
        RDWeapon buLaMa = new RDWeapon();
        buLaMa.name = "25%布拉码";

        Weapon Weapon1 = new Weapon();
        Weapon1.name = "37%布拉码";

        Weapon Weapon2 = new Weapon();
        Weapon2.name = "55%布拉码";

        buLaMa.equivalentFusion();
        buLaMa.equivalentFusion(Weapon1);
        buLaMa.equivalentFusion(Weapon1, Weapon2);

    }
}
 