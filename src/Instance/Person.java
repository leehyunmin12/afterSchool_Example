package Instance;

class 사람 {
    String 이름, 직업, 나이, 성별, 혈액형;

    public 사람(String 이름, String 직업, String 나이, String 성별, String 혈액형) {
        this.이름 = 이름;
        this.직업 = 직업;
        this.나이 = 나이;
        this.성별 = 성별;
        this.혈액형 = 혈액형;
    }

    public void Info() {
        System.out.println(이름);
        System.out.println(직업);
        System.out.println(나이);
        System.out.println(성별);
        System.out.println(혈액형);
    }

    public void 밥먹기() {
        System.out.println("냠냠");
    }
    public void 잠자기() {
        System.out.println("쿨쿨");
    }
    public void 말하기() {
        System.out.println("정훈이 바보");
    }
    public void 걷기() {
        System.out.println("저벅저벅");
    }
}

public class Person {
    public static void main(String[] args) {
        사람 사람들[] = {
                new 사람("황수연", "컴퓨터과학 전공 학생", "20", "여", "A"),
                new 사람("이미녀", "골프 선수", "28", "여", "O"),
                new 사람("김미남", "교수", "47", "남", "AB"),
                new 사람("연정훈", "프로 먹방러 (푸드파이터)","18", "남", "O")
        };

        사람들[0].Info();

    }
}
