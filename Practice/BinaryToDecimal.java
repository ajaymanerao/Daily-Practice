package Practice;

public class BinaryToDecimal {
public static void binaryToDecimal(int num){
int original=num;
int count=0;
while(original !=0){
int d=original %10;
count++;
original=original/10;
}

original=num;
int sum=0;
int paw=0;
while(original!=0 && paw<=count){
int a=original%10;
int b=(int)Math.pow(2, paw);
int mul=a*b;
sum +=mul;
paw++;
original =original/10;

}
System.out.println(sum);



}



    public static void main(String[] args) {
        int num=1000;
        binaryToDecimal(num);
    }
    
}
