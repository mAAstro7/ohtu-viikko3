package ohtu;

import ohtu.verkkokauppa.Kauppa;
import ohtu.verkkokauppa.Kirjanpito;

public class Main {

    public static void main(String[] args) {
        Kauppa kauppa = doShops();
        // seuraava asiakas
        kauppa.aloitaAsiointi();
        for (int i = 0; i < 24; i++) {
            kauppa.lisaaKoriin(5);
        }
        for (String tapahtuma : Kirjanpito.getInstance().getTapahtumat()) {
            System.out.println(tapahtuma);
        }
    }

    public static Kauppa doShops() {
        Kauppa kauppa = new Kauppa();
        kauppa = addkauppa(kauppa);
        kauppa.poistaKorista(1);
        kauppa.tilimaksu("Pekka Mikkola", "1234-12345");
        kauppa.tilimaksu("Arto Vihavainen", "3425-1652");
        return kauppa;
    }
    
    public static Kauppa addkauppa(Kauppa kaup) {
        Kauppa kauppa = kaup;
        kauppa.aloitaAsiointi();
        kauppa.lisaaKoriin(1);
        kauppa.lisaaKoriin(3);
        kauppa.lisaaKoriin(3);
        return kauppa;
    }

}
