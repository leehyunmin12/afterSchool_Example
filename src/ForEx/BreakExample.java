package ForEx;

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("exit 종료 그만 하면 종료합니다.");
        while(true) {
            System.out.println(">>");
            String text = scanner.nextLine();
            if(text.equals("exit") || text.equals("종료") || text.equals("그만")) break;
        }
        System.out.println("종료합니다...");

        scanner.close();
    }
}
