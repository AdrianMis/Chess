public class Skoczek extends Figura {

    Skoczek(int cordX, int cordY, int wlasciciel, String name, boolean exist) {
        super(cordX, cordY, wlasciciel, name, exist);
    }

    @Override
    public void bicie(Pole pole, Gracz Ja, Gracz Oponent, Figura Figura) {

    }

    @Override
    public void Ruch(Pole naPole, Gracz Ja, Gracz Oponent, Figura Figura, Pole[][] Szachownica, Figura MojaFigura) {
 /*
        Pole=Pole na które idziemy, Figura=Figura Figura która stoi na tym polu(Może być brak czyli pustak)
        1.Czy Pole na które idziemy istnieje
        2.Jaki to gracz (true = bialy, false = czarny) && Czy figura należy do nas ???
        4.Czy dana figura robi taki ruch
        5.Czy pole jest zajęte jeśli nie(0) to idź, jeśli przez przeciwnika
        (1=bialy, 2=czarny) to zrob adekwatny ruch lub jego brak
        */
        //czy pole istnieje
        if (naPole.exist) {
            //czy jesteśmy białym i czy figura należy do nas
            if ((MojaFigura.getWlasciciel() == 1) &&(Ja.kolor==true)){
                //wszystkie pola na które możemy iść
                if((naPole.poleX == (cordX-1) && naPole.poleY == (cordY + 2))||(naPole.poleX == (cordX-2) && naPole.poleY == (cordY + 1))||(naPole.poleX == (cordX-2) && naPole.poleY == (cordY - 1))||(naPole.poleX == (cordX+2) && naPole.poleY == (cordY - 1))||(naPole.poleX == (cordX+2) && naPole.poleY == (cordY + 1))||(naPole.poleX == (cordX+1) && naPole.poleY == (cordY +2))||(naPole.poleX == (cordX+1) && naPole.poleY == (cordY - 2))||(naPole.poleX == (cordX-1) && naPole.poleY == (cordY - 2)))
                {
                    Szachownica[cordX - 1][cordY - 1].Figura = Main.getPustak();
                    Szachownica[cordX - 1][cordY - 1].ktoTuSiedzi = 0;
                    cordX = naPole.poleX;
                    cordY = naPole.poleY;
                    naPole.ktoTuSiedzi = 1;
                    naPole.Figura = MojaFigura;
                    System.out.print(name);
                    naPole.nazwa();
                    Ja.kogoKolej = false;
                    Oponent.kogoKolej = true;
                    //POPRAWNIE WYKONANY RUCH
                }else System.out.println("blad");
            }//BIALY
            else if ((MojaFigura.getWlasciciel() == 2) &&(Ja.kolor==false)){
                //wszystkie pola na które możemy iść
                if((naPole.poleX == (cordX-1) && naPole.poleY == (cordY + 2))||(naPole.poleX == (cordX-2) && naPole.poleY == (cordY + 1))||(naPole.poleX == (cordX-2) && naPole.poleY == (cordY - 1))||(naPole.poleX == (cordX+2) && naPole.poleY == (cordY - 1))||(naPole.poleX == (cordX+2) && naPole.poleY == (cordY + 1))||(naPole.poleX == (cordX+1) && naPole.poleY == (cordY +2))||(naPole.poleX == (cordX+1) && naPole.poleY == (cordY - 2))||(naPole.poleX == (cordX-1) && naPole.poleY == (cordY - 2)))
                {
                    Szachownica[cordX - 1][cordY - 1].Figura = Main.getPustak();
                    Szachownica[cordX - 1][cordY - 1].ktoTuSiedzi = 0;
                    cordX = naPole.poleX;
                    cordY = naPole.poleY;
                    naPole.ktoTuSiedzi = 2;
                    naPole.Figura = MojaFigura;
                    System.out.print(name);
                    naPole.nazwa();
                    Ja.kogoKolej = true;
                    Oponent.kogoKolej = false;
                    //POPRAWNIE WYKONANY RUCH
                }else {
                    System.out.println("blad");
                }
            }//CZARNY
        }else {
            System.out.println("blad");
        }

    }
}
