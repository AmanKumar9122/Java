import java.util.ArrayList;
import java.util.List;

public class hanoi {

    public static void main(String[] args) {
        int nDisks = 3;
        int nTowers = 5;

        List<List<Integer>> towers = new ArrayList<>();
        for (int i = 0; i < nTowers; i++) {
            towers.add(new ArrayList<>());
        }

        // Place disks on the first tower
        for (int i = nDisks; i > 0; i--) {
            towers.get(0).add(i);
        }

        System.out.println("Initial Towers:");
        printTowers(towers);

        hanoi(nDisks, 0, 4, 1, towers);

        System.out.println("\nFinal Towers:");
        printTowers(towers);
    }

    static void hanoi(int n, int source, int target, int auxiliary, List<List<Integer>> towers) {
        if (n > 0) {
            // Move n-1 disks from source to auxiliary using target as an auxiliary tower
            hanoi(n - 1, source, auxiliary, target, towers);

            // Move the nth disk from source to target
            moveDisk(source, target, towers);

            // Move the n-1 disks from auxiliary to target using source as an auxiliary tower
            hanoi(n - 1, auxiliary, target, source, towers);
        }
    }

    static void moveDisk(int source, int target, List<List<Integer>> towers) {
        if (!towers.get(source).isEmpty()) {
            int disk = towers.get(source).remove(towers.get(source).size() - 1);
            towers.get(target).add(disk);
            System.out.println("Move disk " + disk + " from Tower " + (source + 1) + " to Tower " + (target + 1));
        }
    }

    static void printTowers(List<List<Integer>> towers) {
        for (int i = 0; i < towers.size(); i++) {
            System.out.println("Tower " + (i + 1) + ": " + towers.get(i));
        }
    }
}
