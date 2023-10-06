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


        ItemHandler itemTemp = new ItemHandler(name, price, category, size, color, datePosted);


        assertEquals(name, itemTemp.getName());
        assertEquals(price, itemTemp.getPrice());
        assertEquals(category, itemTemp.getCategory());
        assertEquals(size, itemTemp.getSize());
        assertEquals(color, itemTemp.getColor());
        assertEquals(datePosted, itemTemp.getDatePosted());
    }

    @Test
    public void testSetName() {

        ItemHandler itemTemp = new ItemHandler("Shirt", "19.99", "Apparel", "M", "Blue", "2023/10/06");


        itemTemp.setName("New Shirt");


        assertEquals("New Shirt", itemTemp.getName());
    }

    @Test
    public void testSetPrice() {

        ItemHandler itemTemp = new ItemHandler("Shirt", "19.99", "Apparel", "M", "Blue", "2023/10/06");


        itemTemp.setPrice("25.00");


        assertEquals("25.00", itemTemp.getPrice());
    }


}

