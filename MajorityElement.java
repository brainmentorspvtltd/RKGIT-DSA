import java.util.HashMap;
import java.util.Map.Entry;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(map.get(arr[i]) == null) {
                map.put(arr[i], 1);
            }
            else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        System.out.println(map);

        for(Entry<Integer, Integer> e : map.entrySet()) {
            if(e.getValue() >= arr.length/2) {
                System.out.println("Majority Element : " +e.getValue());
            }
        }


    }
}
