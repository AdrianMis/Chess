public abstract class Figura {

    String name;
    int cordX;
    int cordY;
    boolean exist;
     int wlasciciel; // 0-nikt 1-bialy 2-czarny

    Figura(int cordX, int cordY, int wlasciciel, String name,boolean exist) {
        this.cordX = cordX;
        this.cordY = cordY;
        this.exist = true;
        this.wlasciciel = wlasciciel;
        this.name = name;
    }

    public abstract void bicie(Pole pole, Gracz Ja, Gracz Oponent, Figura Figura);



    public abstract void Ruch(Pole naPole, Gracz Ja, Gracz Oponent,Figura Figuraktorastoinadocelowympolu, Pole Szachownica[][], Figura MojaFigura);
    //Pole=Pole na które idziemy, Figura=Figura Figura która stoi na tym polu(Może być brak czyli pustak)

    public static void Dead() {

        boolean exist = false;
        int cordX = 0;
        int cordY = 0;
        //obraz znika
    }
    public int getWlasciciel() {
        System.out.println(wlasciciel);
        return wlasciciel;
    }// 0-nikt 1-bialy 2-czarny

}