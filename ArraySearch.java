public class ArraySearch {
    static int search(int arr[], int index, int searchValue){
        if(index == arr.length){
            return -1;
        }
        if(arr[index]== searchValue){
            return index;
        }
        return search(arr, index+1, searchValue);
    }
    /*
     * Array Build of Occurance Size?
     */
    static int[] search(int arr[], int index, int searchValue, int occuranceCount){
        if(index == arr.length){
            int indexArray[] = new int[occuranceCount];
            return indexArray;
        }
        

        if(arr[index]== searchValue){
            int indexArray[] = search(arr, index+1, searchValue, occuranceCount+1);
            System.out.println("Occ "+occuranceCount);

            indexArray[occuranceCount] = index;
            return indexArray;
        }

        return search(arr, index+1, searchValue, occuranceCount);

        

        
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,40,40,50,40};
        int searchValue = 40;
       // System.out.println(search(arr, 0, searchValue)>=0?"Found":"Not Found");
       int indexArray[] = search(arr, 0, searchValue, 0);
       for(int e : indexArray){
        System.out.println(e);
       }
    }
}
