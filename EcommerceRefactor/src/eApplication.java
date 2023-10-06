import java.util.Scanner;

public class eApplication {

	public Scanner scannerIn = new Scanner(System.in);

	private String name;
	private String price;
	private String category;
	private String size;
	private String color;
	private String datePosted;
	ItemsList ecommProduct = new ItemsList();

	public String HomeOptions() {
		while (true) {
			System.out.println("Welcome to our Ecommerce Application!");
			Item ecommItem = new Item(name, price, category, size, color, datePosted);

			System.out.println("Home Page: What would you like to do? type 'Sell' Item(s), 'Buy' Item(s), Go to 'Product Page',Go to 'Shopping cart, or Exit");
			String homePageChoice = scannerIn.nextLine();

			switch (homePageChoice.toLowerCase()) {
				case "sell":
					sellItem(ecommItem);
					break;
				case "buy":
					buyProducts();
					break;
				case "shopping cart":
					showShoppingCart();
					break;
				case "product page":
					showProductPage();
					break;
				case "exit":
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Input");
			}

		
			scannerIn.nextLine();

			return homePageChoice;
		}
	}

	private void sellItem(Item ecommItem) {
		System.out.println("SELL ITEM:");
		System.out.println("---------------------");

		System.out.println("What is the name of the item?");
		ecommItem.setName(scannerIn.nextLine());

		System.out.println("What is the price of the item?");
		ecommItem.setPrice(scannerIn.nextLine());

		System.out.println("What is the category of the item?");
		ecommItem.setCategory(scannerIn.nextLine());

		System.out.println("what is the size of the item (XS,S,M,L,XL or N/A)");
		ecommItem.setSize(scannerIn.nextLine());

		System.out.println("what is the color of the item");
		ecommItem.setColor(scannerIn.nextLine());

		System.out.println("what is the date posted of the item (ex.2021/07/23)");
		ecommItem.setDatePosted(scannerIn.nextLine());

		ecommProduct.setAddItem(ecommItem);
	}

	private void buyProducts() {
		System.out.println("BUY PRODUCTS");
		System.out.println("---------------------");
		if (ecommProduct.productList.size() == 0) {
			System.out.println("There are no products to buy");
		} else {
			ecommProduct.displayItem();
			System.out.println("Please enter the Product number for the item to purchase");
			int itemToBuy = scannerIn.nextInt();
			ecommProduct.buyItem(itemToBuy);
		}
	}

	private void showShoppingCart() {
		System.out.println("SHOPPING CART");
		System.out.println("---------------------");
		if (ecommProduct.productListBuy.size() == 0) {
			System.out.println("The Shopping cart is empty!");
		} else {
			ecommProduct.shoppingCartItems();
			double totalPrice = ecommProduct.shoppingCartItemsPrice();
			System.out.println("The total price of the items in the cart is: " + totalPrice);
		}
	}

	private void showProductPage() {
		System.out.println("PRODUCT PAGE");
		System.out.println("---------------------");
		if (ecommProduct.productList.size() == 0) {
			System.out.println("The product page is empty!");
		} else {
			ecommProduct.displayItem();
		}
	}

	public static void main(String[] args) {
		eApplication homePage = new eApplication();
		homePage.HomeOptions();
	}
}




















	
