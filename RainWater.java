public class RainWater {
    public static void main(String[] args) {
        int arr[] = {4,2,0,3,2,5};
        int n = arr.length;
        int pMax[] = new int[n];
        // pMax = [4,4,4,4,4,5]
        int sMax[] = new int[n];
        // sMax = [5,5,5,5,5,5]
        pMax[0] = arr[0];
        sMax[n-1] = arr[n-1];

        for(int i = 1; i < n; i++) {
            pMax[i] = Math.max(arr[i], pMax[i-1]);
        }

        for(int i = n-2; i >= 0; i--) {
            sMax[i] = Math.max(arr[i], sMax[i+1]);
        }

        int total = 0;
        for(int i = 0; i < n; i++) {
            int currentPillar = arr[i];
            int min = Math.min(pMax[i], sMax[i]);
            if(currentPillar < min) {
                total += min - currentPillar;
            }
        }
        System.out.println("Total is : " + total);

    }
}
