package demoAce;

public class Heros {
    private String Hero_name;
    private int CE;

    public Heros() {
    }

    public Heros(String hero_name, int CE) {
        Hero_name = hero_name;

        if (CE >= 0){
            this.CE = CE;
        }else{
            this.CE = 0;
            System.out.println("数据有误！已重置为0");

        }
    }

    public String getHero_name() {
        return Hero_name;
    }

    public void setHero_name(String hero_name) {
        Hero_name = hero_name;
    }

    public int getCE() {
        return CE;
    }

    public void setCE(int CE) {
            this.CE = CE;
    }
}
