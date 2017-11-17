package exercise8;

import java.util.ArrayList;

/**
 * Class DigitalMovie
 * MediaLIbrary code 2
 * @author yasiro01
 */
public class DigitalMovie extends Movie {
  private String service;
  
  public DigitalMovie(String service, String director, int releaseYear, long id, String title) {
      super(director, releaseYear, id, title, 1); // putting the one there to fill up the int variable
      this.service = service;
  }

  /**
   * Get the value of service
   * @return the value of service
   */
  public String getService() {
    return service;
  }

  /**
   * Set the value of service
   * @param service new value of service
   */
  public void setService(String service) {
    this.service = service;
  }
  
  @Override
  public void checkout() { }
  // Both of these since it said that they shouldn't do anything
  // Don't write in them if you don't want them to do anything
  @Override
  public void checkin() { }
  
  @Override
  public String getInfo() {
      return String.format("%s (%d) by %s is available %s", title, releaseYear, director, service);
  }
 
  
}
