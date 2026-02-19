package Practice;

public class FibonacciSeries {
public static void fibonacciSeries(int num){
int start=0;
int next=1;
for(;start<=num;){
System.out.println(start+" ");
int sum =start+next;
start=next;
next=sum;
}

}



    public static void main(String[] args) {
        int num=25;
        fibonacciSeries(num);
    }
    
}
