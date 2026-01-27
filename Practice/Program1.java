package Practice;

public class Program1 {
    public static void progarm1(int num){
        int sum=0;
        System.out.print("Number they are divisible by 3 & 5 : ");
        for(int i=1;i<num;i++){
            if(i%3==0 || i%5==0){
                System.out.print(i+" ");
                sum +=i;
            }
        }
        System.out.println("Total sum of all digit : "+sum);
    }


    public static void main(String[] args) {
        progarm1(1000);
        
    }
    
}
