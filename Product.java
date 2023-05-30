package homework;

class Product extends Menu {
    private double price;

    public Product(String name, String description, double price) {
        super(name, description);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void display() {
        System.out.println(getName() + " | " + price + "W | " + getDescription());
    }

    @Override
    public String toString() {
        return getName() + " | " + price + "W | " + getDescription();
    }

}