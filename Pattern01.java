public class Pattern01 {
    static void printStar(int star){
        if(star==0){
            return ;
        }
        System.out.print("*");
        printStar(star-1);
    }
    static void printLine(int lineNumber){
        if(lineNumber ==0){
            return ;  }
            printStar(lineNumber);
            System.out.println();
        printLine(lineNumber-1);
        
       
}
    public static void main(String[] args) {
        printLine(5);
    }
}
