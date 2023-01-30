import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class myLibrary {
    static ArrayList<Integer> createArrayInt(int bound) {
        ArrayList myList = new ArrayList<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите количество чисел: ");
        int amount = Integer.parseInt(iScanner.nextLine());
        Random random = new Random();
        for (int i = 0; i < amount; i++) {
            myList.add(random.nextInt(bound));
        }
        return myList;
    }

    static void printArrayInt(ArrayList<Integer> enterArray) {
        for (int i = 0; i < enterArray.size(); i++) {
            System.out.printf("%d ", enterArray.get(i));
        }
        System.out.println("");
    }
}
