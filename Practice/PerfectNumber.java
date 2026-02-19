package Practice;
public class PerfectNumber {
public static void  perfectNumber(int num){

    int number=num;
    int count =0;
    for(int i=1;i<number;i++){
    if(number%i==0){
        count+=i;
    }
    }

    if(number==count){
        System.out.println("It is perfect Number");
    }else{
        System.out.println("It i not perfectNumber");
    }






}
    public static void main(String[] args) {
        int num=8;
        perfectNumber(num);
        
    }
    
}
