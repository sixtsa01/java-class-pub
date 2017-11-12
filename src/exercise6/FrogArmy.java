package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Class FrogArmy
 * @author yasiro01
 */
public class FrogArmy {
    private ArrayList<Frog> list_frog = new ArrayList();
    public FrogArmy(String fileName) throws FileNotFoundException, IOException {
        BufferedReader input = new BufferedReader(new FileReader(fileName));
        String line = input.readLine();
        while (line != null) {
            String[] frog = line.split(",");
            line = input.readLine();
            if ("Frog".equals(frog[2])) {
                list_frog.add(new Frog (frog[0], Integer.parseInt(frog[1])));
    }
} this.list_frog = list_frog;
    }
    
    public Frog getChief(){
        int old = 0;
        for (int i = 0; i < list_frog.size(); ++i) {
            if (list_frog.get(i).getAge() > old) {
                old = list_frog.get(i).getAge();
            }
        }
        for (int i = 0; i < list_frog.size(); ++i) {
            if (list_frog.get(i).getAge() == old) {
                return list_frog.get(i);
            }
        }
        return null;
    }
    
    int size() {
        return list_frog.size();
    }
    }


