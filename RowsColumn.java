import java.util.Scanner;
public class RowsColumn {
    public static void main(String[]args){
        //Input
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][2];
        System.out.println(arr.length); //no. of rows
        for(int row=0; row<arr.length;row++){

            //for each column in every row
            for(int col=0; col<arr[row].length;col++){
                arr[row][col] = in.nextInt();
        
            }
        }
    }
    
}
