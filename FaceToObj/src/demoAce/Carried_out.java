package demoAce;

public class Carried_out {
    public static void main(String[] args) {
        Heros heros1 = new Heros("皎月女神-戴安娜",-106);
        System.out.println("英雄名称:"+heros1.getHero_name()+",战斗力:"+heros1.getCE());

        System.out.println("======================================");

        Heros heros2 = new Heros("腕豪-瑟提",96);
        System.out.println("英雄名称:"+heros2.getHero_name()+",战斗力:"+heros2.getCE());
    }
}
