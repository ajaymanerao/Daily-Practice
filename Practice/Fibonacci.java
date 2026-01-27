package Practice;

public class Fibonacci {
    public static void progarm2(int start, int second, int size){
        int a=start, b=second, n=size;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int next =a+b;
            a=b;
            b=next;

        }
        
    }


    public static void main(String[] args) {
        int start=0;
        int second=1;
        int size=10;
        progarm2(start, second, size);
    }
    
}
