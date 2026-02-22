package Practice;
public class Triangle {
public static void triangle(int a, int b ,int c){
if((a+b)>c || (b+c)>a || (c+a)>b){

    int s=a+b+c/2;

    int area=(int)Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println(area);
}else{
System.out.println("Triangle does not found");
}



}


    public static void main(String[] args) {
       int a=1;
       int b=2;
       int c=3;
       triangle(a, b, c);
    }
    
}
