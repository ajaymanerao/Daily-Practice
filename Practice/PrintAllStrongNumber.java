package Practice;

public class PrintAllStrongNumber {
public  static void strongNumber(int num){
for(int j=1;j<=num;j++){
int original =j;
int sum=0;

while(original!=0){
int d=original%10;
int mul=1;
   for(int i=d;i>=1;i--){
   mul *=i;
   }
   sum+=mul;
   original = original / 10;
}
   if(sum==j){
    System.out.println(j);

}

 
}
}


    public static void main(String[] args) {
        int num=100;
        strongNumber(num);
    }
    
}
























 
