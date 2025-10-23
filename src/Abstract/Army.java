package Abstract;

abstract class Unit {
    int x, y;
    void stop() {}
    abstract void move(int x, int y);
}

class Marine extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("Marine[x="+x+", y="+y+"]");
    }
    void stimPack() {}
}

class Tank extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("Tank[x="+x+", y="+y+"]");
    }
    void changeMode() {}
}

class DropShip extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("Unit[x="+x+", y="+y+"]");
    }
    void load() {}
    void unload() {}
}

public class Army {
    public static void main(String[] args) {
        Unit[] group = new Unit[3];
        group[0] = new Marine();
        group[1] = new Tank();
        group[2] = new DropShip();

        for (int i=0; i<group.length; i++)
            group[i].move(100, 200);

    }
}
