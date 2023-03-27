import java.util.ArrayList;

public class SubSeq {
    static ArrayList<String> subSequence(String str){
        // Base Case or Termination Case
        if(str.length()==0){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        // get the first character
        char firstChar = str.charAt(0);
        String remString = str.substring(1);
        ArrayList<String> finalResult = new ArrayList<>();
        ArrayList<String> r = subSequence(remString);
        for(int i = 0 ; i<r.size(); i++){
            String val = r.get(i);
            finalResult.add(val);
            finalResult.add( firstChar + val);
        }
        return finalResult;


    }
    public static void main(String[] args) {
        ArrayList<String> list = subSequence("amit");
        System.out.println(list);
    }
}
