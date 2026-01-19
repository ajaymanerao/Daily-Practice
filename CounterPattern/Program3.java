package CounterPattern;

public class Program3 {

    public static void P1(int N){
        int num=1;
    
        for(int i=1;i<=N;i++){
            int temp=num+i-1;
            for(int j=1;j<=i;j++){
               System.out.print(temp+"\t");
               temp--;
                 
            }
            num=num+i;
            System.out.println();
        }
    }



    public static void main(String[] args) {
        P1(5);
        
    }
    
}
