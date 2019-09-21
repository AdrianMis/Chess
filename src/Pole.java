public class Pole {
     int poleX;
     int poleY;
    boolean exist;
    int ktoTuSiedzi = 0; // 0-nikt 1-bialy 2-czarny
    Figura Figura;

    Pole(int poleX, int poleY, int ktoTuSiedzi, Figura Figura,boolean exist) {
        this.poleX = poleX;
        this.poleY = poleY;
        this.exist = exist;
        this.ktoTuSiedzi = ktoTuSiedzi;

        this.Figura = Figura;

    }

    public void setFigura(Figura Figura) {
        this.Figura = Figura;
    }

    public Figura getFigura() {
        return Figura;
    }

    int czyZajete() {
        return Figura.wlasciciel;
    }

    //wyświetla numer pola np: E4
    void nazwa(){
if (poleX==1){ System.out.print("A");}
else if (poleX==2){ System.out.print("B");}
else if (poleX==3){ System.out.print("C");}
else if (poleX==4){ System.out.print("D");}
else if (poleX==5){ System.out.print("E");}
else if (poleX==6){ System.out.print("F");}
else if (poleX==7){ System.out.print("G");}
else if (poleX==8){ System.out.print("H");}
else {
    System.out.println("Pole >>> void nazwa >>> if z ");
}

        System.out.println(poleY);
    }

    public int getKtoTuSiedzi() {
        return ktoTuSiedzi;
    }
}
