import java.util.ArrayList;

public class Perm {
    public static void main(String[] args) {
        System.out.println(getPerm("abc"));
    }
    static ArrayList<String> getPerm(String str){
        // Reach Base Case
        if(str.length()==0){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        // get the first char
        char firstChar = str.charAt(0);
        // make the string small
        String remString = str.substring(1);
        // Do the Recursion
        // Make a Fresh List
        ArrayList<String> finalList = new ArrayList<>();
        ArrayList<String> r = getPerm(remString);
        for(int i = 0; i<r.size(); i++){
            String val = r.get(i);
          
            for(int j = 0; j<=val.length(); j++){
                StringBuffer sb = new StringBuffer(val);  
                sb.insert(j, firstChar);
                finalList.add(sb.toString());
                
            }
           
            
        }
        return finalList;
    }
}
