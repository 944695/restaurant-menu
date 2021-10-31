package restaurant;

public class Restaurant {
    public static void main(String[] args)
    {
        MenuItem item1 = new MenuItem("Salad", "Delicious Greens", 7.50, "Healthy", true);
        MenuItem item2 = new MenuItem("Salad", "Delicious Greens", 7.50, "Healthy", true);
        MenuItem item3 = new MenuItem("Cake", "Delicious Desserts", 5.50, "Unealthy", true);

        //System.out.println(item1.toString());
        //System.out.println(item1.equals(item2));
        //System.out.println(item1.equals(item3));

        Menu myMenu = new Menu();
        myMenu.addMenuItem(item1);
        myMenu.addMenuItem(item2);
        myMenu.addMenuItem(item3);
        myMenu.removeMenuItem(item3);

        //System.out.println(item1.toString());
        System.out.println(myMenu.toString());
    }
}
