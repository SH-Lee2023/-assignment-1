package Prac;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> cartItems;
    private  double totalPrice;

    public Order() {
        cartItems = new ArrayList<>();
    }

    public void addToCart(Product product) {
        cartItems.add(product);
    }

    public void removeFromCart(Product product) {
        cartItems.remove(product);
    }

    public List<Product> getCartItems() {
        return cartItems;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : cartItems) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
    public int placeOrder(){
        System.out.println("주문이 완료되었습니다.");

        int orderNumber = 12345;

        return orderNumber;
    }

    public void clearCart(){
        cartItems.clear();
        totalPrice = 0.0;
        System.out.println("장바구니가 비워졌습니다.");
    }
}
