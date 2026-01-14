public class LL {

public static class Node{

    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public static Node head;
public static Node tail;

public void addFirst(int data){
    //step1 create new node
Node newNode=new Node(data);

if(head==null){
    head =tail=newNode;
    return;
}

//step 2 newNode next =head
newNode.next=head; //link

//step 3 head = newNode

head =newNode;


}

public void addLast(int data){
    //step 1 create newNose
    Node newNode =new Node(data);

    if(head ==newNode){
        head =tail=newNode;
        return; 

    }

    // step2 tail next 
    tail.next= newNode;

    //step 3 tail =newNode

    tail =newNode;


}


public void addMiddle(int idx,int data){
    Node newNode=new Node(data);
    Node temp=head;
    int i=0;

    while (i<idx-1){
        temp=temp.next;
        i++;
    } 

    newNode.next=temp.next;
    temp.next=newNode;


}


public int removeFirst(){
    int val=head.data;
    head=head.next;
    return val;
}

   public void printList() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }


    public void size(){
        int count =0;
        Node temp=head;
        while(temp != null){
            count ++;
            temp=temp.next;
        }

        System.out.println(count);


    }

    public void reverLL(int data){
        Node temp=head;
        int i=0; 

    }

    public static void main(String[] args) {
        LL ll=new LL();
         ll.addFirst(1);
         ll.addFirst(2);
        ll.addLast(5);
        ll.addMiddle(2, 9);
         ll.printList();
        // ll.removeFirst();
        // ll.printList();
        //  ll.size();
    }
    
}




// Write code to print LinkedList.

// Write code to count nodes in LinkedList.

// Write code to search an element in LinkedList.

// Insert at beginning.

// Insert at end.

// Insert in middle at given index.

// Delete at beginning.

// Delete at end.

// Delete at specific position.

// Delete node by value.
// Reverse a LinkedList (most asked)

// Find middle of LinkedList