import java.util.Scanner;

public class indexOf2Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        System.out.println("Enter elements of the 2D array:");
        int[][] arr=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the target element to search: ");
        int target=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==target){
                    System.out.println("(i,j)="+"("+i+","+j+")");
                    return;
                }
            }
        }
    }
}
