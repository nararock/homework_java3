import java.util.ArrayList;

public class task1 {
    static ArrayList<Integer> destroyEvenNumber(ArrayList<Integer> enterArray) {
        ArrayList<Integer> notEven = new ArrayList<Integer>();
        for (int i = 0; i < enterArray.size(); i++) {
            if (enterArray.get(i) % 2 != 0) {
                notEven.add(enterArray.get(i));
            }
        }
        return notEven;
    }

    public static void main(String[] args) {
        ArrayList<Integer> myList = myLibrary.createArrayInt(100);
        ArrayList<Integer> notEvenArray = destroyEvenNumber(myList);
        System.out.println("Список случайных чисел: ");
        myLibrary.printArrayInt(myList);
        System.out.println("Список нечетных чисел: ");
        myLibrary.printArrayInt(notEvenArray);
    }
}
