import java.util.ArrayList;
import java.util.Scanner;


public class Item  {
	public Scanner scannerIn = new Scanner(System.in);
	public String name;
	public String price;
	public String category;
	public String size;
	public String color;
	public String datePosted;



	public Item(String sellItemName, String sellItemPrice, String sellItemCat, String sellItemSize, String sellItemColor, String sellItemdatePosted) {
		this.name = sellItemName;
		this.price = sellItemPrice;
		this.category = sellItemCat;
		this.size = sellItemSize;
		this.color = sellItemColor;
		this.datePosted = sellItemdatePosted;

	}

	public Item() {
	}

	public String getName() {
		return name;
	}
	public void setName(String itemName) {
		this.name = itemName;

	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String itemPrice) {
	
		this.price = itemPrice;

	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String itemCat) {
		this.category = itemCat;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String itemColor) {
		this.color = itemColor;
	}

	public String getDatePosted() {
		return datePosted;
	}

	public void setDatePosted(String itemDatePosted) {
	
		this.datePosted = itemDatePosted;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String itemSize) {
		this.size = itemSize;
	}


	public String toString() {

		return "name: " + getName() + ", price: " + getPrice() + ", category: " + getCategory() + ", color: " + getColor() 
		+ ", date posted:" + getDatePosted();
	}


}





