package Practice;

public class Factorial {
    public static int fact(int n){
    if(n==1|| n==0){
        return n;
    }

    int fa=n*fact(n-1);
    return fa;



}



    public static void main(String[] args) {
      System.out.println(fact(5));
    }
}
