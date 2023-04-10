public class GasStation {
    public static void main(String[] args) {
        int gas[] = {1,2,3,4,5};
        int cost[] = {3,4,5,1,2};
        int index = 0;
        int result = 0;
        int loss = 0;
        for(int i = 0; i < cost.length; i++) {
            result += gas[i] - cost[i];
            if(result < 0) {
                index = i + 1;
                loss += result;
                result = 0;
            }
        }
    }
}
