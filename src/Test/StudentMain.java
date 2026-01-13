//package Test;
//
//class Student {
//    private String name, stuld, age, phone;
//    static int count = 0;
//    public Student() {
//        count++;
//    }
//    public Student(String name, String stuld, String age, String phone) {
//        this.name = name;
//        this.stuld = stuld;
//        this.age = age;
//        this.phone = phone;
//        count++;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getStuld() {
//        return stuld;
//    }
//
//    public void setStuld(String stuld) {
//        this.stuld = stuld;
//    }
//
//    public String getAge() {
//        return age;
//    }
//
//    public void setAge(String age) {
//        this.age = age;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "이름='" + name + '\'' +
//                ", 학번='" + stuld + '\'' +
//                ", 나이='" + age + '\'' +
//                ", 전화번호='" + phone + '\'' +
//                '}';
//    }
//}
//
//public class StudentMain {
//    public static void main(String[] args) {
//        Student students[] = {
//                new Student("이현민", "1212", "18", "010-3496-2292"),
//                new Student("연정훈", "1205", "18", "010-1577-1577"),
//        };
//        for(int i=0; i<students.length; i++) System.out.println(students[i]);
//        for(Student std : students) System.out.println(std);
//
//        System.out.println("전체 학생 수 : " + Student.count);
//
//    }
//}
