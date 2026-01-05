package ForEx;

public class NestedLoop {
    public static void main(String[] args) {

        for(int i=2; i<=9; i++) {
            for(int j=0; j<=9; j++) {
                if( j==0 ) System.out.print(i+"단 입니다.  ");
                else System.out.print(i + "*" + j + "=" + (i*j) + "  ");
            }
            System.out.println();
        }

    }
}
