import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class ItemListTest {

    @Test
    public void testAddItem() {
        ItemsList itemsList = new ItemsList();
        Item itemToAdd = new Item("Test Item", "20.00", "Electronics", "Medium", "Red", "2023/10/05");

        itemsList.setAddItem(itemToAdd);
        ArrayList<Item> productList = itemsList.getAddItem();

        assertEquals(1, productList.size());
        assertEquals(itemToAdd, productList.get(0));
    }
}


