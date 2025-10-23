package instance;

import java.util.Scanner;

class Character {
    String cname,arme;
    int cage;

    public Character(String name, int cage, String arme) {
        this.cname = name;
        this.cage = cage;
        this.arme = arme;
    }

    public void introduceCh(){
        System.out.println("캐릭터의 이름은 "+cname+"이고 나이는 "+cage+"이며 무기는 "+arme+"를 가지고 있습니다.");
    }
}
public class GameRPG{
    public static void main(String[] args) {
        Character [] cht = new Character[2];

        Scanner scan = new Scanner(System.in);
        for(int i=0;i<cht.length;i++){
            System.out.print("이름 : ");
            String name = scan.next();
            System.out.print("나이 : ");
            int age = scan.nextInt();
            System.out.print("무기 : ");
            String arme = scan.next();
            cht[i] = new Character(name,age,arme);
        }
        for(int i=0;i<cht.length;i++){
            cht[i].introduceCh();
        }

    }
}
