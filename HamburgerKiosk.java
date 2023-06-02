package Prac;

import java.util.List;
import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class HamburgerKiosk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        MenuManager menuManager = new MenuManager();

        while (true) {
            menuManager.displayMenu();

            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= 5) {
                Product product = menuManager.createProduct(choice);
                order.addToCart(product);
                System.out.println("[" + product.getName() + "] 장바구니에 추가되었습니다.");
            } // 6. Order 옵션 선택 시
            if (choice == 6) {
                List<Product> cartItems = order.getCartItems();
                if (cartItems.isEmpty()) {
                    System.out.println("장바구니가 비어있습니다.");
                } else {
                    System.out.println("장바구니 내역:");
                    for (Product item : cartItems) {
                        System.out.println(item.toString());
                    }
                    System.out.println("총 가격: W " + order.getTotalPrice());

                    System.out.println("장바구니를 확인하고 주문하시겠습니까? (1. Yes / 2. No)");
                    int confirmation = scanner.nextInt();
                    if (confirmation == 1) {
                        int orderNumber = order.placeOrder();
                        System.out.println("주문이 완료되었습니다. 주문 번호: " + orderNumber);
                        order.clearCart();
                    } else {
                        System.out.println("주문이 취소되었습니다.");
                    }

                }
            } else if (choice == 7) {
                menuManager.cancelOrder(order);
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }

        }
    }
}



