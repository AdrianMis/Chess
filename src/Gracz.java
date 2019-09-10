public class Gracz {
    //true=biały // false=czarny
    boolean kolor;
    boolean kogoKolej;
    String name;

    Gracz(boolean kolor, boolean kogoKolej, String name) {
        this.kolor = kolor;
        this.kogoKolej = kogoKolej;
        this.name = name;    }
}