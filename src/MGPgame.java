import java.util.Random;
import java.util.Scanner;

abstract class Player {
    protected String bet[] = {"묵", "찌", "빠"};
    protected String name;
    protected String lastBet = null;

    protected Player(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getBet() {
        return lastBet;
    }

    abstract public String next();
}

class Human extends Player {
    Scanner scan = new Scanner(System.in);
    Human(String name) {
        super(name);
    }
    @Override
    public String next() {
        System.out.print(name + ">> ");
        String PlayerChoice1 = scan.nextLine();
        return PlayerChoice1;
    }
}

class Computer extends Player {
    Computer(String name) {
        super(name);
    }
    @Override
    public String next() {
        System.out.print(name + ">> ");
        int r = new Random().nextInt(3);
        String ComputerChoice = bet[r];
        System.out.println(ComputerChoice);
        return ComputerChoice;
    }

}

public class MGPgame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***** 묵찌빠 게임 시작 *****");
        System.out.print("선수이름 입력 >>");
        String PlayerName = scan.nextLine();
        System.out.print("컴퓨터 이름 >>");
        String ComputerName = scan.nextLine();
        System.out.println("2명의 선수 생성 완료");
        Human human = new Human(PlayerName);
        Computer computer = new Computer(ComputerName);
        String whoOwner = PlayerName;
        String lastOwner;

        while(true) {
            lastOwner = whoOwner;
            String PlayterC =  human.next();
                if(!PlayterC.equals("묵") && !PlayterC.equals("찌") && !PlayterC.equals("빠")) {
                    System.out.println("다시 입력하세요");
                    continue;
                }
            String ComputerC = computer.next();
            System.out.println(PlayerName + " : " + PlayterC + ", " + ComputerName + " : " + ComputerC);

            whoOwner = chooseOwner(PlayterC, ComputerC) == 0 ? human.getName() : chooseOwner(PlayterC, ComputerC) == 1 ? computer.getName() : "draw";
            if(whoOwner.equals("draw")){
                System.out.println(lastOwner+"승 ");
                System.out.print("게임을 종료합니다.");
                break;
            }
            else System.out.println("오너는 "+whoOwner+"입니다.");
        }
    }

    public static int chooseOwner(String playerChoice, String computerChoice) {
        String pc = playerChoice;
        String cc = computerChoice;

        if(cc.equals("묵")){
            if(pc.equals("빠")) return 0;
            if(pc.equals("찌")) return 1;
            else return 2;
        }
        if(cc.equals("찌")){
            if(pc.equals("묵")) return 0;
            if(pc.equals("빠")) return 1;
            else return 2;
        }
        if(cc.equals("빠")){
            if(pc.equals("찌")) return 0;
            if(pc.equals("묵")) return 1;
            else return 2;
        }
        else return -1;
    }
}
