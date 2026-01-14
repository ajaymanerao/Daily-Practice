import java.util.*;
public class Array {
     
//     public static int LinearSearch(int numbers[], int key){
//         for(int i=0;i<numbers.length;i++){
//             if (numbers[i] == key){
//                 return i;
//             }
//         }
//                 return -1;
//             }
//     public static void main(String[] args){
//         int numbers[]={10,20,30,40,50,60,70,80,90};
//         int key=50;
//         int index =LinearSearch(numbers ,key);
//         if(index== -1){
//             System.out.print("index is not found");
//         }else{
//             System.out.print("index is "+index);
//         }
//     }
    
// }

// }




// public static void reverse(int numbers[]){
//     int first =0, last=numbers.length-1;

//     while(first < last){
//         int temp = numbers[last];
//         numbers[last]=numbers[first];
//         numbers[first]=temp;
//         first++;
//         last--;
//     }
// }
//  public static void main(String [] args){
//     int numbers[]={2,4,6,8,10};
//     reverse(numbers);
//     for(int i=0;i<numbers.length;i++){
//     System.out.print(+numbers[i]);
//     }
//     System.out.println();
//  }


// public static void printPairs(int numbers[]){
//     for(int i=0;i<numbers.length;i++){
//     int curr = numbers[i];
//     for(int j=i+1;j<numbers.length;j++){
//         System.out.print("("+curr+","+numbers[j]+")");
//     }
//     System.out.println();
// }
// }
// public static void main(String [] args){
//     int numbers[]={2,4,6,8,10};
//     printPairs(numbers);
// }





// public static void SubArray(int numbers[]){
//       int currSum=0;
//          int maxSum=Integer.MIN_VALUE;
//     for(int i=0;i<numbers.length;i++){
//          int start =i;
       
//         for(int j=i;j<numbers.length;j++){
//             int end=j;
//             currSum=0;
//             for(int k=start; k<=end;k++){
//                 //System.out.print(numbers[k]+" ");
//                 currSum += numbers[k];

//             }
//             System.out.println(currSum);
//             if(maxSum < currSum){
//                 maxSum = currSum;
//             }
            
//             //System.out.println();
//             }
//         //System.out.println();
//     }
//     System.out.println("max Sum is ="+maxSum);
// }

// public static void main(String [] args){
//     int numbers[]={2,4,6,8,10};
//     SubArray(numbers);
//}



// public static void main(String[] args) {
//     int n=0;
//      Scanner sc=new Scanner(System.in);
//     System.out.println("enter the size of Array");
//     n=sc.nextInt();
//     int Array[]=new int[n];
//     System.out.println("Enter the element of Array");
//      for(int i=0;i<n;i++){
//         Array[i]=sc.nextInt(); 
//      }
//      for(int j=0;j<n;j++)     
//         {
//        System.out.println(Array[j]);
//         }

    

//      System.out.println("Reverse order Array");
//     for(int i=Array.length-1;i>=0;i--){
//         System.out.println(Array[i]);
//     }



//     System.out.println("pair of the Array");
//     for(int i=0;i<Array.length;i++){
//         int Curr=Array[i];
//         for(int j=i+1;j<Array.length;j++){
//             System.out.print("("+Curr+","+Array[j]+")");
//         }
//         System.out.println();
//     }







//     for(int i=0;i<Array.length;i++){
//         for(int j=i+1;j<Array.length;j++){
//             if(Array[j]<Array[i]){
//                 int temp=Array[i];
//                 Array[i]=Array[j];
//                 Array[j]=temp;


//             }

//         }
         

//     }
//     System.out.println("increasing order"+Arrays.toString(Array));



//     for(int i=0;i<Array.length;i++){
//         for(int j=i+1;j<Array.length;j++){
//             if(Array[i] < Array[j]){
//                 int temp=Array[j];
//                 Array[j]=Array[i];
//                 Array[i]=temp;


//             }

//         }
         

//     }
//     System.out.println("Decreasing order"+Arrays.toString(Array));
    
    
// // Arrays.sort(Array);
// // System.out.println("Array in increasing order"+Arrays.toString(Array));

// // Arrays.sort(Array,Comparator.reverseOrder());
// // System.out.println("Decreasing order Array"+Arrays.toString(Array));

// }


//  bubble sort;-


// public static void main(String[] args) {
//     int arr[]={5,3,1,4,2};
//     System.out.println(arr.length);
//     for(int i=0;i<arr.length;i++){
//         for(int j=i+1;j<arr.length;j++){
//             if(arr[i]>arr[j]){
//                 int temp=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;

//             }


//         }
//     }
//         System.out.println("bubble sort"+Arrays.toString(arr));

        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]<arr[j]){
        //             int temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
    
        //         }
    
    
        //     }
        // }
        //     System.out.println("bubble short"+Arrays.toString(arr));
//}


//Selection sort:=


//insertion sort
// public static void insertionsort(int arr[]){
//     for(int i=1;i<arr.length;i++){
//         int curr=arr[i];
//         int prev=i-1;
//         while (prev >=0 && arr[prev]> arr[curr]) {
//             arr[prev+1]=arr[prev];
//             prev--;


            
//         }
//         arr[prev+1]=arr[curr];
//     }
// }


// public static void main(String[] args) {
//     int arr[]={5,4,1,3,2};
//     insertionsort(arr);
//     printArr(arr);
// }



// 



// public static void main(String[] args) {
//         int arr[]={5,4,1,3,2};
//         for(int i=0;i<arr.length;i++){
//                 int minpos=i;
//                 for(int j=i+1;j<arr.length;j++){
//                         if(arr[minpos]>arr[j]){
//                                 minpos=j;
//                         }

//                 }
//                 int temp=arr[minpos];
//                 arr[minpos]=arr[i];
//                 arr[i]=temp;
//                 System.out.print(arr[i]);
//         }
         
// }



// public static int foodconsume(int arr[],int rat, int unit){
//         int mul =rat*unit;
//         int sum=0;
//         int house=0;
//         for(int i=0;i<arr.length;i++){
//               sum =sum+arr[i];
//               house++;
//                 if(sum>= mul){
//                     return  house;    
//                 }
                
                
//         }
//         return house;

// }

// public static void main(String[] args) {
//         int arr[]={2,8,3,5,7,4,1,2};
//         int rat =7;
//         int unit=2;
//         int value=foodconsume(arr, rat, unit);
//         System.out.println(value);
// }

// public static int[] twosum(int nums[],int target){
//         // int sum=0;
//         for (int i=0;i<nums.length;i++){
//                 for(int j=i+1;j<nums.length;j++){
                        
        
//         // sum=sum +nums[i];
//                         if(nums[i]+nums[j]==target){
//                                 // System.out.println(i+","+j);
//                                 return new int[] {i,j};
//                                 }
                                 
//                         }

//                 }
//                 throw new IllegalArgumentException("no sum sol");
//         }
        
 



// public static void main(String[] args) {
//         int nums[]={2,7,11,15};
//         int target=20;
//          int[] result=twosum(nums, target);
//          System.out.println(result);
//         }


// public static void main(String[] args) {
//         int divisible=0;
//         int notdivisible=0;
//         int n=4;
//         int m=20;
//         for(int i=1;i<=m;i++){
//                 if(i%4 !=0){
//                         notdivisible=notdivisible+i;
                        
//                 }
//                 if(i%4==0){
//                     divisible=divisible+i;
//                 }

//         }
//         System.out.println(notdivisible);
//         System.out.println(divisible);
//         System.err.println(notdivisible-divisible);
// }



// public static void main(String[] args) {
//         int arr[]={5,2,4,3,9,7,1};
//         int sum=9;
//         int small=0;
//         Arrays.sort(arr);
//         for(int i=0;i<arr.length;i++){
//                 for(int j=i+1;j<arr.length;j++){
//                          small=+arr[i]+arr[j];
//                         // // small=Integer.MAX_VALUE;
//                         if(small <= sum){
//                                 int mul= arr[i]*arr[j];
//                                 // mul=Integer.MAX_VALUE;
//                                 // System.out.println(mul);
                        

//                          }
                        
                        

//                 }
                

//         }
        
// }


// public static void main(String[] args) {
//         int arr[]={1,4,5,8,9};
//         int key=8;
//         for(int i=0;i<arr.length;i++){
//                  if(arr[i]==key){
//                         System.out.println(i);
//                  }
//         }
        

// }


// public static void main(String[] args) {
         
//         Scanner sc= new Scanner(System.in);
//         int m=sc.nextInt();
//         int arr[]=new int[m];
//         for(int i=0;i<m;i++){
//                 arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<m;i++){
//                 System.out.print(arr[i]+" "); 
//         }
//         System.out.println();
// }


// public static void main(String[] args) {
//         String str="npr1pn";
//         boolean varl=false;
//         // System.out.println(str.charAt(1));
//         int n=str.length();
//         for(int i=0;i<str.length()/2;i++){
//                  if(str.charAt(i)!=str.charAt(n-1-i)){
//                                 // System.out.println("this is not palindrome");
//                                 varl=true;
//                         }
                               

                
//         }
//         if (varl==true)
//         {
//                 System.out.println("it is not palimdrom");

//         }
//         else{
//                 System.out.println("it is palimdrome");
//         }
// }



// public static void main(String[] args) {
//         String str="WNEENESENNN";
//         int x=0;
//         int y=0;
//         for(int i=0;i<str.length();i++){
//                 char dir=str.charAt(i);
//                 //west
//                 if(dir=='W'){
//                         x--;

//                 }else if(dir=='E'){
//                         x++;
//                 }else if(dir=='N'){
//                         y++;
//                 }else{
//                         y--;
//                 }



//         }
//         int x2=x*x;
//         int y2=y*y;
//         float root=(float)Math.sqrt(x2 + y2);
//         System.out.println(root);
// }


// public static void main(String[] args) {
//         String str ="hello";
//         Scanner sc=new Scanner(System.in);
//         int x=sc.nextInt();
//         int y=sc.nextInt();
//         for(int i=x;i<=y;i++){
//                 System.out.print(str.charAt(x));
//                 x++;
//         }

// }

// public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6,7,8};
//         System.out.println(arr.length);
//         for(int i=2;i<arr.length;i++){
//                 System.out.print(i);
//         }
// }


// public static void main(String[] args) {
//         // Scanner sc=new Scanner(System.in);
//         int number=-123450;
//         int reverse=0;
//         while ((number != 0)){
//                 int digit =number%10;
//                 reverse=reverse*10+digit;
//                 number /=10;
//                 System.out.println(digit);
//                 System.out.println(number);
                
//         }
//         System.out.print(reverse);
        
// }



// public static void main(String [] args){
//         Scanner sc= new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();
//         switch(c){
//             case 1:
//             System.out.println(a+b);
//             break;

//             case 2:
//             System.out.println(a-b);
//             break;

//             case 3:
//             System.out.println(a*b);
//             break;

//             case 4:
//             System.out.println(a/b);
//             break;
//         }
//         // System.out.println("it is invalid");
         
//         }


public static void main(String[] args) {
        int arr[]={1,2,3,4};
        for(int i=arr.length-1;i>=0;i--){
                System.out.print(arr[i]);
        }
}



}










      












