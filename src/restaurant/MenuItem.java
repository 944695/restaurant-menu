package restaurant;

public class MenuItem {

    // Class Variables
    private String name;
    private String description;
    private String category;
    private Double price;
    private Boolean isNew;


    // Constructors
    public MenuItem(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = "Not categorized";
        this.isNew = false;

    }

    public MenuItem(String name, String description, Double price, String category, Boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;

    }



    // Methods
    // Getters and Setters
    public String getName () { return this.name; }

    public void setName (String name) { this.name = name; }

    public String getDescription () { return this.description; }

    public void setDescription (String description) { this.description = description; }

    public Double getPrice() { return this.price; }

    public void setPrice (Double price) { this.price = price; }

    public String getCategory () { return this.category; }

    public void setCategory (String category) { this.category = category; }

    public Boolean isNew () { return this.isNew; }

    public void setName (Boolean isNew) { this.isNew = isNew; }

    // Other Methods

    @Override
    public String toString() {
        String returnString = "";

        returnString += returnString + "Item name: " + this.name + "\n";
        returnString += "Item description: " + this.description + "\n";
        returnString += "Item category: " + this.category + "\n";
        returnString += "Item price: $" + this.price + "\n";
        returnString +=  "Item is new?: " + this.isNew + "\n";

        return returnString;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(!(obj instanceof MenuItem)) return false;

        MenuItem menuItem = (MenuItem) obj;
        if((menuItem.name.equals(this.name))
                && (menuItem.description.equals(this.description))
                && (menuItem.category.equals(this.category))
                && (menuItem.price.equals(this.price)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
