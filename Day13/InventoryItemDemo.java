package Day13; /** mar 13 2024 */

public class InventoryItemDemo
{
    public static void main(String[] args)
    {
        InventoryItem item1 = new InventoryItem();
        item1.setUnites(30);
        item1.setDescription("Pens");

        //args constructor
        InventoryItem item2 = new InventoryItem("Pencils");
        item2.setUnites(40);

        //args constructor
        InventoryItem item3 = new InventoryItem(50);
        item3.setDescription("Erasers");

        //args constructor
        InventoryItem item4 = new InventoryItem(60, "Markers");

        //print
        System.out.println("Item 1:   [Unites: " + item1.getUnites() + "\t  Description: " + item1.getDescription() + "]");
        System.out.println("Item 2:   [Unites: " + item2.getUnites() + "\t  Description: " + item2.getDescription() + "]");
        System.out.println("Item 3:   [Unites: " + item3.getUnites() + "\t  Description: " + item3.getDescription() + "]");
        System.out.println("Item 4:   [Unites: " + item4.getUnites() + "\t  Description: " + item4.getDescription() + "]");
    }
}
