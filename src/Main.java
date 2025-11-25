
enum CoffeeSize {
    SMALL(2500,250),
    MEDIUM(3000,150),
    LARGE(5000,500);

    final int price, ml;

    CoffeeSize (int price, int ml) {
        this.price = price;
        this.ml = ml;
    }

    String getOrderInfo() {
        return this.name() + "사이즈 " + "("+ml+"ml): " + price + "원";
    }

}
public class Main {
    public static void main(String[] args) {
        CoffeeSize cs = CoffeeSize.MEDIUM;
        System.out.println(cs.getOrderInfo());
    }
}