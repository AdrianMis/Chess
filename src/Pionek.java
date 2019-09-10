public class Pionek extends Figura {
    Pionek(int cordX, int cordY, int wlasciciel, String name,boolean exist) {
        super(cordX, cordY, wlasciciel, name,exist);
    }

    @Override
    // Pole na które idziemy, Figura którą bijemy
    public void bicie(Pole Pole, Gracz Ja, Gracz Oponent, Figura Figura) {
        //IF BIAŁY BIJE CZARNEGO
        if (Ja.kolor = true) {
            if (Pole.ktoTuSiedzi == 2) {
                Pole.Figura.Dead();
                Pole.Figura=Figura;
                Ja.kogoKolej = false;
                Oponent.kogoKolej = true;
            } else {
                System.out.println("Sie nie da zbic tej figury cos nie tak");
            }
        }

        // IF CZARNY BIJE BIAŁEGO
        else if (Ja.kolor = false) {
            if (Pole.ktoTuSiedzi == 1) {
                Pole.Figura.Dead();
                Pole.Figura=Figura;
                Ja.kogoKolej = false;
                Oponent.kogoKolej = true;
            } else {
                System.out.println("Sie nie da zbic tej figury cos nie tak");
            }
        } else System.out.println("coś nie tak z biciem");
    }///////////////////BICIE/////////////

    @Override
    public void Ruch(Pole Pole, Gracz Ja, Gracz Oponent, Figura Figura, Pole Szachownica[][]) {
        /*
        1.Czy Pole na które idziemy istnieje
        2.Jaki to gracz (true = bialy, false = czarny)
        3.Czy dana figura robi taki ruch
        4.Czy pole jest zajęte jeśli nie(0) to idź, jeśli przez przeciwnika
        (1=bialy, 2=czarny) to zrob adekwatny ruch lub jego brak
        */

        if (Pole.exist) {

            /////BIAŁY
            if (Ja.kolor == true) {
                //1 do przodu
                if (Pole.poleX == cordX && Pole.poleY == (cordY + 1)) {
                    //Czy na polu nic nie ma
                    if (Pole.getKtoTuSiedzi() == 0)//puste
                    {
                        cordX = Pole.poleX;
                        cordY = Pole.poleY;
                        Pole.ktoTuSiedzi = 1;
                        System.out.println(name + Pole.poleX + Pole.poleY/*albo Pole.name*/);
                        Ja.kogoKolej = false;
                        Oponent.kogoKolej = true;
                        //POPRAWNIE WYKONANY RUCH
                    } else if (Pole.getKtoTuSiedzi() == 1)//swoj(bialy)
                    {
                        System.out.println("Nie mogę atakować własnego pionka");
                    } else if (Pole.getKtoTuSiedzi() == 2)//wrog(czarny)//
                    {
                        System.out.println("Nie można bić w ten sposób");
                    } else {
                        System.out.println("coś się zepsuło, nie było mnie słychać");
                    }

                }//////////Koniec ruchu do przodu o 1

                //2 do przodu
                else if (Pole.poleX == cordX && Pole.poleY == (cordY + 2)) {
                    //Czy na polu nic nie ma
                    if (Pole.getKtoTuSiedzi() == 0)//puste
                    {
                        for (int i = 0; i < 8; i++) {
                            for (int j = 0; j < 8; j++) {
                                if ((Pole.poleX-1)==Szachownica[i][j].poleX) {

                                }
                            }
                        }

                        if () {
                            cordX = Pole.poleX;
                            cordY = Pole.poleY;
                            Pole.ktoTuSiedzi = 1;
                            System.out.println(name + Pole.poleX + Pole.poleY/*albo Pole.name*/);
                            Ja.kogoKolej = false;
                            Oponent.kogoKolej = true;
                            //POPRAWNIE WYKONANY RUCH
                        }

                        //POPRAWNIE WYKONANY RUCH
                    } else if (Pole.getKtoTuSiedzi() == 1)//swoj(bialy)
                    {
                        System.out.println("Nie mogę atakować własnego pionka");
                    } else if (Pole.getKtoTuSiedzi() == 2)//wrog(czarny)//
                    {
                        System.out.println("Nie można bić w ten sposób");
                    } else {
                        System.out.println("coś się zepsuło, nie było mnie słychać");
                    }


                }
                //Bicie ukos lewy
                else if (true) {
                }
                //Bicie ukos prawy
                else if (true) {
                }
                //Bicie w przelocie

                else {
                    System.out.println("Nie maożesz pójść w to miejsce");
                }
            }// IF kogo RUCH BIAŁY <<<<<<<<<<>>>>>>>>>>










            ////////////KOLOR CZARNY
            else if (Ja.kolor == false) {

            }// IF CZARNY kolor


            else System.out.println("Nie ma takiego gracza");


        }//kolor gracza IF
        else System.out.println("Sie nie da, bo Pole nie istnieje");

    }//RUCH VOID
} // Pionek Class
