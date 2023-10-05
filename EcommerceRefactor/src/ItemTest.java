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
}
