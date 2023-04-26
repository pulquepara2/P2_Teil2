package neuespackage;

import java.util.ArrayList;
import java.util.Iterator;

public class Hasenstall {
    ArrayList<Hase> hasen = new ArrayList<>();

    public void add(Hase h) {
        hasen.add(h);
    }

    public void alleHoppeln() {
      //  for (int i = 0; i < hasen.size(); i++) {
      //      hasen.get(i).hoppeln();

       for(Hase h : hasen){
            h.hoppeln();
        }

    }
}

