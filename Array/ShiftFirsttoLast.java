package Array;

public class ShiftFirsttoLast {
    public static void shiftLast(int arr[]){
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
            arr[arr.length-1]=temp;

        }
    }

    public static void LastFirst(int arr[]){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){  
            arr[i]=arr[i-1];
        }
         arr[0]=temp;
    }

    static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    


    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        display(arr);
        //shiftLast(arr);
        LastFirst(arr);
        display(arr);
    }
}
