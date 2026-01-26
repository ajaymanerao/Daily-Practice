package TwoArray;

public class Add {
    public static void addMatrix(int arr1[][],int arr2[][]){
        int arr3[][]=new int[arr1.length][arr1.length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                 System.out.print(arr3[i][j]+"\t");
            }
            System.out.println();
            
        }


    } 
    

    public static void main(String[] args) {
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]={{4,5,6},{5,6,2},{4,2,1}};
        addMatrix(arr1, arr2);
    }
}
