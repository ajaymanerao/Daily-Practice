package SelfExample;

class ABC
{
  static int x = 10;

    static int show(){
        x = 20;
        return x;
    }
}
class Test {

    public static void main(String[] args) {
        ABC a=new ABC();
        System.out.println(ABC.show());
    }
}

