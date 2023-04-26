package neuespackage;

import java.util.ArrayList;

public class HasenDemo {
    public static void main(String[] args) {

        Weihnachtshase schnuffel = new Weihnachtshase("Schnuffel");
        schnuffel.verteileGeschenke();
        schnuffel.hoppeln();

        Osterhase hasi = new Osterhase("Hasi");
        hasi.versteckeOstereier();
        hasi.hoppeln();
        System.out.println();
        Hasenstall h1 = new Hasenstall();
        h1.add(hasi);
        h1.add(schnuffel);
        h1.alleHoppeln();

        System.out.println("Party beginnt");
        ArrayList<GoesToParty> partypeople = new ArrayList<>();
        partypeople.add(hasi);
        partypeople.add(schnuffel);
        partypeople.add(new Hase("Bernhard"));
        partypeople.add(new Igel());

        for(GoesToParty p : partypeople){
            p.party("Karottensaft", "Karottenkuchen");
        }
    }
}