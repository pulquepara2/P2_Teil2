package Sortieren;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FruchtMain {
    public static void main(String[] args) {


        Frucht f1 = new Frucht("Mango", 350, true);
        Frucht f2 = new Frucht("Banane", 120, false);
        Frucht f3 = new Frucht("Ananas", 700, true);
        Frucht f4 = new Frucht("Oapfl", 200, true);

        Frucht[] fruechteArray = {f1, f2, f3, f4};
        // wirklich noch nicht sortiert
        System.out.println(Arrays.toString(fruechteArray));
        System.out.println("------------");
        //jetzt wird sortiert
        Arrays.sort(fruechteArray);
        System.out.println(Arrays.toString(fruechteArray));

        System.out.println("_______________________");

        List<Frucht> fruchtList = new ArrayList<>();
        fruchtList.add(f1);
        fruchtList.add(f2);
        fruchtList.add(f3);
        fruchtList.add(f4);
        System.out.println(fruchtList);

        //statt Arrays.sort
        Collections.sort(fruchtList);
        System.out.println(fruchtList);
    }
}