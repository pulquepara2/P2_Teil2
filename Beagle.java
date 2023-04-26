package neuespackage;

public class Beagle extends Dog{
    public String lovedFood;

    // wenn wir einen Default Konstruktor Dog() in Basisklasse haben, wird dieser automatisch zu Beginn dieses Konstruktors
    // aufgerufen , falls es diesen nicht gibt, oder wir einen andern verwenden möchten, rufen wir mit super(..) explizit den
    // Konstruktor der Basisklasse auf (den wir möchten)
    // Benennung name2 und age2 absichtlich anders zur Illustration

    public Beagle(String name2, int age2, String lovedFood) {
        super(name2, age2);
        this.lovedFood = lovedFood;
    }
    // neue Methoden

    public void eatsLovedFood(){
        System.out.println(getName() + " (" + age + ")" + " isst " + lovedFood);
    }

    // Methode, die in der Basisklasse generiert wurde, für Beagle überschreiben (overriding)

    @Override
    public void bark(String wuff) {
        System.out.println(getName() + " bellt und jammert: " + wuff);
    }
}
