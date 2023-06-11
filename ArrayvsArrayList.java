import java.util.ArrayList;

public class ArrayvsArrayList {
    public static void main(String[] args) {
        int arr[] = new int[5];
        for (int e : arr) {
            System.out.println(e);
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(0, 99);
        System.out.println(list);
    }
}
