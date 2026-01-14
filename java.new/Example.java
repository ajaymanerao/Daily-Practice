public class Example {


public static void Largestelement(int arr[]){
    int max=arr[0];
    for(int num: arr){
        if(num>max){
            max=num;
        } 
    }
    System.out.println(max);

}


public static void smallestElement(int arr[]){
  int min=arr[0];
  for(int i=1;i<arr.length;i++){
    if(min>arr[i]){

      min=arr[i];
    }

  }
  System.out.println(min);
} 



public static void secondLargest(int arr[]){

  int n=arr.length;
  int temp;
  for(int i=0;i<n;i++){
    for(int j=i+1; j<n;j++){
      if(arr[i]>arr[j]){
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;


      }
    }
}
//  int secondelement=arr[arr.length-2];
//    System.out.println(secondelement);
System.out.println(arr[5-2]);
}

public static void decreasingOrder(int arr[]){
  int n= arr.length;
  int temp;
  for(int i=0; i<n; i++){
    for(int j=i+1;j<n;j++){
      if(arr[i]<arr[j]){
         temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
      }
    }
  }
  for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");

  }
}


public static void reverseArray(int arr[]){
  int n= arr.length;
  for(int i=n-1;i>=0;i--){
    System.out.print(arr[i]+" ");
  }
}


public static void sumofArray(int arr[]){
  int n=arr.length;
  int sum=0;
  for(int i=0; i<n;i++){
   sum =sum+arr[1];
  }
  System.out.println(sum);
}

public static void Missingnumber(int arr[]){
int n=5;
int total=n*(n+1)/2;
int sum=0;
for(int i=0; i<arr.length;i++){
  sum=sum+arr[i];
}
System.out.println(total-sum);
}

public static void removeduplicate(int arr[]){
  int n=arr.length;
  for(int i=0;i<n;i++){
    boolean isduplicate=false;
    for(int j=0;j<i;j++){
      if(arr[i]== arr[j]){
        //System.out.print(arr[j]);
        isduplicate=true;
        break;
      }
    }
    if(!isduplicate){
      System.out.print(arr[i]+" ");
    }
  }
}


public static void frequencyNumber(int arr[]){
int n=arr.length;
int repeat=0;
for(int i=0; i<arr.length; i++){
  boolean counted = false;
  for(int j=0; j<n;j++){
    if(arr[i]==arr[j]){
     counted = true;
       break;
    }
  } 
    if (!counted) {
                int count = 1;
                for (int k = i + 1; k < arr.length; k++) {
                    if (arr[k] == arr[i]) count++;
                }
                System.out.println(arr[i] + " = " + count);
            }

}
 
 
} 

public static void reverseString(String str){
for(int i=str.length()-1;i>=0;i--){
  System.out.print(str.charAt(i));
}

}



public static void Palindrome(String str){
   String rev1="";
   String rev2="";
  for(int i=0;i<str.length();i++){
   rev1+=str.charAt(i);
  }
   for(int j=str.length()-1;j>=0;j--){
    rev2+=str.charAt(j);
   }

   if(rev1.equals(rev2)){
    System.out.println("This String is palindrome");
   }else{
    System.out.println("this is not palindrome ");
   }
   
}

public static void countVowels(String str){
 String v="aeiou";
 int  owels=0;
 int consonants=0;

  for(int i=0;i<str.length();i++){
     boolean isVowel = false;
for(int j=0;j<v.length();j++){
  if(str.charAt(i)==v.charAt(j)){
    owels++;
    isVowel=true;
    break;
  } 

  }
  if(!isVowel){
    consonants++;
  }
}
  
  System.out.println("Owels ="+owels);
  System.out.println("consonants ="+consonants);
}


  public static void main(String [] args){
    //int arr[]={10,25,3,40,18};
     //Largestelement(arr);
     //smallestElement(arr);
    // secondLargest(arr);
    // decreasingOrder(arr);
    //reverseArray(arr);
    //sumofArray(arr);
    //int arr[]={1,2,4,5};
    //Missingnumber(arr);
    int[] arr = {1, 2, 2, 3, 4, 4, 5};
   // removeduplicate(arr);
    //frequencyNumber(arr);
    //String str="java";
    //reverseString(str);
    // String str="madam";
    // Palindrome(str);
    String str="hello";
    countVowels(str);

  }  
}
