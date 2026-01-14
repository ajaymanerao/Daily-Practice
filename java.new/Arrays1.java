public class Arrays1 {



    public static void Serachkey(int key, int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==key){
                System.out.println(i);
            }
        }


    }


    public static void getlargest(int arr[]){
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }




    public static void main(String [] args){
        // int arr[]={2,4,6,8,10,18,14,16};
        int key=10;
        // Serachkey(key, arr);
       // getlargest(arr);

    //    for(int i=0;i<arr.length;i++){
    //     for(int j=1;j<arr.length;j++){
    //         System.out.print("("+arr[i]+","+arr[j]+")"+" ");
    //     }
    //     System.out.println();
    //    }

//sub array
    // for(int i=0;i<arr.length;i++){
    //     for(int j=i;j<arr.length;j++){
    //         for(int k=i;k<=j;k++){
    //             System.out.print(arr[k]);

    //         }
    //         System.out.println();
    //     }
    // }

    //sum of max sub ARRAy

//     int sum[]={2,4,6,8,10};
//     int currentsum=0;
//     int maxsum=Integer.MIN_VALUE;
//       for(int i=0;i<sum.length;i++){
//         for(int j=i;j<sum.length;j++){
//             currentsum=0;
//             for(int k=i;k<=j;k++){
//                 currentsum +=sum[k];
//                 // System.out.print(arr[k]);

//             }
//             System.out.println(currentsum);
//             if(maxsum<currentsum){
//                 maxsum =currentsum;
//             }
//         }
//     }

// System.out.println("max sum is "+maxsum);

// int arr[]={4,10,7,5,20};
// int max =arr[0];
// int secmax=arr[0];
// for(int i=0;i<arr.length;i++){
//     if(max<arr[i]){
//         secmax=max;
//         max=arr[i];
//     }
// }
// System.out.println(secmax);

// int arr[]={1,2,2,3,4,4,5};
// int n=arr.length;
// int arr1[]=new int[n];
// int index=0;
  

// for(int i=0;i<arr.length;i++){
//     boolean isduplicate=false;
//     for(int j=0;j<index;j++){
//         if(arr[i]==arr1[j]){
//             isduplicate=true;
//             break;
//         }
//     }

// if(!isduplicate){
//     arr1[index++]=arr[i];

// }
// }
// for (int i = 0; i < index; i++) {
//     System.out.print(arr1[i] + " ");
// }

int arr[]={1,2,3,4,5};
int temp=arr[0];
for(int r=0; r<2;r++){
for(int i=0;i<arr.length-1;i++){
    arr[i]=arr[i+1];
}
arr[arr.length-1]=temp;
}
for(int val:arr){
    System.out.println(val+" ");
}



    }
    
}
