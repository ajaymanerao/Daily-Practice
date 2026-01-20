import java.util.*;

//Q1 Count the number of digits in any number
public class NumberDigit {

    public static void Question1(int N){
        int num=N;
        int count=0;
        while(num !=0){
            num=num/10;
            count++;
        }
        System.out.println(count);
         
    }

//Q2 Find the first and last digit of any number

    public static void Question2(int N){
        int num=N;
        int firstdigit=num;
        int lastdigit=N%10;
        while(firstdigit>=10){
            firstdigit=firstdigit/10;
        }
        System.out.println("First Digit "+firstdigit);
        System.out.println("Last Digit "+lastdigit);
    }

//Q3 Find the sum of the first and last digit of any number

    public static void Question3(int N){
        int firstDigit=N;
        int lastDigit=N%10;
        while(firstDigit>=10){
            firstDigit=firstDigit/10;
        }
        System.out.println("Sum of First and last digit is "+(firstDigit+lastDigit));
    }

//Q4 Calculate the sum of digits of any number

    public static void Question4(int N){
        int num=N;
        int sum=0;
        while(num>0){
            int a=num%10;
            sum=sum+a;
            num=num/10;
        }
        System.out.println(sum);
    }

//Q5 Calculate the product of digits of any number

    public static void Question5(int N){
      int num=N;
      int product=1;
      while(num>0){
        int a=num%10;
        product=product*a;
        num=num/10;
      }
    System.out.println("Product of the digit is "+product);
    }


//Q6 Reverse a given number
    public static void Question6(int N){
      int num=N;
      while(num>0){
        int a=num%10;
        System.out.print(a);
        num=num/10;
      }
    }

//Q7 Check whether a number is palindrome or not


    public static void Question7(int N){
        int num=N;
        int original=N;
        int reverse=0;
        while(num>0){
            int a=num%10;
            reverse= reverse*10+a;
            num=num/10;
        }

        if(original==reverse){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("It is not palindrome");
        }
    }

//Q9   Find the power of any number using a for loop

     public static void Question9(int M, int N){
        int number=M;
        int newNumber=1;

        for(int i=1;i<=N;i++){
            newNumber=newNumber*number;
        }
        System.out.println(newNumber);
     }

//Q10  Print all factors of a given number


    public static void Question10(int N){
        for(int i=1;i<N;i++){
            if(N%i==0){
                System.out.print(i+", ");
            }
        }
    }

//Q11 Calculate the factorial of a number
     
     public static void Question11(int N){
        int fact=1;
         for(int i=N;i>=1;i--){
            fact=fact*i;
         }
         System.out.println(fact);
     }

//Q 12 Find HCF (GCD) of two numbers

    public static void Question12(int M, int N){
        int hcf=1;
        for(int i=1; i<=M && i<=N;i++){
            if(M%i==0 && N%i==0){
                hcf=i;

            }
        }
        System.out.println(hcf);
    }

//Q13 Find LCM of two numbers

    public static void Question13(int M, int N){
        int hcf=1;
        for(int i=1; i<=M && i<=N;i++){
            if(M%i==0 && N%i==0){
                hcf=i;
            }
        }
        int LCM=(M*N)/hcf;
        System.out.println(LCM);
    }  

     


//Q14 Shift Last Digit to First    

    public static void Question14(int N){
        int num=N;
        int num1=1;
        while(num>0){
            num1=num%10;
            num=num/10;
            break;
        }
        System.out.println(num1+""+num);
    }

    




    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int N= sc.nextInt();
        //Question1(N);
        //Question2(N);
        //Question3(N);
        //Question4(N);
        //Question5(N);
        //Question6(N);
        //Question7(N);
        //int M=sc.nextInt();
        //Question9(N,M);
        //Question10(N);
        //Question11(N);
        //int M=sc.nextInt();
        //Question12(M, N);
        //int M=sc.nextInt();
        //Question13(M, N);
        Question14(N);

    }
    
}
