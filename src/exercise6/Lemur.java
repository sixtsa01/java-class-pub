package exercise6;

import java.util.Objects;
/**
 * Class Lemur
 * @author yasiro01
 */
public class Lemur {
    private String name;
    private int age;
    private int tailLength;
    
    public Lemur(String name, int age) {
        this.name = name;
        this.age = age;
        tailLength = 20;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getTailLength() {
        return tailLength;
    }
    
    @Override
    public int hashCode() {
        int hash = 6;
        hash = 66 * hash + Objects.hashCode(this.name);
        hash = 66 * hash + this.age;
        hash = 66 * hash + this.tailLength;
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lemur other = (Lemur) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.tailLength != other.tailLength) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Lemur{" + "name=" + name + ", age=" + age + ", tailLength=" + tailLength + '}';
    }
    
}
