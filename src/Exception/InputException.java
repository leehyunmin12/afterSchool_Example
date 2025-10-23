package Exception;

import java.util.*;

public class InputException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0,n=0;
        System.out.println("정수 3개를 입력하세요");
        for(int i=0;i<3;i++){
            System.out.print(i+">>");
            try{
                n = scan.nextInt();
                sum+=n;
            }
            catch (InputMismatchException e){
                System.out.println("정수가 아닙니다. 다시 입력하세요!");
                scan.next();
                i--;
            }
        }
        System.out.println("합은 "+sum);
    }
}
