public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,4};
        int max = Integer.MIN_VALUE;
        for(int element : arr){
            if(element>max){
                max = element;
            }
        }
        int xor = 0;
        for(int i = 1; i<=max; i++){
                xor = xor ^ i;
        }
        int xor2= 0;
        for(int e : arr){
            xor2 = xor2 ^ e;
        }
        System.out.println(xor^ xor2);
    }
}
