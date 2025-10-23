package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScoreArray {
    public static void main(String[] args) {
        int idArray[]=new int[10],scoreArray[]=new int[10];
        Scanner scan = new Scanner(System.in);

        input(idArray, scoreArray, scan);

        while(true) {
            System.out.println("학번으로 검색: 1, 점수로 검색: 2, 끝내려면 3 >>");
            int menu = scan.nextInt();
            switch(menu){
                case 1: searchById(idArray, scoreArray, scan); break;
                case 2: searchByScore(idArray, scoreArray, scan); break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("1~3만 입력하세요.");
            }
        }
    }

    private static void searchById(int[] idArray, int[] scoreArray, Scanner scan) {
        int cnt=0;
        while(true) {
            try {
                System.out.print("학번을 입력해 주세요 : ");
                int id = scan.nextInt();
                for (int i = 0; i < 10; i++)
                    if (id == idArray[i]) {
                        System.out.println(scoreArray[i]);
                        cnt = 1;
                    }
                if (cnt == 0) System.out.println("해당되는 값이 없습니다.");
                return;
            } catch (InputMismatchException e) {
                System.out.println("학번을 다시 입력해 주세요.");
                scan.nextLine();
            }
        }
    }
    private static void searchByScore(int[] idArray, int[] scoreArray, Scanner scan){
        int cnt=0;
        while(true) {
            try {
                System.out.print("점수를 입력해 주세요 : ");
                int score = scan.nextInt();
                for (int i = 0; i < 10; i++)
                    if (score == scoreArray[i]) {
                        cnt = 1;
                        System.out.println(idArray[i]);
                    }
                if (cnt == 0) System.out.println("해당되는 값이 없습니다.");
                return;
            } catch (InputMismatchException e) {
                System.out.println("점수를 다시 입력해주세요");
                scan.nextLine();
            }
        }
    }

    private static void input(int[] idArray, int[] scoreArray, Scanner scan) {
        for(int i=0;i<10;i++){
            try{
                idArray[i] = scan.nextInt();
                scoreArray[i] = scan.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("다시 입력해 주세요.");
                scan.nextLine();
                i--;
            }
        }
    }


}
