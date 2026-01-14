import java.util.*;
public class Practice {
    public static void main(String[] args) {
    //       int arr[]={1,2,3,4,5};
    //       for(int i=arr.length; i>0; i--){
    //        System.out.println(arr[i-1]);
    // }
        

    // int arr[]= {10, 50, 30, 70, 20};

    // for(int i=0;i<arr.length-1;i++){
    //     if(arr[i]>arr[i+1]){
    //     int temp=arr[i];
    //     arr[i+1]=arr[i];
    //     arr[i+1]=temp;
    //     }

    // }
    // System.out.print(arr[arr.length-1]);



    // String str="markram";
    //  String reverse="";

    //  for(int i=str.length()-1; i>=0; i--){
    //     reverse=reverse+str.charAt(i);
    //  }

    //  if(str.equals(reverse)){
    //     System.out.println("String is palindrome");
    //  }else{
    //     System.out.println("String is not palindrome");
    //  }

    // }

    // String str="markram";
    // boolean ispalindrome=true;
    // for(int i=0;i<str.length()/2; i++){
    //     if(str.charAt(i) != str.charAt(str.length()-1-i)){
    //         ispalindrome=false;
    //         break;
    //     }
        
    // }

    // if(ispalindrome){
    //     System.out.print("It is palindrome");

    // }else{
    //     System.out.print("It is not  palindrome");
    // }
   

    // String str="markram";
    // String reverse="";

    // for(int i=0;i<=str.length()-1; i++){
    //     reverse=reverse+str.charAt(i);
    // }
    // if(str.equals(reverse)){
    //     System.out.println("It is palindrome");
    // }else{
    //     System.out.print("It is not palindrome");
    // }


    // String str="markram";
    // boolean isPalendrome= true;

    // for(int i=0; i<=str.length()/2;i++){
    //     if(str.charAt(i) !=str.charAt(str.length()-1-i)){
    //         isPalendrome=false;
    //         break;


    //     }
    // }


    // int num=101;
    // int original=num;
    // int reverse=0;

    // while(num !=0){
    //     int digit= num%10;
    //     reverse=reverse*10+digit;
    //     num= num/10;
    // }

    // if(original==reverse){
    //     System.out.println("it is palindrome");
    // }else{
    //     System.out.print("It is not palindrome");
    // }


    // Scanner sc= new Scanner(System.in);
    // int num=sc.nextInt();
    // int original =num;
    // int reverse=0;

    // while(num != 0){
    //     int digit = num%10;
    //     reverse= reverse*10+digit;
    //     num=num/10;

    // }
    // if(original==reverse){
    // System.out.println("it is a palindrome");
    // }

//     int arr[]={10,50,70,80,20};
//     for(int j=0;j<arr.length-1;j++){
//     for(int i=0; i<arr.length-1-j;i++){
//         if(arr[i]>arr[i+1]){
//             int temp =arr[i];
//             arr[i]=arr[i+1];
//             arr[i+1]=temp;
             
//         }
//     }
//     }
//     for(int num:arr){
// System.out.println(num+" ");
//     }
     


// int num=101;
// int original =num;
// int reverse=0;

// while (num != 0) {
//     int digit= num%10;
//     reverse=reverse*10+digit;
//     num= num/10;

    
// }
// if(original==reverse){
//     System.out.println("It is Palindrome");
// }else{
//      System.out.println("It is not Palindrome");
// }



// String str="Madam";
// String a=str.toUpperCase();
// String reverse="";

// for(int i=str.length()-1; i>=0; i--){
//    reverse=reverse+a.charAt(i);
// }
// if(a.equals(reverse)){
//     System.out.println("it is a palindrome");
// }else{
//      System.out.println("It is  not Palindrome");
// }


// int arr[]={10,20,30,40,50};
// for(int i=arr.length-1; i>=0;i--){
//     System.out.println(arr[i]);
// }


// int arr[]={10,80,60,40,90,20};
// for(int i=0; i<arr.length-1;i++){
//     if(arr[i]>arr[i+1]){
//         int temp=arr[i];
//         arr[i]=arr[i+1];
//         arr[i+1]=temp;
//     }
   
  
// }
// System.out.println(arr[arr.length-1]);


// Scanner sc=new Scanner(System.in);
// int a=sc.nextInt();
// int b=sc.nextInt();
// int c=sc.nextInt();

// switch (c) {
//     case 1:
//     System.out.println(a+b);
//     break;

//     case 2:
//     System.out.println(a-b);
//     break;

//     case 3:
//     System.out.println(a*b);
//     break;

//     case 4:
//     System.out.println(a/b);
//     break;

//     default:
//     System.out.println("Invalid case");
//      break;
// }

// int arr[]={10,20,20,30,10,40,30};
// int n=arr.length;

// int temp[]=new int[n];
// int index=0;

// for(int i=0;i<n;i++){
//     boolean isDuplicate=false;

//     for(int j=0;j<index;j++){
//         if(arr[i]==temp[j]){
//              isDuplicate = true;
//             break;

//         }
//     }
//      if (!isDuplicate) {
//         temp[index] = arr[i];
//         index++;
//     }
// }

// System.out.print("Array after removing duplicates: ");
//         for (int i = 0; i < index; i++) {
//             System.out.print(temp[i] + " ");
//         }


// int arr[]={10,20,20,30,10,40,30};
// int n=arr.length;
// int arr1[]=new int[n];
// int index=0;
// for(int i=0;i<n;i++){
//     boolean isDuplicate= false;
//     for(int j=0;j<index;j++){
//         if(arr[i]==arr1[j]){
//             isDuplicate=true;
//             break;
//         }
//     }
//         if(!isDuplicate){
//             arr1[index]=arr[i];
//             index++;
//         } 
// }
// System.out.println("duplicate is removed");
// for(int i=0;i<index;i++){
//     System.out.println(arr1[i]+" ");
// }





}

}