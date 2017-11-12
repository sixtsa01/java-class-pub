package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
/**
 * Class LemurConspiracy
 * @author yasiro01
 */
public class LemurConspiracy {
    private HashSet<Lemur> set_lemur = new HashSet<>();
    public LemurConspiracy(String fileName) throws FileNotFoundException, IOException {
        BufferedReader input = new BufferedReader(new FileReader(fileName));
        String line = input.readLine();
        while (line != null) {
            String[] lemur = line.split(",");
            line = input.readLine();
            if ("Lemur".equals(lemur[2])) {
                set_lemur.add(new Lemur (lemur[0], Integer.parseInt(lemur[1])));
    }
} this.set_lemur = set_lemur;
    }
    
    public Lemur getChief(){
        int old = 0;
        for (Lemur lemur : set_lemur) {
            if (lemur.getAge() > old) {
                old = lemur.getAge();
            }
        }
        for (Lemur lemur : set_lemur) {
            if (lemur.getAge() == old) {
                return lemur;
            }
        }
        return null;
    }
    
    int size() {
        return set_lemur.size();
    }
}
