package Day13;  /** mar 13 2024 */

public class InventoryItem
{
    private int unites;
    private String description;

    public InventoryItem()
    {

    }
    public InventoryItem(int unites)
    {
        this.unites = unites;
    }
    public InventoryItem(String description)
    {
        this.description = description;
    }
    public InventoryItem(int unites, String description)
    {
        this.unites = unites;
        this.description = description;
    }
    public int getUnites()
    {
        return unites;
    }
    public void setUnites(int unites)
    {
        this.unites = unites;
    }
    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}
