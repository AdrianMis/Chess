public class Pole {
    String name;
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
        switch (poleX) {
            case 1:
                System.out.print("A");
            case 2:
                System.out.print("B");
            case 3:
                System.out.print("C");
            case 4:
                System.out.print("D");
            case 5:
                System.out.print("E");
            case 6:
                System.out.print("F");
            case 7:
                System.out.print("G");
            case 8:
                System.out.print("H");
        }
        System.out.println(poleY);
    }

    public int getKtoTuSiedzi() {
        return ktoTuSiedzi;
    }
}
