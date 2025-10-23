import java.util.Scanner;

class CurrencyConverter {
    private static double rate;

    public static double toDalloar(double won) {
        return won/rate;
    }
    public static double toKWR(double dollar) {
        return dollar * rate;
    }
    public static void setRate(double r) {
        rate = r;
    }

}
public class StaticMember {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("환율(1달러)>> ");
        double r = scan.nextDouble();
        System.out.print("돈>> ");
        int m = scan.nextInt();
        System.out.print("달러>> ");
        int d = scan.nextInt();
        CurrencyConverter.setRate(r);
        System.out.println(m+"원은 $"+CurrencyConverter.toDalloar(m)+"입니다.");
        System.out.println("$"+d+"은 "+CurrencyConverter.toKWR(d)+"원입니다.");
    }
}
