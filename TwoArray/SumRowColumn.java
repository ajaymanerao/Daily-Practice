package TwoArray;

public class SumRowColumn {
    public static void sumRowcolumn(int arr[][]){
        System.out.print("Sum of each row: ");
        for(int i=0;i<arr.length;i++){
            int rowSum=0;
            for(int j=0;j<arr[0].length;j++){
                rowSum +=arr[i][j];
            }
            System.out.print(rowSum+" ");
        }
        System.out.println();
        int row=arr.length;
        int column=arr[0].length;
        System.out.print("Sum of each column: ");
        for(int i=0;i<column;i++){
            int columnSum=0;
            for(int j=0;j<row;j++){
                columnSum +=arr[j][i];
            }
            System.out.print(columnSum+" ");
        }
        
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        sumRowcolumn(arr);
    }
    
}
