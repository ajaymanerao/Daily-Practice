package Practice;

public class StrongNumber {
public  static void strongNumber(int num){
int original =num;
int a=num;
int sum=0;
while(original!=0){
int d=original%10;
int mul=1;
   for(int i=d;i>=1;i--){
   mul *=i;
   }
   sum+=mul;
   original=original/10;
}

if(sum==a){
    System.out.println("It is a Strong number");
}else{
    System.out.println("It not a  Strong number");
}

}


    public static void main(String[] args) {
        int num=123;
        strongNumber(num);
    }
    
}
