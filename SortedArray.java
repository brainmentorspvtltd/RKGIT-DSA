public class SortedArray {
    static boolean isSortedArray(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return isSortedArray(arr, index+1);
    }
  public static void main(String[] args) {
    int arr [] = {10,200,30,40,50};
    System.out.println(isSortedArray(arr, 0)
    ?"Sorted":"Not Sorted");
  }  
}
