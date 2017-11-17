package exercise8;

/**
 * Class EBook
 * MediaLIbrary code 4
 * @author yasiro01
 */
public class EBook extends Book {
  private final String format;
  
  public EBook(String format, String author, int publishingYear, long id, String title) {
      super(author, publishingYear, id, title, 1); // putting the 1 there to take the in variable to not give me an error
      this.format = format;
  }
  
  /**
   * Get the book format
   * @return the value of format
   */
  public String getFormat() {
    return format;
  }
  
  @Override
  public void checkout() { }
// Don't write if you don't want them to do anything
  @Override
  public void checkin() {}
  
  @Override
  public String getInfo() {
      return String.format("%s (%d). %s is located at %s ", author, publishingYear, title, format);
  }
  
  // Went off what it said in the Ex8Output.txt, how it worded it
  
}
