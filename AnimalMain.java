package neuespackage;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
        // Animal a = new Animal(); // keine Instanz erzeugen möglich, da abstrakt!

        Giraffe georg = new Giraffe("Georg", 4, "braun", 3);
        Papagei coco = new Papagei("Coco", 2, "blau");

        georg.makeNoise(", lecker ");
        georg.move(50);
        georg.praesentiertFlecken();

        coco.makeNoise("Braver Coco");
        coco.gibInfos();
        coco.move(20);

        // upcasten auch auf abstrakte basisklasse
        Animal g1 = georg;

        ArrayList<Animal>zoo = new ArrayList<>();
        zoo.add(g1);
        zoo.add(coco);

        for (Animal a : zoo){
            a.move(100);
        }
    }
}