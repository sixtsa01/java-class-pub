package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
/**
 * Class KangarooMob
 * @author yasiro01
 */
public class KangarooMob {
    private HashSet<Kangaroo> roo_set = new HashSet<>();
    public KangarooMob(String fileName) throws FileNotFoundException, IOException {
        BufferedReader input = new BufferedReader(new FileReader(fileName));
        String line = input.readLine();
        while (line != null) {
            String[] roo = line.split(",");
            line = input.readLine();
            if ("Kangaroo".equals(roo[2])) {
                roo_set.add(new Kangaroo (roo[0], Integer.parseInt(roo[1])));
    }
} this.roo_set = roo_set;
    }
    
    public Kangaroo getChief(){
        int old = 0;
        for (Kangaroo roo : roo_set) {
            if (roo.getAge() > old) {
                old = roo.getAge();
            }
        }
        for (Kangaroo roo : roo_set) {
            if (roo.getAge() == old) {
                return roo;
            }
        }
        return null;
    }
    
    int size() {
        return roo_set.size();
    }
}
