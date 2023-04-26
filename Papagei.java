package neuespackage;

public class Papagei extends Animal{
    @Override
    public void move(int meters) {
        System.out.println("Papagei " + name + " fliegt " + meters + " Meter weit. ");
    }

    @Override
    public void makeNoise(String withComment) {
        System.out.println(name + " sagt: " + withComment);
    }

    public Papagei(String name, int anzahlBeine, String augenfarbe) {
        super(name, anzahlBeine, augenfarbe);
    }

    public void gibInfos(){
        System.out.println(name + " hat " + anzahlBeine  + " Beine und seine Augenfarbe ist  " + augenfarbe );
    }
}
