package Day9; /** feb 28 2024 */
import java.util.ArrayList;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();

        names.add("Mama");
        names.add("Jose");
        names.add("Norman");
        names.add("John");
        names.add("Marry");
        names.add("Liza");
        names.add("Linda");
        names.add(4, "Johnson");

        System.out.println( "Size of the Array: " + names.size());

        for (String name: names)
        {
            System.out.println(name);
        }

        for (int i = 0; i < names.size(); i++)
        {
            System.out.println("Name: " + names.get(i));
        }
    }
}
