public class SpaceStar {
    static void printSpace(int space){
        if(space==0){
            return ;
        }
        System.out.print(" ");
        printSpace(space-1);
    }
    static void printStar(int star){
        if(star==0){
            return ;
        }
        System.out.print("*");
        printStar(star-1);
    }
    static void printLine(int lineNumber, int totalNumberOfLines){
            if(lineNumber ==0){
                return ;
            }
            printLine(lineNumber-1, totalNumberOfLines);
            printSpace(totalNumberOfLines - lineNumber);
            printStar(lineNumber);
            System.out.println();
    }
    public static void main(String[] args) {
            printLine(5,5);
    }
}
