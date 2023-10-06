import java.util.Scanner;

public class eApplication {

	private Scanner scannerIn = new Scanner(System.in);
	private ItemsList ecommProduct = new ItemsList();

	public void HomeOptions() {
		while (true) {
			System.out.println("Welcome to our Ecommerce Application!");

			System.out.println("Home Page: What would you like to do? Type 'Sell' Item(s), 'Buy' Item(s), " +
					"Go to 'Product Page', Go to 'Shopping Cart', or Exit");

			String homePageChoice = scannerIn.nextLine().toLowerCase();

			switch (homePageChoice) {
				case "sell":
					sellItem();
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
				default:
					System.out.println("Invalid Input");
			}


			scannerIn.nextLine();
		}
	}

	private void sellItem() {
		System.out.println("SELL ITEM:");
		System.out.println("---------------------");


		System.out.println("What is the name of the item?");
		String name = scannerIn.nextLine();

		System.out.println("What is the price of the item?");
		String price = scannerIn.nextLine();

		System.out.println("What is the category of the item?");
		String category = scannerIn.nextLine();

		System.out.println("What is the size of the item (XS, S, M, L, XL, or N/A)");
		String size = scannerIn.nextLine();

		System.out.println("What is the color of the item");
		String color = scannerIn.nextLine();

		System.out.println("What is the date posted of the item (e.g., 2021/07/23)");
		String datePosted = scannerIn.nextLine();


		ItemHandler ecommItem = new ItemHandler(name, price, category, size, color, datePosted);


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




















	
