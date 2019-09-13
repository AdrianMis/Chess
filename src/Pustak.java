import javax.sound.midi.Soundbank;

public class Pustak extends Figura {
    Pustak(int cordX, int cordY, int wlasciciel, String name, boolean exist) {
        super(cordX, cordY, wlasciciel, name, exist);
    }

    @Override
    public void bicie(Pole pole, Gracz Ja, Gracz Oponent, Figura Figura) {

    }

    @Override
    public void Ruch(Pole naPole, Gracz Ja, Gracz Oponent, Figura Figura, Pole[][] Szachownica, Figura MojaFigur) {
// To coś ma się nie ruszać
        System.out.println();
        System.out.println("Oj oj oj, ktoś tu nie umie grać w szachy");
        System.out.println("Spróbuj ruszyć jeszcze raz");
        System.out.println();

    }


}
