public class Stack {
    

    // int arr[];
    // int top;
    // int capacity;

    // Stack(int size){
    //     arr=new int[size];
    //     capacity=size;
    //     top=-1;

    // }

    // //push

    // void push(int data){
    //     if(top==capacity-1){
    //         System.out.println("stack is full");
    //         return;
    //     }
    //     arr[++top]=data;
    // }

    // //pop
    // int pop(){
    //     if(top==-1){
    //         System.out.println("stack underflow");
    //     }
    //     return arr[top--];
    // }

    // //peak
    //  int peek() {
    //     if (top == -1) {
    //         System.out.println("Stack is Empty!");
    //         return -1;
    //     }
    //     return arr[top];
    // }

    //   boolean isEmpty() {
    //     return top == -1;
    // }

    // public static void main(String[] args) {
    //     Stack st=new Stack(5);
    //     st.push(10);
    //     st.push(20);
    //     st.push(30);
    //     st.push(40);

    //    // System.out.println(st.pop());
    //     System.out.println(st.peek());
    // }


    int arr[];
    int top;
    int capacity;


    Stack(int size){
        arr=new int[size];
        capacity=size;
        top=-1;
    }

    //push

    void push(int data){
        if(top==capacity-1){
            System.out.println("Stack is full");
            return;
        }

        arr[++top]=data;
    }

    //pop
    int pop(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        return arr[top--];
    }

    int peak(){
        if(top==-1){
            System.out.println("stack is empty");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty(){ 
        return top== -1;

    }

    public static void main(String[] args) {
        
        Stack st=new Stack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st.pop());
        System.out.println(st.peak());
    }
}
