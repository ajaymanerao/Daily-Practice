package TwoArray;

public class DigonalSum {
    public static void diagonalSum(int arr1[][]){
        int n=arr1.length;
        int sum=0;
        System.out.print("Diagonal Element: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print(arr1[i][j]+" ");
                    sum +=arr1[i][j];
                }
            }
        }
        System.out.println();
        System.out.print(sum);
    }

    public static void main(String[] args) {
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        diagonalSum(arr1);
    }
    
}
