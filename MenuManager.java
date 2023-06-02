package Prac;

import java.util.List;
import java.util.Scanner;

public class MenuManager {
    public void displayMenu() {
        System.out.println("\n[ BURGER MENU ]");
        System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
        System.out.println("4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println("6. Order       | 장바구니를 확인 후 주문합니다.");
        System.out.println("7. Cancel      | 진행중인 주문을 취소합니다.");

    }

    public Product createProduct(int choice) {
        switch (choice) {
            case 1:
                return new Product("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 7.6);
            case 2:
                return new Product("SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9);
            case 3:
                return new Product("Shroom Burger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 6.8);
            case 4:
                return new Product("Cheeseburger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 6.9);
            case 5:
                return new Product("Hamburger", "비프패티를 기반으로 야채가 들어간 기본버거", 5.4);
            default:
                return null;
        }
    }

    public void processOrder(Order order, Scanner scanner) {
    }
    public void cancelOrder(Order order) {
        order.clearCart();
        System.out.println("주문이 취소되었습니다.");
    }


}
