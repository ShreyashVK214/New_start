public class nqueen{

public static void main(String[] args) {
    
}

// Putting queen on places
// this function cheakes when the rows becomes equal to length of board then stop further execution 
static boolean queens( boolean board [][],int row){
    if (row == board.length){
        display(board);
        return true;
    }
    for (int col ;col < board.length;col++){
        if(isSafe(board,row,col)){
            board[row][col]=true;
        }
        else {
            board [row] [col]=false
        }
    }
    return false;

}

// actual important function to cheak if the queen is safe or not
pu





// just to display
// this function just takes the array of booleans and prints Q if the boolean value is true and X where boolean value is false
private static void display(boolean board[][]){
    for(boolean [] row :board){
        for(boolean element : row){
            if (element){
                System.out.println("Q ");
            }else {
                System.out.println("X ");
            }
        }
        System.out.println();
    }
}

}