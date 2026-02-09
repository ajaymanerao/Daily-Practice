package Practice;
public class PrimeNumber {
public static void primeNumber(int n){
for(int i=1;i<=n;i++){
    int count=0;
    for(int j=1;j<=n;j++){
        if(i%j==0){
            count++;
        }

    }
    System.out.print("Prime Number :-");
    if(count==2){
        System.out.print(i+" ");
    }
    System.out.println();
    System.out.print("Even Number :-");
    if(i%2==0){
        System.out.print(i+" ");
    }
    System.out.println();
    System.out.print("Odd Number :-");
    if(i%2!=0){
        System.out.print(i+" ");
    }
    }
    }

    public static void main(String[] args) {
        primeNumber(100);

    }
    
}
