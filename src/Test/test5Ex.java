package Test;

import java.util.Scanner;

public class test5Ex {
    public static void main(String[] args) {
        String menuName[] = {"팝콘세트", "나쵸세트", "오징어세트", "핫도그세트"};
        int menu[] = {15000, 12000, 20000, 10000};
        System.out.println("****************************************************");
        System.out.println("[1]팝콘세트 [2]나쵸세트 [3]오징어세트 [4]핫도그 세트");
        System.out.println("만약 원하는 메뉴가 없다면 [5]를 눌러주세요");
        System.out.println("-----------------------------------------------------");

        int num = 0, cnt = 0, sum = 0;
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.print("선택 메뉴 : ");
            num = scan.nextInt();
            if(num == 5){
                System.out.println("주문을 종료합니다.");
                break;
            } if(num >= 5){
                System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                continue;
            }
            System.out.print("수량을 선택하세요 : ");
            cnt = scan.nextInt();
            System.out.println(menuName[num-1] + " 이고 " + (menu[num-1]*cnt) +" 입니다.");
            sum += (menu[num-1]*cnt);
        }
        System.out.println("-------------------------------------------------------");
        System.out.print("합계는 " + sum + "원입니다.");

    }
}
