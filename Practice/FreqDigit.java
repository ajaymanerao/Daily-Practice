package Practice;

public class FreqDigit {
    public static void freqDigit(int num){
    int original=num;
    int a=num;
    while(original!=0){
        int count=1;
        int d= original%10;
        int b =original/10;
           
        while(b!=0){
        int c=b%10;
        if(d==c){
            count++;
        }
        b =b/10;

        }
        System.out.println(d+" : "+count);
        int newNum=0;
        int temp =original/10;

        while(temp!=0){
            if(temp%10 !=d){
                int r=temp%10;
                newNum =newNum*10+r;
            }
            temp /=10;
        }
          
        original =newNum;



        
    }
    }


    public static void main(String[] args) {
        int num =100;
        freqDigit(num);
    }
    
}
