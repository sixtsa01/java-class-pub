package exercise10;

// Sam Sixta
//exercise 10

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class BookShop
 * @author yasiro01
 */
public class BookShop {
    ArrayList<Book> catalog;

  public BookShop() {
      catalog = new ArrayList();
  }
  
  public BookShop(String filename) throws FileNotFoundException, IOException {
      this();
      BufferedReader input = new BufferedReader(new FileReader(filename));
      String line;
      while ((line = input.readLine()) != null) {
          String [] split = line.split(",");
          Book shop = new Book(split[0], split[1], Double.parseDouble(split[2]), Integer.parseInt(split[3]));
          catalog.add(shop);
      }
  }
  
  public BookShop(BookShop anotherBookShop) {
      this();
      for (Book b: anotherBookShop.catalog) {
          this.catalog.add(b);
      }
  }
  
  public void addNewTitle(Book book) {
      this.catalog.add(book);
  }
  
  public int size() {
      return this.catalog.size();
  }
  
  public void discountAll(Double discountPercent) {
      for (Book book: catalog) {
          book.price *= (1 - (discountPercent / 100));
      }
  }
  
  public void printCatalog() {
      for (Book book: catalog) {
          System.out.println(book);
      }
      
  }
  
  public void order(Comparator<Book> comp) {
      Collections.sort(catalog, comp);
  }
  
  public ArrayList<Book> getCatalog() {
      return this.catalog;
  }

}
