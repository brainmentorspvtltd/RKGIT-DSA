import java.util.ArrayList;

public class ArrayListDemo {

    static ArrayList<Integer> search(int arr[], int index, int search){
        if(index == arr.length){
            return new ArrayList<Integer>();
        }
        if(arr[index] == search){
            ArrayList<Integer> t = search(arr, index+1, search);
            t.add(index);
            return t;
        }
        return search(arr, index + 1, search);
    }
    public static void main(String[] args) {
        String msg = "Hello";
        System.out.println(msg.length());
        int arr[] = {10,20,30,4};
        System.out.println(arr.length);
    }
}
