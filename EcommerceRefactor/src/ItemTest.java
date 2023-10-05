import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void testConstructorAndGetters() {
        Item item = new Item("Test Item", "20.00", "Electronics", "Medium", "Red", "2023/10/05");

        assertEquals("Test Item", item.getName());
        assertEquals("20.00", item.getPrice());
        assertEquals("Electronics", item.getCategory());
        assertEquals("Medium", item.getSize());
        assertEquals("Red", item.getColor());
        assertEquals("2023/10/05", item.getDatePosted());
    }

    @Test
    public void testSetters() {
        Item item = new Item();

        item.setName("Shirt");
        assertEquals("Shirt", item.getName());

        item.setPrice("15.00");
        assertEquals("15.00", item.getPrice());

        item.setCategory("Clothing");
        assertEquals("Clothing", item.getCategory());

        item.setSize("Large");
        assertEquals("Large", item.getSize());

        item.setColor("Blue");
        assertEquals("Blue", item.getColor());

        item.setDatePosted("2023/10/06");
        assertEquals("2023/10/06", item.getDatePosted());
    }

    @Test
    public void testToString() {
        Item item = new Item("Test Item", "20.00", "Electronics", "Medium", "Red", "2023/10/05");

        String expected = "name: Test Item, price: 20.00, category: Electronics, color: Red, date posted:2023/10/05";
        assertEquals(expected, item.toString());
    }
}


