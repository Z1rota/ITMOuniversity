import pokemons.*;
import ru.ifmo.se.pokemon.*;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        NewBattle a = new NewBattle(b);
        Pokemon fp1 = new Cosmog("Папич", 10);
        Pokemon fp2 = new Aipom("Рофланыч", 9);
        Pokemon fp3 = new Ambipom("Хохол", 27);
//        a.addAlly(fp1);
//        a.addAlly(fp2);
//        a.addAlly(fp3);
        Pokemon sp1 = new Poliwag("Шахидыч", 10);
        Pokemon sp2 = new Poliwhirl("Т-34", 9);
        Pokemon sp3 = new Poliwrath("Сугома", 27);
//        a.addFoe(sp1);
//        a.addFoe(sp2);
//        a.addFoe(sp3);
        a.go();

    }


}