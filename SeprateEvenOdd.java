public class SeprateEvenOdd {
    public static void seprateEvenOdd(int arr[]){
       int n=arr.length;
        int x=0, y=0;
        int odd[]=new int[x];
        int  even[]=new int[y];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even[x]=arr[i];
                x++;
            }else{
                odd[y]=arr[i];
                y++;
            }

        }
        for(int i:even){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int j:odd){
            System.out.print(j+" ");
        }


    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        seprateEvenOdd(arr);
    }
    
}
