package Practice;

public class ArmstrongNumberInBetween {
public static void amstrongNumber(int num){
for(int i=1;i<=num;i++){
int original=i;
int number=i;
int digit=0;
while(number!=0){
    digit++;
    number /=10;
}


int sum=0;
number=original; 
while(number!=0){
    int d=number%10;
    sum +=Math.pow(d, digit);
    number =number/10;
}

if(sum==original){
    System.out.println(original);
}

}
}



    public static void main(String[] args) {
        int num=200;
        amstrongNumber(num);

    }
    
}
