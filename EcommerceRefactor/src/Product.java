public class Product {
    private ItemTemp itemDetails;

    public Product(ItemTemp itemDetails) {
        this.itemDetails = itemDetails;
    }


    public String getName() {
        return itemDetails.getName();
    }

    public String getPrice() {
        return itemDetails.getPrice();
    }

    public String getCategory() {
        return itemDetails.getCategory();
    }

    public String getSize() {
        return itemDetails.getSize();
    }

    public String getColor() {
        return itemDetails.getColor();
    }

    public String getDatePosted() {
        return itemDetails.getDatePosted();
    }


    public void setName(String name) {
        itemDetails.setName(name);
    }

    public void setPrice(String price) {
        itemDetails.setPrice(price);
    }

    public void setCategory(String category) {
        itemDetails.setCategory(category);
    }

    public void setSize(String size) {
        itemDetails.setSize(size);
    }

    public void setColor(String color) {
        itemDetails.setColor(color);
    }

    public void setDatePosted(String datePosted) {
        itemDetails.setDatePosted(datePosted);
    }

    // Additional methods specific to the Item class
}

