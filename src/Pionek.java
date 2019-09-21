public class Pionek extends Figura {
    Pionek(int cordX, int cordY, int wlasciciel, String name, boolean exist) {
        super(cordX, cordY, wlasciciel, name, exist);
    }

    @Override
    // Pole na które idziemy, Figura którą bijemy
    public void bicie(Pole Pole, Gracz Ja, Gracz Oponent, Figura Figura) {
        //IF BIAŁY BIJE CZARNEGO
        if (Ja.kolor = true) {
            if (Pole.ktoTuSiedzi == 2) {
                Pole.Figura.Dead();
                Pole.Figura = Figura;
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
                Pole.Figura = Figura;
                Ja.kogoKolej = false;
                Oponent.kogoKolej = true;
            } else {
                System.out.println("Sie nie da zbic tej figury cos nie tak");
            }
        } else System.out.println("coś nie tak z biciem");
    }///////////////////BICIE/////////////

    @Override
    public void Ruch(Pole Pole, Gracz Ja, Gracz Oponent, Figura Figura, Pole Szachownica[][], Figura MojaFigura) {
        /*
        Pole=Pole na które idziemy, Figura=Figura Figura która stoi na tym polu(Może być brak czyli pustak)
        1.Czy Pole na które idziemy istnieje
        2.Jaki to gracz (true = bialy, false = czarny)
        3.Czy figura należy do nas ???
        4.Czy dana figura robi taki ruch
        5.Czy pole jest zajęte jeśli nie(0) to idź, jeśli przez przeciwnika
        (1=bialy, 2=czarny) to zrob adekwatny ruch lub jego brak
        */


        if (Pole.exist) {
            /////BIAŁY
            if (Ja.kolor == true) {
                //Kto jest wlascicielem figury
                if (Figura.getWlasciciel() == 1) {
                    //1 do przodu
                    if (Pole.poleX == cordX && Pole.poleY == (cordY + 1)) {
                        //Czy na polu nic nie ma
                        if (Pole.getKtoTuSiedzi() == 0)//puste
                        {
                            //MojaFigura.
                            Szachownica[cordX - 1][cordY - 1].Figura = Main.getPustak();
                            Szachownica[cordX - 1][cordY - 1].ktoTuSiedzi = 0;
                            cordX = Pole.poleX;
                            cordY = Pole.poleY;
                            Pole.ktoTuSiedzi = 1;
                            Pole.Figura = MojaFigura;
                            System.out.print(name);
                            Pole.nazwa();
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
                    else if ((Pole.poleX == cordX && Pole.poleY == (cordY + 2)) && (cordY == 2)) {
                        //Czy na polu nic nie ma
                        if (Pole.getKtoTuSiedzi() == 0)//puste
                        {
                            // Wykrywacz poprzedniego pola
                            for (int i = 0; i < 8; i++) {
                                //Tu ogólnie może być błąd, bo może i oraz j się zapisują.
                                // jak tak to po wszystkim trzeba je resetować na 0, a jak nie to nie :)
                                for (int j = 0; j < 8; j++) {
                                    if (Pole.poleX == Szachownica[i][j].poleX && (Pole.poleY == (Szachownica[i][j].poleY - 1))) {
                                        // sens 2 do przodu
                                        if (Szachownica[i][j].getKtoTuSiedzi() == 0)//pole puste
                                        {
                                            Szachownica[cordX - 1][cordY - 1].Figura = Main.getPustak();
                                            Szachownica[cordX - 1][cordY - 1].ktoTuSiedzi = 0;
                                            cordX = Pole.poleX;
                                            cordY = Pole.poleY;
                                            Pole.ktoTuSiedzi = 1;
                                            Pole.Figura = MojaFigura;
                                            System.out.print(name);
                                            Pole.nazwa();
                                            Ja.kogoKolej = false;
                                            Oponent.kogoKolej = true;
                                            i = 9;
                                            j = 9;
                                            //POPRAWNIE WYKONANY RUCH
                                        } else {
                                            System.out.println("Nie można przelatywać nad innymi figurami");
                                        }
                                    }
                                }
                            }
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
                    //Bicie ukos lewy lub prawy
                    else if (((Pole.poleX == (cordX - 1)) && (Pole.poleY == (cordY + 1))) || (Pole.poleX == (cordX + 1)) && (Pole.poleY == (cordY + 1))) {
                        Szachownica[cordX - 1][cordY - 1].Figura = Main.getPustak();
                        Szachownica[cordX - 1][cordY - 1].ktoTuSiedzi = 0;
                        cordX = Pole.poleX;
                        cordY = Pole.poleY;
                        Pole.ktoTuSiedzi = 1;
                        Pole.Figura = MojaFigura;
                        System.out.print(name);
                        Pole.nazwa();
                        Ja.kogoKolej = false;
                        Oponent.kogoKolej = true;
                        //POPRAWNIE WYKONANY RUCH

                    }
                    //Bicie w przelocie

                    else {
                        System.out.println("Nie możesz pójść w to miejsce");
                    }
                } else {
                    System.out.println("Pionek>>Ruch>>IF z getwlasciciel");
                    System.out.println("Ruszasz się nie swoją figurą");
                }//If własciciel figury

            }// IF kogo RUCH BIAŁY <<<<<<<<<<>>>>>>>>>>


            ////////////KOLOR CZARNY
            else if (Ja.kolor == false) {
                // czy figura jest Twoja?
                if (Figura.getWlasciciel() == 2) {
                    //1 do przodu
                    if (Pole.poleX == cordX && Pole.poleY == (cordY - 1)) {
                        //Czy na polu nic nie ma
                        if (Pole.getKtoTuSiedzi() == 0)//puste
                        {
                            //MojaFigura.
                            Szachownica[cordX - 1][cordY - 1].Figura = Main.getPustak();
                            Szachownica[cordX - 1][cordY - 1].ktoTuSiedzi = 0;
                            cordX = Pole.poleX;
                            cordY = Pole.poleY;
                            Pole.ktoTuSiedzi = 2;
                            Pole.Figura = MojaFigura;
                            System.out.print(name);
                            Pole.nazwa();
                            Ja.kogoKolej = false;
                            Oponent.kogoKolej = true;
                            //POPRAWNIE WYKONANY RUCH
                        } else if (Pole.getKtoTuSiedzi() == 2)//swoj(bialy)
                        {
                            System.out.println("Nie mogę atakować własnego pionka");
                        } else if (Pole.getKtoTuSiedzi() == 1)//wrog(czarny)//
                        {
                            System.out.println("Nie można bić w ten sposób");
                        } else {
                            System.out.println("coś się zepsuło, nie było mnie słychać");
                        }

                    }//////////Koniec ruchu do przodu o 1

                    //2 do przodu
                    else if ((Pole.poleX == cordX && Pole.poleY == (cordY - 2)) && (cordY == 7)) {
                        //Czy na polu nic nie ma
                        if (Pole.getKtoTuSiedzi() == 0)//puste
                        {
                            // Wykrywacz poprzedniego pola
                            for (int i = 0; i < 8; i++) {
                                //Tu ogólnie może być błąd, bo może i oraz j się zapisują.
                                // jak tak to po wszystkim trzeba je resetować na 0, a jak nie to nie :)
                                //ale tak ogolnie patrzac to chyba nie ma
                                for (int j = 0; j < 8; j++) {
                                    if (Pole.poleX == Szachownica[i][j].poleX && (Pole.poleY == (Szachownica[i][j].poleY - 1))) {
                                        // sens 2 do przodu
                                        if (Szachownica[i][j].getKtoTuSiedzi() == 0)//pole puste
                                        {
                                            Szachownica[cordX - 1][cordY - 1].Figura = Main.getPustak();
                                            Szachownica[cordX - 1][cordY - 1].ktoTuSiedzi = 0;
                                            cordX = Pole.poleX;
                                            cordY = Pole.poleY;
                                            Pole.ktoTuSiedzi = 2;
                                            Pole.Figura = MojaFigura;
                                            System.out.print(name);
                                            Pole.nazwa();
                                            Ja.kogoKolej = false;
                                            Oponent.kogoKolej = true;
                                            i = 9;
                                            j = 9;
                                            //POPRAWNIE WYKONANY RUCH
                                        } else {
                                            System.out.println("Nie można przelatywać nad innymi figurami");
                                        }
                                    }
                                }
                            }
                        } else if (Pole.getKtoTuSiedzi() == 2)//swoj(czarny)
                        {
                            System.out.println("Nie mogę atakować własnego pionka");
                        } else if (Pole.getKtoTuSiedzi() == 1)//wrog(bualy)//
                        {
                            System.out.println("Nie można bić w ten sposób");
                        } else {
                            System.out.println("coś się zepsuło, nie było mnie słychać");
                        }


                    }
                    //Bicie ukos lewy lub prawy
                    else if (((Pole.poleX == (cordX - 1)) && (Pole.poleY == (cordY - 1))) || (Pole.poleX == (cordX + 1)) && (Pole.poleY == (cordY - 1))) {
                        Szachownica[cordX - 1][cordY - 1].Figura = Main.getPustak();
                        Szachownica[cordX - 1][cordY - 1].ktoTuSiedzi = 0;
                        cordX = Pole.poleX;
                        cordY = Pole.poleY;
                        Pole.ktoTuSiedzi = 2;
                        Pole.Figura = MojaFigura;
                        System.out.print(name);
                        Pole.nazwa();
                        Ja.kogoKolej = false;
                        Oponent.kogoKolej = true;
                        //POPRAWNIE WYKONANY RUCH

                    }
                    //Bicie w przelocie

                    else {
                        System.out.println("Nie możesz pójść w to miejsce");
                    }
                } else {
                    System.out.println("Pionek>>Ruch>>IF z getwlasciciel");
                    System.out.println("Ruszasz się nie swoją figurą");
                }//If własciciel figury
            }// IF CZARNY kolor


            else System.out.println("Nie ma takiego gracza");


        }//kolor gracza IF
        else System.out.println("Sie nie da, bo Pole nie istnieje");

    }//RUCH VOID
} // Pionek Class
