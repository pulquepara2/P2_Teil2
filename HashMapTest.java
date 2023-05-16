package hashmaps;

import neuespackage.Hase;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
//        wir möchten alle Hasen mit einer Steuernummer finden, um sie schnell zu finden
//        und um korrekt versteuern zu können
        HashMap<String, Hase> steuerHasen = new HashMap<>();

        Hase h1 = new Hase("Hansi");
        Hase h2 = new Hase("Susi");

        //etwas in die Hashmap geben
        steuerHasen.put("123H", h1);
        steuerHasen.put("124H", h2);

        // Wert auslesen durch Angabe des Schlüssels
        System.out.println(steuerHasen.get("123H"));

        //Wenn der Schlüssel nicht vorhanden ist, kommt null zurück

        System.out.println(steuerHasen.get("Bledsinn"));
        // Fragen, ob ein Schlüssel in Hashmap ist:
        System.out.println(steuerHasen.containsKey("123H"));
        //Achtung, folgendes nur notfalls machen, ist langsam:
        System.out.println(steuerHasen.containsValue(h1));
        // was passiert jetzt? Hase h2 statt Hase h1 über 123H abrufbar
//        steuerHasen.put("123H", h2);

        //über Hashmap iterieren
        for(Map.Entry<String, Hase> hase : steuerHasen.entrySet()){
            System.out.println(hase.getKey());
            Hase h = hase.getValue();
            h.hoppeln();
        }
        //andere Variante : iterieren über keyset
        for(String key : steuerHasen.keySet()){
            System.out.println(key);
            Hase h = steuerHasen.get(key);
        }
    }
}
