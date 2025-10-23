package Abstract;
import fextends.SuperEx;

import java.util.*;

abstract class Box {
    protected int size;
    public Box(int size) {
        this.size = size;
    }
    public boolean isEmpty() {return size == 0;}
    public abstract boolean consume(int v);
    public abstract void print();
}

class IngredientBox {
    int sugar = 5, coffee = 5, cream = 5;
    public void print() {
    }
    public boolean consume(int v) {
        if (sugar == 0 || coffee == 0 || cream == 0) return false;
        else if (v == 1){
            sugar--;
            coffee--;
            cream--;
            return true;
        }
        else if(v == 2){
            coffee--;
            sugar--;
            return true;
        }
        else if(v == 3) {
            coffee--;
            return true;
        }
        return false;
    }
    public void printmenu() {
        System.out.print("커피 ");
        for(int i=0; i<coffee; i++) System.out.print("*");
        System.out.println(coffee);
        System.out.print("프림 ");
        for(int i=0; i<cream; i++) System.out.print("*");
        System.out.println(cream);
        System.out.print("설탕 ");
        for(int i=0; i<sugar; i++) System.out.print("*");
        System.out.println(sugar);
    }
}

public class VendingMachineEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        }
    }
