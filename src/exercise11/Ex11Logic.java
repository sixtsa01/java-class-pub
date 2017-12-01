package exercise11;

// Sam Sixta
// Exercise 11
// Wasn't sure if you wanted us to make a class to put eveything so 
// i just went off of the Ex11Logic class


import java.util.Collection;
import java.util.Collections;

/**
 * Exercise 11 logic
 * @author yasiro01
 */
public class Ex11Logic {
  
  /**
   * Task 1
   * @param <T>
   * @param item
   * @return length of the parameter's string representation
   */
    public <T> int strLen(T item) {
        return item.toString().length();
    }
    
  // TODO: Implement method strLen
  
  /**
   * Task 2
   * @param <T>
   * @param item1
   * @param item2
   * @param item3
   * @return the greater of three parameters
   */
    // Went off your example in class and just added onto it
    public <T extends Comparable> T greater(T item1, T item2, T item3) {
        if (item1.compareTo(item2) >= 0) {
            if (item1.compareTo(item3) >= 0) {
                return item1;
            } else {
                return item3;
            }
        } else if (item2.compareTo(item3) >= 0) {
            return item2;
        } else {
            return item3;
        }
    }
  // TODO: Implement method greater
  
  /**
   * Task 3
   * @param <T>
   * @param list of objects
   * print a list of items
   */
    public <T> void printList(T ... list) {
        for (T item: list) {
            System.out.print(item + "");
        }
    }
    
  // TODO: Implement method printList
  
  /**
   * Task 4
   * @param <T>
   * @param list of objects
   * @return the smallest item in the collection
   */
    public <T extends Comparable> Comparable findMinItem(Collection<T> list) {
        return Collections.min(list);
    }
    
  // TODO: Implement method findMinItem
}

  /**
   * Task 5
   * @param <T>
   * @param <U>
   * A class with two data members, T fuzz and U buzz
   * Implement the constructor, getters, setters, and toString
   */
class Foo<T, U> {
    private T fuzz;
    private U buzz;
    
    public Foo(T fuzz, U buzz) {
        this.fuzz = fuzz;
        this.buzz = buzz;
    }
    
    public T getFuzz() {
        return fuzz;
    }
    
    public U getBuzz() {
        return buzz;
    }

    public void setFuzz(T fuzz) {
        this.fuzz = fuzz;
    }

    public void setBuzz(U buzz) {
        this.buzz = buzz;
    }

    @Override
    public String toString() {
        return "Foo{" + "fuzz=" + fuzz + ", buzz=" + buzz + '}';
    }
    
}
  // TODO: Implement class Foo
