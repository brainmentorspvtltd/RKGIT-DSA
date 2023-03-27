import java.util.ArrayList;

public class DiceBoard {
    static ArrayList<String> getAllPos(int start, int end){
        if(start == end){
            ArrayList<String> list =new ArrayList<>();
            list.add("");
            return list;
        }
        if(start>end){
            ArrayList<String> list =new ArrayList<>();
            return list;
        }
        ArrayList<String> finalResult =new ArrayList<>();
        for(int dice = 1; dice<=6; dice++){
            ArrayList<String> r = getAllPos(start+dice, end);
            for(int i = 0; i<r.size(); i++){
                finalResult.add(r.get(i)+dice);
            }
        }
        return finalResult;
    }
    public static void main(String[] args) {
        ArrayList<String> result = getAllPos(0, 10);
        System.out.println(result);
    }
}
