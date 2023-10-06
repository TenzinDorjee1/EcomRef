import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ItemTempTest {

    @Test
    public void testItemTempCreation() {

        String name = "Shirt";
        String price = "19.99";
        String category = "Apparel";
        String size = "M";
        String color = "Blue";
        String datePosted = "2023/10/06";


        ItemTemp itemTemp = new ItemTemp(name, price, category, size, color, datePosted);


        assertEquals(name, itemTemp.getName());
        assertEquals(price, itemTemp.getPrice());
        assertEquals(category, itemTemp.getCategory());
        assertEquals(size, itemTemp.getSize());
        assertEquals(color, itemTemp.getColor());
        assertEquals(datePosted, itemTemp.getDatePosted());
    }

    @Test
    public void testSetName() {

        ItemTemp itemTemp = new ItemTemp("Shirt", "19.99", "Apparel", "M", "Blue", "2023/10/06");


        itemTemp.setName("New Shirt");


        assertEquals("New Shirt", itemTemp.getName());
    }

    @Test
    public void testSetPrice() {

        ItemTemp itemTemp = new ItemTemp("Shirt", "19.99", "Apparel", "M", "Blue", "2023/10/06");


        itemTemp.setPrice("25.00");


        assertEquals("25.00", itemTemp.getPrice());
    }


}

