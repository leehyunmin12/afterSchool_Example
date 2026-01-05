package Test;

import java.util.Scanner;

public class test4Ex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=0;

        System.out.print("자릿수 입력 =>");
        int num = scan.nextInt();

        int intArr[] = new int[num];

        System.out.print("숫자 입력 =>");
        int num2 = scan.nextInt();

        while(num2!=0) {
            intArr[i] = num2%10;
            num2/=10;
            System.out.print(intArr[i]);
            i++;
        }
        System.out.print("\n" + "[");
        for(int j=0; j<intArr.length; j++) {
            if(j!=intArr.length-1) System.out.print(intArr[j] + ", ");
            else System.out.print(intArr[j]);
        }
        System.out.print("]");



    }
}
