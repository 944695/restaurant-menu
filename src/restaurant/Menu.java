package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class  Menu {
    // Class Variables
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    // Constructors
    public Menu() { this.lastUpdated = new Date(); }

    // Methods

    public Date getLastUpdated() { return this.lastUpdated; }

    public void setLastUpdated(Date lastUpdated) {this.lastUpdated = lastUpdated; }

    public ArrayList<MenuItem> getMenuItems() {return this.menuItems; }

    public void setMenuItems(ArrayList<MenuItem> menuItems) { this.menuItems = menuItems; }

    // Other Methods
    public void addMenuItem(MenuItem item) {

        for(MenuItem menuItem: menuItems)
        {
            if (item.equals(menuItem))
            {
                System.out.println("WARNING: This item already exists!");
                return;
            }
        }
        this.menuItems.add(item);
        this.lastUpdated = new Date();
    }

    public void removeMenuItem(MenuItem item) {
        this.menuItems.remove(item);
        this.lastUpdated = new Date();
    }

    @Override
    public String toString() {
        String returnString = "";
        for( MenuItem item: this.menuItems)
        {
            returnString += item.toString() + "\n\n";
        }
        return returnString;
    }
}
