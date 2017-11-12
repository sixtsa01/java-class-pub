package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class CrowMurder
 * @author yasiro01
 */
public class CrowMurder {
    private ArrayList<Crow> list_crow = new ArrayList<>();
    
    public CrowMurder(String filename) throws FileNotFoundException, IOException {
        BufferedReader input = new BufferedReader(new FileReader(filename));
        String line = input.readLine();
        while (line != null) {
            String[] crow = line.split(",");
            line = input.readLine();
            if ("Crow".equals(crow[2])) {
                list_crow.add(new Crow (crow[0], Integer.parseInt(crow[1])));
            }
        } this.list_crow = list_crow;
    }
    
    public Crow getChief() {
        ArrayList<Integer> int_age = new ArrayList<>();
        int old = 0;
        for (int i = 0; i < list_crow.size(); ++i) {
            if (list_crow.get(i).getAge() > old) {
                old = list_crow.get(i).getAge();
            }
        }
        for (int i = 0; i < list_crow.size(); ++i) {
            if (list_crow.get(i).getAge() == old) {
                return list_crow.get(i);
            }
        }
        return null;
    }
    
    int size() {
        return list_crow.size();
    }
}
