class StringReverse{
    static String reverse (String str){
        // Termination Case
        if(str.length()==0){
            return "";
        }
        // if string is empty then stop
        // Repeat
        // get the first character
        char singleChar = str.charAt(0);
        // make the string small
        String smallString = str.substring(1);
        String returnValue = reverse(smallString); // Recursion Call
        return returnValue + singleChar;

    }
    public static void main(String[] args) {
        String r = reverse("amit");
        System.out.println(r);
    }
}