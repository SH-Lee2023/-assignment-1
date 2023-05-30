package homework;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HamburgerKiosk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        while (true) {
            System.out.println("\n[ BURGER MENU ]");
            System.out.println("1. ShackBurger");
            System.out.println("2. SmokeShack");
            System.out.println("3. Shroom Burger");
            System.out.println("4. Cheeseburger");
            System.out.println("5. Hamburger");
            System.out.println("6. Order");
            System.out.println("7. Cancel\n");

            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= 5) {
                Product product = createProduct(choice);
                order.addToCart(product);
                System.out.println("[" + product.getName() + "] 장바구니에 추가되었습니다.");
            } else if (choice == 6) {
                List<Product> cartItems = order.getCartItems();
                if (cartItems.isEmpty()) {
                    System.out.println("장바구니가 비어있습니다.");
                } else {
                    System.out.println("장바구니 내역:");
                    for (Product item : cartItems) {
                        System.out.println(item.toString());
                    }
                    System.out.println("총 가격: W " + order.getTotalPrice());
                    System.out.println("주문을 진행하시겠습니까? (1. Yes / 2. No)");
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
                order.clearCart();
                System.out.println("주문이 취소되었습니다.");
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }

    private static Product createProduct(int choice) {
        switch (choice) {
            case 1:
                return new Product("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 7.6);
            case 2:
                return new Product("SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.900);
            case 3:
                return new Product("Shroom Burger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 6.800);
            case 4:
                return new Product("Cheeseburger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 6.900);
            case 5:
                return new Product("Hamburger", "비프패티를 기반으로 야채가 들어간 기본버거", 5.400);
            default:
                return null;
        }
    }
}
