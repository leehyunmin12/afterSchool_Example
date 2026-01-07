package Test;

class Person {
    private String name, addr, phone;

    public Person() {}

    public Person(String name, String addr, String phone) {
        this.name = name;
        this.addr = addr;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
class Student2 extends Person {
    private int stuId;
    private String jeongong;

    public Student2() {}
    public Student2(int stuId, String jeongong, String name, String addr, String phone) {
        super(name, addr, phone);
        this.stuId = stuId;
        this.jeongong = jeongong;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getJeongong() {
        return jeongong;
    }

    public void setJeongong(String jeongong) {
        this.jeongong = jeongong;
    }

    @Override
    public String toString() {
        return super.toString() + ", 학번 : " + stuId + ", 전공 : " + jeongong;
    }
}
class Customer extends Person {
    private int cusNo, mile;

    public Customer() {}

    public Customer(String name, String addr, String phone, int cusNo, int mile) {
        super(name, addr, phone);
        this.cusNo = cusNo;
        this.mile = mile;
    }

    public int getCusNo() {
        return cusNo;
    }

    public void setCusNo(int cusNo) {
        this.cusNo = cusNo;
    }

    public int getMile() {
        return mile;
    }

    public void setMile(int mile) {
        this.mile = mile;
    }

    @Override
    public String toString() {
        return super.toString() + ", 고객 번호 : " + cusNo + ", 마일리지 : " + mile;
    }
}

public class PersonMain {
    public static void main(String[] args) {
        Student2 stds[] = {
                new Student2(1212, "자바", "이현민", "관악구", "010-3496-2292"),
                new Student2(1207, "자바", "연정훈", "관악구", "010-2937-2292"),
        };
        Customer customers[] = {
                new Customer("이현민", "관악구", "010-3496-2292",1,20000),
                new Customer("연정훈", "관악구", "010-2937-2292",2,2000),
        };
        for(int i=0; i<stds.length; i++){
            System.out.println(stds[i]);
            System.out.println(customers[i]);
        }
        for(Student2 std : stds) System.out.println(std);
        for(Customer cus : customers) System.out.println(cus);
    }
}
