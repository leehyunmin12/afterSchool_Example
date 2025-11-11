package Collection;
import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String longlongname = "";

        for (int i=0; i<4; i++){
            System.out.print("이름을 입력하세요 >>");
            names.add(scan.nextLine());
        }
        System.out.println("-------------------------------------------");
        for(int i=0; i<4; i++){
            System.out.println("name = " + names.get(i));
            if(longlongname.length() < names.get(i).length() ) longlongname = names.get(i);
        }
        System.out.print("가장 길이가 긴 이름 : ");
        System.out.println(longlongname);
    }
}
