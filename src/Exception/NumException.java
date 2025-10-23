package Exception;

public class NumException {
    public static void main(String[] args) {
        String[] stringNumber = {"23", "12","3.141592","998"};

        for(int i=0;i< stringNumber.length;i++){
            try{
                System.out.println("숫자로 변환된 값은 "+Integer.parseInt(stringNumber[i]));
            }
            catch (NumberFormatException e){
                System.out.println(stringNumber[i]+"는 정수로 변환할 수 없습니다.");
            }
        }
    }
}
