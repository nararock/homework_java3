import java.util.ArrayList;

public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = myLibrary.createArrayInt(200);
        System.out.println("Дано: ");
        System.out.println(mylist);
        for (int i = 0; i < mylist.size(); i++) {
            for (int j = 0; j < mylist.size() - i - 1; j++) {
                if (mylist.get(j) > mylist.get(j + 1)) {
                    int temp = mylist.get(j);
                    mylist.set(j, mylist.get(j + 1));
                    mylist.set(j + 1, temp);
                }
            }
        }
        System.out.println("После сортировки: ");
        System.out.println(mylist);
    }
}
