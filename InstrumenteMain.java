package neuespackage;

public class InstrumenteMain {


        public static void main(String[] args) {
            System.out.println();
            Trompete trompete=new Trompete(2);
            Klarinette klarinette=new Klarinette(3);
            Geige geige=new Geige(4);
            Orchester orchester=new Orchester();
            orchester.add(trompete);
            orchester.add(geige);
            orchester.add(klarinette);
            klarinette.play();
            System.out.println("---------PLAY ALL---------");
            orchester.playAll();
            System.out.println("---------Alle Lautstaerke---------");
            System.out.println(orchester.playAll());





        }
}
