package neuespackage;

public class App {
    public static void main(String[] args) {
        //Statische Attribute können ohne Objekt oder Instanz verwendet werden
        System.out.println(Dog.latinName);
        Dog.printLatinName();

        Beagle snoopy = new Beagle("Snoopy", 30, "Lasagne");
        snoopy.eatsLovedFood();
        snoopy.bark("auuuu");

        Dog d = new Dog("Baxter", 7);
        d.bark("wuff, wuff");

        //upcasting und downcasting
        // upcasting

        Dog freddie = new Beagle("Freddie", 5,"Gulasch");
        Dog doggo = freddie;
        // bellt wie ein Beagle, da eine Beagle Instanz auf der Dog Referenz ist
        doggo.bark("wuff");
        //über doogo refernz sehe ich nur Dog Methoden/Attribute
        //obwohl jetzt zufälligerweise sogar ein Beagle der mehr kann drauf ist

        // Exkurs: int vs Integer

        int a1 = 12; // primitiver Datentyp

        Integer a2 = new Integer(13); //komplexer Referenztyp
        Integer a3 = 14; // Autoboxing, es passiert automatisch das in der Zeile darüber
        System.out.println(a1);
        System.out.println(a2);

        //exkurs parseInt

        String test = "55";
        System.out.println(test + 5);
        int testAlsZahl = Integer.parseInt(test);
        System.out.println(testAlsZahl + 5);

        //downcasting
        Dog doggo2 = new Beagle("Hubert", 4, "Spaghetti");
        //wir möchten sein Lieblingsessen wissen: downcasten
        Beagle b1 = (Beagle) doggo2; //casten
        b1.eatsLovedFood();


    }

}
