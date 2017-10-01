/**
 * Created by kevlo on 9/29/2017.
 */
public class Item
{
    private String description;
    private int price;

    public Item(String productDescription, int productPrice)
    {
        description = productDescription;
        price = productPrice;
    } // end constructor

    public String getDescription()
    {
        return description;
    } // end getDescription

    public int getPrice()
    {
        return price;
    } // end getPrice

    public String toString()
    {
        return description + "\t$" + price / 100 + "." + price % 100;
    } // end toString
} // end Item