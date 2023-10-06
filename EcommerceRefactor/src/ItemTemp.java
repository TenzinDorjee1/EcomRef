public class ItemTemp {
    public String name;
    public String price;
    public String category;
    public String size;
    public String color;
    public String datePosted;


    public ItemTemp(String name, String price, String category, String size, String color, String datePosted) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.size = size;
        this.color = color;
        this.datePosted = datePosted;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(String datePosted) {
        this.datePosted = datePosted;
    }
}


