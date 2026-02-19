package Practice;

public class PossiblePerfectNumber {
public static void  perfectNumber(int num){

    int number=num;
    for(int j=1;j<number;j++){
    int count =0;
    for(int i=1;i<j;i++){
    if(j%i==0){
        count+=i;
    }
    }

   if(j==count){
        System.out.println(j);
    } 

}

     





}
    public static void main(String[] args) {
        int num=100;
        perfectNumber(num);
        
    }



}
