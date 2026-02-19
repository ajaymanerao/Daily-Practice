package Practice;

public class AmstrongNumber {
public static void amstrongNumber(int num){
    int number=num;
    int count =0;
    while(number!=0){
    int d=number%10;
    count++;
    number/=10;
    }

    int sum=0;
    number=num;
    int original=num;
    while(number!=0){
        int d=number%10;
        sum+=Math.pow(d, count);
        number /=10;
    }

     if(original==sum){
        System.out.println("It is a Amstrong Number");
     }else{
        System.out.println("it is not a Amstrong number");
     }
}


    public static void main(String[] args) {
        int num=153;
        amstrongNumber(num);
        
    }
    
}
