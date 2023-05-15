public class NQueenDemo {
    static int N = 4;

    static boolean isSafeToPlaceAQueen(int row, int col){
        // Case - 1 Check in Above Row on Same Column
        for(int i = row; i>=0; i--){
            if(board[i][col]){
                return false;
            }
        }
        // Case-2 Check Upper Left Diagonal
        for(int i = row, j = col; i>=0 && j>=0; i--, j--){
           
            if(board[i][j]){
                return false;
            }
       
        }
        // Case -3 Check Upper Right Diagonal
        for(int i = row , j  = col; i>=0 && j<N; i--, j++){
            
                if(board[i][j]){
                    return false;
                }
            
        }
        return true;
    }
    
    static boolean board[][] = new boolean[N][N]; // NXN Size Board
    static int countWays(int row){
        int count =0;
        if(row == N){
           
            return 1;
        }
        for(int col = 0; col<N; col++){
            if(isSafeToPlaceAQueen(row, col)){

            board[row][col] = true ; // Queen Place
            count += countWays(row + 1);
            
            board[row][col] = false; 
            }
        }
        return count;
        }
    public static void main(String[] args) {
        System.out.println(countWays(0));
    }
}
