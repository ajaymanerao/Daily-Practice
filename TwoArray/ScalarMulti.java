package TwoArray;

public class ScalarMulti {
    public static void scalarMulti(int arr[][]){
        int scalarValue=3;
        int n=arr.length;
        int arr2[][]=new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr2[i][j]=(arr[i][j])*scalarValue;

            }
             
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr2[i][j]+"  ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int arr[][]={{1,2},{3,4}};
        scalarMulti(arr);
    }
    
}
