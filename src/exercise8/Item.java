package exercise8;

/**
 * Class Item
 * @author yasiro01
 */
public abstract class Item {
  protected final long id;
  protected final String title;
  protected int quantity;
  
  public Item(long id, String title, int quantity) {
      this.id = id;
      this.title = title;
      this.quantity = quantity;
  }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

  /**
   * Get the item availability
   * @return true if quantity > 0
   */
  public boolean isAvailable() {
      return quantity > 0;
  }

  /**
   * Check out an item (decrease quantity by 1, if possible
   */
  public void checkout() {
      if (isAvailable()) {
          --quantity; // if it is available then the -- will decrease the quantity by 1
      }
  }

  /**
   * Check in an item
   */
  public void checkin() {
      ++quantity; // this is going to check the item since its ++ before not after
  }
  
  @Override
  public String toString() {
      if (isAvailable()) {
          if (quantity == 1) {
              return String.format("We have a copy of %s.", title);
          }
          else {
              return String.format("We have %d copies of %s.", quantity, title);
          }
      }
      else {
          return String.format("We have no copies of %s", title);
      }
  }
  
  // the reason I put quantity = 1 is because then if it is true then
  // i could print out the copy. else then it would print more
  // else then we would have no copies of it

  /**
   * Get the item information
   * @return item information, type-specific
   */
  public abstract String getInfo();
  
}
