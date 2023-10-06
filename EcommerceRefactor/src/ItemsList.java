import java.util.ArrayList;

public class ItemsList {
	private ItemTemp anItem;
	ArrayList<ItemTemp> productList = new ArrayList<>();
	ArrayList<ItemTemp> productListBuy = new ArrayList<>();

	public ItemsList() {

	}

	public ItemTemp getItemsList() {
		return anItem;
	}

	public void setAddItem(ItemTemp itemToAdd) {
		anItem = itemToAdd;
		productList.add(getItemsList());
	}

	public ArrayList<ItemTemp> getAddItem() {
		System.out.println(productList);
		return productList;
	}

	public void displayItem() {
		for (int i = 0; i < productList.size(); i++) {
			System.out.println("Product: " + i);
			ItemTemp currentItem = productList.get(i);

			System.out.println("Name: " + currentItem.getName());
			System.out.println("Price: " + currentItem.getPrice());
			System.out.println("Category: " + currentItem.getCategory());
			System.out.println("Size: " + currentItem.getSize());
			System.out.println("Color: " + currentItem.getColor());
			System.out.println("Date Posted: " + currentItem.getDatePosted());

			System.out.println();
		}
	}


	public void buyItem(int itemToBuy) {
		productListBuy.add(productList.get(itemToBuy));
		productList.remove(itemToBuy);
	}

	public void shoppingCartItems() {
		for (int i = 0; i < productListBuy.size(); i++) {
			System.out.println(productListBuy.get(i));
		}
	}

	public double shoppingCartItemsPrice() {
		double totalSum = 0;
		for (int i = 0; i < productListBuy.size(); i++) {
			double sum = Double.parseDouble(productListBuy.get(i).getPrice());
			totalSum = totalSum + sum;
		}
		return totalSum;
	}


}





	
		

	
	
	
	



