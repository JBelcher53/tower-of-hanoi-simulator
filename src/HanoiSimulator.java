import java.util.*;

public class HanoiSimulator {

    static ArrayList<Integer>[] pegs;
    static int[] diskLocation;

    public static void main(String[] args) {
        init(3);
       printPegs();
       move(0,1);
       printPegs();
    }
    static void init(int n){

        pegs = new ArrayList[3];

        for (int i = 0; i < 3; i++){
            pegs[i] = new ArrayList<>();
        }

        diskLocation = new int[n + 1];

        for(int i = n; i >= 1; i--){
            pegs[0].add(i);
            diskLocation[i] = 0;
        }
    }
    static void move(int from, int to){
        int disk = pegs[from].remove(pegs[from].size() - 1);
        pegs[to].add(disk);
        diskLocation[disk] = to;
    }
    static void printPegs(){
        System.out.println("A: " + pegs[0]);
        System.out.println("B: " + pegs[1]);
        System.out.println("C: " + pegs[2]);
        System.out.println();
    }
}
