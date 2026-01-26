package TwoArray;
import java.util.*;

public class MatrixEqual {
    public static boolean matrixEqual(int arr1[][], int arr2[][]){
        int m=arr1.length;
        int n=arr1[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr1[i][j]!=arr2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int arr1[][]=new int[row][column];
        int arr2[][]=new int[row][column];

        System.out.println("Enter the element of first matrix :");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the Element of Second Matrix :");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr2[i][j]=sc.nextInt();
            }
        }

        if(matrixEqual(arr1, arr2)==true){
            System.out.println("Matrices are equal");
        }else{
            System.out.println("Matrices are not equal");
        }

    }
    
}
