import ru.ifmo.se.pokemon.*;

public class NewBattle {
    private Battle battle;
    private int cnt = 0;
    public NewBattle(Battle b) {
        battle =b;
    }
    public void addFoe(Pokemon p) {
        battle.addFoe(p);
        cnt++;
    }

    public void addAlly(Pokemon p) {
        battle.addAlly(p);
        cnt++;
    }

    public void go() {
        if(cnt >0) {
            battle.go();
        } else{
            System.out.println("Братан ты покемонов не добавил");
        }

    }

}