package CounterPattern;

public class Program6 {
    public static void P1(int N){
        int cnt=N;
        for(int i=N;i>=1;i--){
            int c=cnt;
            
            for(int j=N;j>=i;j-- ){
                System.out.print(c+"\t");
               c=c+j;
            }
            cnt--;
            System.out.println();
        }
    }


    public static void main(String[] args) {
        P1(5);
        
    }
    
}
