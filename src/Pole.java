public class Pole {
    String name;
     int poleX;
     int poleY;
    boolean exist;
    int ktoTuSiedzi = 0; // 0-nikt 1-bialy 2-czarny
    static int nrPola;
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

    public int getKtoTuSiedzi() {
        return ktoTuSiedzi;
    }
}
