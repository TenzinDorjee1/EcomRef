import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class ItemListTest {

    @Test
    public void testAddItem() {
        ItemsList itemsList = new ItemsList();
        ItemHandler item = new ItemHandler("TestItem", "20.0", "Electronics", "M", "Black", "2022/01/01");

        itemsList.setAddItem(item);

        assertEquals(1, itemsList.productList.size());
        assertEquals(item, itemsList.productList.get(0));
    }

    @Test
    public void testDisplayItem() {
        ItemsList itemsList = new ItemsList();
        ItemHandler item1 = new ItemHandler("Item1", "10.0", "Clothing", "S", "Red", "2022/02/01");
        ItemHandler item2 = new ItemHandler("Item2", "15.0", "Electronics", "L", "Blue", "2022/02/15");

        itemsList.setAddItem(item1);
        itemsList.setAddItem(item2);

        // Redirect standard output for testing
        final ArrayList<String> printedLines = new ArrayList<>();
        System.setOut(new java.io.PrintStream(
                new java.io.OutputStream() {
                    @Override
                    public void write(int b) {
                        printedLines.add(String.valueOf((char) b));
                    }
                }));

        itemsList.displayItem();

        // Reset standard output
        System.setOut(System.out);

        assertEquals("Product: 0\nName: Item1\nPrice: 10.0\nCategory: Clothing\nSize: S\nColor: Red\nDate Posted: 2022/02/01\n\n" +
                        "Product: 1\nName: Item2\nPrice: 15.0\nCategory: Electronics\nSize: L\nColor: Blue\nDate Posted: 2022/02/15\n\n",
                String.join("", printedLines));
    }

    @Test
    public void testBuyItem() {
        ItemsList itemsList = new ItemsList();
        ItemHandler item1 = new ItemHandler("Item1", "10.0", "Clothing", "S", "Red", "2022/02/01");
        ItemHandler item2 = new ItemHandler("Item2", "15.0", "Electronics", "L", "Blue", "2022/02/15");

        itemsList.setAddItem(item1);
        itemsList.setAddItem(item2);

        itemsList.buyItem(1);

        assertEquals(1, itemsList.productList.size());
        assertEquals(1, itemsList.productListBuy.size());
        assertEquals(item2, itemsList.productListBuy.get(0));
    }

    @Test
    public void testShoppingCartItemsPrice() {
        ItemsList itemsList = new ItemsList();
        ItemHandler item1 = new ItemHandler("Item1", "10.0", "Clothing", "S", "Red", "2022/02/01");

        itemsList.setAddItem(item1);


        itemsList.buyItem(0);


        assertEquals(10.0, itemsList.shoppingCartItemsPrice(), 0.001);
    }
}

