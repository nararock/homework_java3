import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = myLibrary.createArrayInt(100);
        int maxNum = myList.get(0);
        int minNum = myList.get(0);
        int avg = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (maxNum < myList.get(i))
                maxNum = myList.get(i);
            else if (minNum > myList.get(i))
                minNum = myList.get(i);
            avg += myList.get(i);
        }
        double avgD = Double.valueOf(avg) / myList.size();
        System.out.println("Список случайных чисел: ");
        System.out.println(myList);
        System.out.printf("Максимум равен %d, минимум равен %d, среднее значение равно %f", maxNum, minNum, avgD);
    }
}
