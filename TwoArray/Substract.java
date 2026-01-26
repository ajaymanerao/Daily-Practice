package TwoArray;

public class Substract {
    public static void substractMatrix(int arr1[][],int arr2[][]){
        int n=arr1.length;
        int arr3[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr3[i][j]=Math.abs(arr1[i][j]-arr2[i][j]);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr3[i][j]+"\t");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]={{4,5,6},{5,6,2},{4,2,1}};
        substractMatrix(arr1, arr2);


    }
    
}
