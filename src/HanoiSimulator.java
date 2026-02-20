import java.util.*;

public class HanoiSimulator {

    static ArrayList<Integer>[] pegs;

    public static void main(String[] args) {

        int n = 3; // number of disks

        pegs = new ArrayList[3];
        for(int i = 0; i < 3; i++){
            pegs[i] = new ArrayList<>();
        }

        // initialize peg A
        for(int i = n; i >= 1; i--){
            pegs[0].add(i);
        }

        printPegs();
    }

    static void printPegs(){
        System.out.println("A: " + pegs[0]);
        System.out.println("B: " + pegs[1]);
        System.out.println("C: " + pegs[2]);
        System.out.println();
    }
}
