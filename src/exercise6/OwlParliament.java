package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
/**
 * Class OwlParliament
 * @author yasiro01
 */
public class OwlParliament {
    private HashSet<Owl> set_owl = new HashSet<>();
    public OwlParliament(String fileName) throws FileNotFoundException, IOException {
        BufferedReader input = new BufferedReader(new FileReader(fileName));
        String line = input.readLine();
        while (line != null) {
            String[] owl = line.split(",");
            line = input.readLine();
            if ("Owl".equals(owl[2])) {
                set_owl.add(new Owl (owl[0], Integer.parseInt(owl[1])));
}
        } this.set_owl = set_owl;
    }
    
    public Owl getChief(){
        int old = 0;
        for (Owl owl : set_owl) {
            if (owl.getAge() > old) {
                old = owl.getAge();
            }
        }
        for (Owl owl : set_owl) {
            if (owl.getAge() == old) {
                return owl;
            }
        }
        return null;
    }
    
    int size() {
        return set_owl.size();
    }
}
