import com.Okienko;
import javax.swing.JFrame;
import java.util.Scanner;

public class Main {

    private static Figura Figura = new Pustak(0, 0, 0, "--", false);

    public static void main(String[] args) {
        Okienko Szachy= new Okienko();
        Figura Pustak;
        //Tworzenie graczy
        Gracz Bialy = new Gracz(true, true, "Biały");
        Gracz Czarny = new Gracz(false, false, "Czarny");

        //Tworzenie Figur
        Pionek P1 = new Pionek(1, 2, 1, "bP", true);
        Pionek P2 = new Pionek(2, 2, 1, "bP", true);
        Pionek P3 = new Pionek(3, 2, 1, "bP", true);
        Pionek P4 = new Pionek(4, 2, 1, "bP", true);
        Pionek P5 = new Pionek(5, 2, 1, "bP", true);
        Pionek P6 = new Pionek(6, 2, 1, "bP", true);
        Pionek P7 = new Pionek(7, 2, 1, "bP", true);
        Pionek P8 = new Pionek(8, 2, 1, "bP", true);
        Skoczek Skoczek1 = new Skoczek(2, 1, 1, "bS", true);
        Skoczek Skoczek2 = new Skoczek(7, 1, 1, "bS", true);

        //CZanre
        Pionek P11 = new Pionek(1, 7, 2, "cP", true);
        Pionek P12 = new Pionek(2, 7, 2, "cP", true);
        Pionek P13 = new Pionek(3, 7, 2, "cP", true);
        Pionek P14 = new Pionek(4, 7, 2, "cP", true);
        Pionek P15 = new Pionek(5, 7, 2, "cP", true);
        Pionek P16 = new Pionek(6, 7, 2, "cP", true);
        Pionek P17 = new Pionek(7, 7, 2, "cP", true);
        Pionek P18 = new Pionek(8, 7, 2, "cP", true);
        Skoczek Skoczek11 = new Skoczek(2, 8, 1, "cS", true);
        Skoczek Skoczek12 = new Skoczek(7, 8, 1, "cS", true);
        //Pustak
        Figura Figura = new Pustak(0, 0, 0, "--", false);


        //TWORZENIE TABLICY DWUWYMIAROWEJ OBIEKTÓW POLE, które stworzą szachownice
        Pole[][] Szachownica = new Pole[8][8];

        //a1-h1
        Szachownica[0][0] = new Pole(1, 1, 1, Figura, true);
        Szachownica[1][0] = new Pole(2, 1, 1, Skoczek1, true);
        Szachownica[2][0] = new Pole(3, 1, 1, Figura, true);
        Szachownica[3][0] = new Pole(4, 1, 1, Figura, true);
        Szachownica[4][0] = new Pole(5, 1, 1, Figura, true);
        Szachownica[5][0] = new Pole(6, 1, 1, Figura, true);
        Szachownica[6][0] = new Pole(7, 1, 1, Skoczek2, true);
        Szachownica[7][0] = new Pole(8, 1, 1, Figura, true);
        //a2-h2
        Szachownica[0][1] = new Pole(1, 2, 1, P1, true);
        Szachownica[1][1] = new Pole(2, 2, 1, P2, true);
        Szachownica[2][1] = new Pole(3, 2, 1, P3, true);
        Szachownica[3][1] = new Pole(4, 2, 1, P4, true);
        Szachownica[4][1] = new Pole(5, 2, 1, P5, true);
        Szachownica[5][1] = new Pole(6, 2, 1, P6, true);
        Szachownica[6][1] = new Pole(7, 2, 1, P7, true);
        Szachownica[7][1] = new Pole(8, 2, 1, P8, true);
        //a3-h3
        Szachownica[0][2] = new Pole(1, 3, 0, Figura, true);
        Szachownica[1][2] = new Pole(2, 3, 0, Figura, true);
        Szachownica[2][2] = new Pole(3, 3, 0, Figura, true);
        Szachownica[3][2] = new Pole(4, 3, 0, Figura, true);
        Szachownica[4][2] = new Pole(5, 3, 0, Figura, true);
        Szachownica[5][2] = new Pole(6, 3, 0, Figura, true);
        Szachownica[6][2] = new Pole(7, 3, 0, Figura, true);
        Szachownica[7][2] = new Pole(8, 3, 0, Figura, true);
        //a4-h4
        Szachownica[0][3] = new Pole(1, 4, 0, Figura, true);
        Szachownica[1][3] = new Pole(2, 4, 0, Figura, true);
        Szachownica[2][3] = new Pole(3, 4, 0, Figura, true);
        Szachownica[3][3] = new Pole(4, 4, 0, Figura, true);
        Szachownica[4][3] = new Pole(5, 4, 0, Figura, true);
        Szachownica[5][3] = new Pole(6, 4, 0, Figura, true);
        Szachownica[6][3] = new Pole(7, 4, 0, Figura, true);
        Szachownica[7][3] = new Pole(8, 4, 0, Figura, true);
        //a5-h5
        Szachownica[0][4] = new Pole(1, 5, 0, Figura, true);
        Szachownica[1][4] = new Pole(2, 5, 0, Figura, true);
        Szachownica[2][4] = new Pole(3, 5, 0, Figura, true);
        Szachownica[3][4] = new Pole(4, 5, 0, Figura, true);
        Szachownica[4][4] = new Pole(5, 5, 0, Figura, true);
        Szachownica[5][4] = new Pole(6, 5, 0, Figura, true);
        Szachownica[6][4] = new Pole(7, 5, 0, Figura, true);
        Szachownica[7][4] = new Pole(8, 5, 0, Figura, true);
        //a6-h6
        Szachownica[0][5] = new Pole(1, 6, 0, Figura, true);
        Szachownica[1][5] = new Pole(2, 6, 0, Figura, true);
        Szachownica[2][5] = new Pole(3, 6, 0, Figura, true);
        Szachownica[3][5] = new Pole(4, 6, 0, Figura, true);
        Szachownica[4][5] = new Pole(5, 6, 0, Figura, true);
        Szachownica[5][5] = new Pole(6, 6, 0, Figura, true);
        Szachownica[6][5] = new Pole(7, 6, 0, Figura, true);
        Szachownica[7][5] = new Pole(8, 6, 0, Figura, true);
        //a7-h7
        Szachownica[0][6] = new Pole(1, 7, 2, P11, true);
        Szachownica[1][6] = new Pole(2, 7, 2, P12, true);
        Szachownica[2][6] = new Pole(3, 7, 2, P13, true);
        Szachownica[3][6] = new Pole(4, 7, 2, P14, true);
        Szachownica[4][6] = new Pole(5, 7, 2, P15, true);
        Szachownica[5][6] = new Pole(6, 7, 2, P16, true);
        Szachownica[6][6] = new Pole(7, 7, 2, P17, true);
        Szachownica[7][6] = new Pole(8, 7, 2, P18, true);
        //a8-h8
        Szachownica[0][7] = new Pole(1, 8, 2, Figura, true);
        Szachownica[1][7] = new Pole(2, 8, 2, Skoczek11, true);
        Szachownica[2][7] = new Pole(3, 8, 2, Figura, true);
        Szachownica[3][7] = new Pole(4, 8, 2, Figura, true);
        Szachownica[4][7] = new Pole(5, 8, 2, Figura, true);
        Szachownica[5][7] = new Pole(6, 8, 2, Figura, true);
        Szachownica[6][7] = new Pole(7, 8, 2, Skoczek12, true);
        Szachownica[7][7] = new Pole(8, 8, 2, Figura, true);


        //x64
        Scanner scan = new Scanner(System.in);

        int zX;
        int zY;
        int naX;
        int naY;


        for (int i = 0; i < 8; i++) {
            for (int j = 7; j >= 0; j--) {
                System.out.print(" " + Szachownica[j][i].Figura.name + " ");
            }
            System.out.println();
        }
        //CLUE

        while (true) {
            // Z POLA
            System.out.println("Z pola: x (1 do 8)");
            zX = scan.nextInt();
            System.out.println("y (1 do 8)");
            zY = scan.nextInt();

            // NA POLE
            System.out.println("Idziesz na pole: x (1 do 8)");
            naX = scan.nextInt();
            System.out.println("y (1 do 8)");
            naY = scan.nextInt();
            //Bialy
            if (Bialy.kogoKolej == true) {
                System.out.println("Biały");
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if ((Szachownica[i][j].poleY == zY) && (Szachownica[i][j].poleX == zX)) {
                            Szachownica[i][j].Figura.Ruch(Szachownica[(naX - 1)][(naY - 1)], Bialy, Czarny, Szachownica[(naX - 1)][(naY - 1)].getFigura(), Szachownica, Szachownica[(zX - 1)][(zY - 1)].getFigura());

                        }
                    }
                }
                //CZARNY
            } else if (Bialy.kogoKolej == false) {
                System.out.println("Czarny");
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if ((Szachownica[i][j].poleY == zY) && (Szachownica[i][j].poleX == zX)) {
                            Szachownica[i][j].Figura.Ruch(Szachownica[(naX - 1)][(naY - 1)], Czarny, Bialy, Szachownica[(naX - 1)][(naY - 1)].getFigura(), Szachownica, Szachownica[(zX - 1)][(zY - 1)].getFigura());
                        }
                    }
                }

            } else {
                System.out.println("Spróbuje jeszcze raz");
            }

            for (int i = 0; i < 8; i++) {
                for (int j = 7; j >= 0; j--) {
                    System.out.print(" " + Szachownica[j][i].Figura.name + " ");
                }
                System.out.println();

            }
        }
    }

    public static Figura getPustak() {
        return Figura;
    }
}