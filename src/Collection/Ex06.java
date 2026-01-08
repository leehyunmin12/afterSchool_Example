package Collection;

import java.util.HashMap;
import java.util.Scanner;

class Student2 {
    int id;
    String tel;
    public Student2(int id, String tel) {
        this.id = id;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}

public class Ex06 {
    public static void main(String[] args) {
        HashMap<String, Student2> map = new HashMap<String, Student2>();

        map.put("황기태", new Student2(1, "010-111-1111"));
        map.put("이재문", new Student2(2, "010-222-2222"));
        map.put("김남윤", new Student2(3, "010-333-3333"));

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("검색할 이름? ");
            String name = scanner.nextLine();
            if(name.equals("exit")) break;
            Student2 student = map.get(name);
            if(student == null) System.out.println(name + "은 없는 사람입니다.");
            else System.out.println("id:" + student.getId() + ", 전화: " + student.getTel());
        }
        scanner.close();
    }
}
