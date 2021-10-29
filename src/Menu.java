import java.util.ArrayList;
import java.util.Date;

public class Menu {
    // Class Variables
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    // Constructors
    public Menu() { this.lastUpdated = Date(); }

    // Methods

    public Date getLastUpdated() { return this.lastUpdated; }

    public void setLastUpdated(Date lastUpdated) {this.lastUpdated = lastUpdated; }

    public ArrayList<MenuItem> getMenuItems() {return this.menuItems; }

    public void setMenuItems(ArrayList<MenuItem> menuItems) { this.menuItems = menuItems; }


}
