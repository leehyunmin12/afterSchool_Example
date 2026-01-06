package Test;

import java.util.Scanner;

public class test6Ex {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String Namelist[] = {"RM", "진", "슈가", "제이홉","지민", "뷔", "정국"};
        int Agelist[] = {29,31,31,30,28,28,26};
        int Kilist[] = {181,179,174,177,174,179,177};

        System.out.print("멤버의 이름을 입력하시오 : ");
        String name = scan.nextLine();

        for(int i=0;i<Namelist.length;i++) {
            if(name.equals(Namelist[i])) {
                System.out.print("이름은 " + Namelist[i] + "이며 나이는 " + Agelist[i] + "이고 키는 " + Kilist[i] + "입니다.");
                break;
            }
            if(i==Namelist.length-1) System.out.print("입력하신 멤버는 존재하지 않습니다."); // 멤버에 포함되어 있지 않았을 때 출력
        }


    }
}
