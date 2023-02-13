public class BinarySearch {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,6,6,6,7,8};
        int search = 6;
        int low = 0;
        int high = arr.length-1;
        int firstIndex = -1;
        while(low<=high){
        int mid = (low + high)/2;
        if(search == arr[mid]){
            firstIndex = mid;
            high = mid -1;
            //System.err.println("Found...");
            //return ;
        }
         if(search>arr[mid]){
            low = mid + 1;
         }  
         else if (search<arr[mid]){
            high = mid - 1;
         } 
    }
     low = 0;
     high = arr.length-1;
    int lastIndex = -1;
    while(low<=high){
    int mid = (low + high)/2;
    if(search == arr[mid]){
        lastIndex = mid;
        low = mid +1;
        //System.err.println("Found...");
        //return ;
    }
     if(search>arr[mid]){
        low = mid + 1;
     }  
     else if (search<arr[mid]){
        high = mid - 1;
     } 
}
System.out.println((lastIndex-firstIndex)+1);
    //System.out.println("Not Found...");
    }
}
