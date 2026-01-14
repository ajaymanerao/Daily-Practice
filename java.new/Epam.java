import java.util.*;
public class Epam {
    
    public static void ReverseString(String str){
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }

    }


    public static void Palindrome(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }

        if( str.equals(rev)){
            System.out.println("It is Palindrome");
        }else{
            System.out.println("it is not palindrome");
        }
    }


    public static int  Fact(int a){
        if(a==0){
            return 1;
        }
        int fact1=a*Fact(a-1); 
        return fact1;
    }

    public static int Sum(int a){
        if(a==1){
             return 1;
        }

        int sum1= a+Sum(a-1);
        return sum1;
    }


    public static int Fib(int a){
        if(a==0 ||a==1){
            return a;
        }
        int fib1=Fib(a-1);
        int fib2=Fib(a-2);
        int fn=fib1+fib2;
        return fn;

    }


    public static void Largestele(int arr[]){
         int max=arr[0];
         

         for(int i=1; i<arr.length;i++){
            if(arr[i]>max){
              max=arr[i];
            }
         }

         System.out.println(max);

    }

    public static void Smallestele(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }


        }
        System.out.println(min);
    }

    public static void Primenumber(int n){
        int count =0;
         for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }

        }

        if(count==2 || n==1){
            System.out.println("it is the prime number");
        }else{
            System.out.println("it is not the prime number");
        }
    }


    public static void  PrimeNumber(int n){
       
        for(int i=1;i<=n;i++){
            int count=0;
             
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;

                }
            }
              if(count==2 || n==1){
            System.out.println(i);
        } 


        }
    }

    public static void AremstrongNumber(int n){
        int temp=n;
        int sum=0;
        while ((n>0)) {
            int d=n%10;
            sum +=d*d*d;
            n/=10;   
        }

        if(sum==temp){
            System.out.println("it is Aremstrong Number");
        }
    }

    public static void duplicate(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate "+arr[i]);
                }
            }
        }
    }


    public static void Removeduplicate(int arr[]){
        Set<Integer> set=new HashSet<>();
        for(int num :arr){
            set.add(num);
        }
        System.out.println(set);

    }


    public static void CountVowels(String str){
        str=str.toLowerCase();
        int count=0;
        String st="aeiou";
        for(int i=0;i<str.length();i++){
            for(int j=0;j<st.length();j++){
                if(str.charAt(i)==(st.charAt(j)) ){
                    count++;
                }

            }
             
        }
        System.out.println(count);
    }

    public static void CharacterFreq(String str){
    for(int i = 0; i < str.length(); i++){
        int count = 0;
        boolean visited = false;

        // Check if this character is already counted before
        for(int k = 0; k < i; k++){
            if(str.charAt(i) == str.charAt(k)){
                visited = true;
                break;
            }
        }

        if(visited) continue; // skip repeated characters

        // Count occurrences
        for(int j = 0; j < str.length(); j++){
            if(str.charAt(i) == str.charAt(j)){
                count++;
            }
        }

        // Print correctly
        System.out.println(str.charAt(i) + " = " + count);
    }
}


    public static void ReverseLL(int arr[]){
        LinkedList<Integer>list=new LinkedList<>();
        for(int num:arr){
            list.add(num);
        }

        Collections.reverse(list);
        System.out.println(list);
    }

   //two list are equal
    public static void CompareList(int arr1[], int arr2[]){
        ArrayList<Integer> l1=new ArrayList<>();
        for(int num1:arr1){
            l1.add(num1);
        }
        ArrayList<Integer> l2=new ArrayList<>();
        for(int num2:arr2){
            l2.add(num2);
        }

        System.out.println(l1.equals(l2));
    }


    public static void Intersection(int arr1[], int arr2[]){
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        for(int sum1:arr1){
            l1.add(sum1);
        }
        for(int sum2:arr2){
            l2.add(sum2);
        }

        l1.retainAll(l2);
        System.out.println(l1);
    }

    public static void Union(int arr1[], int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        for(int num1: arr1){
            set.add(num1);
        }
        for(int num2:arr2){
            set.add(num2);
        }

        System.out.println(set);
    }

    public static void ArraytoList(String arr[]){
        ArrayList<String>list=new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);

    }

    public static void main(String[] args) {
       //String str="Anerao";
       // ReverseString(str);
       //String str="madam";
       //Palindrome(str);
       //int a=10;
       //System.out.println(Fact(a));
       //System.out.println(Sum(a));
       //System.out.println(Fib(a));

       //int arr[]={5,8,9,14,21,6};
       //Largestele(arr);
       //Smallestele(arr);
       // Primenumber(1);
       //PrimeNumber(100);
       //AremstrongNumber(153);

       //int arr[]={10,20,10,15,80,20,60,15};
      // duplicate(arr);
        // Removeduplicate(arr);
       //CountVowels("AjayAnerao");
      // String str="aaabbcc";
       //CharacterFreq(str);

      //int arr1[]={4,5,6,7,8,9};
      // ReverseLL(arr);
      //int arr2[]={4,5,6,7,9};
     // CompareList(arr1, arr2);
      //Intersection(arr1, arr2);

      int arr1[]={1,2,3};
      int arr2[]={3,4,5};
     // Union(arr1, arr2);
      String arr[]={"1", "2","3"};
      ArraytoList(arr);



    

    }
}
