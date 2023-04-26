package neuespackage;

public class Giraffe extends Animal{

    protected int anzahlFlecken;

    @Override
    public void move(int meters) {
        System.out.println("Giraffe " + name + " stolziert " + meters + " weit. ");
    }

    @Override
    public void makeNoise(String withComment) {
        System.out.println("Schmatz schmatz: " + withComment);
    }

    public Giraffe(String name, int anzahlBeine, String augenfarbe) {
        super(name, anzahlBeine, augenfarbe);
        anzahlFlecken = 40; //die typische Anzahl ;)
    }

    public Giraffe(String name, int anzahlBeine, String augenfarbe, int anzahlFlecken) {
        super(name, anzahlBeine, augenfarbe);
        this.anzahlFlecken = anzahlFlecken;
    }

    public void praesentiertFlecken(){
        System.out.println("Giraffe " + name + " hat " + anzahlFlecken + " Flecken ");
    }
}
