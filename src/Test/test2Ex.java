package Test;

public class test2Ex {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=200; i<=1000; i++){
            if(i%2 == 0) sum+=i;
        }

        System.out.println("200~1000 사이의 짝수의 합 : " + sum);

    }
}
