/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class doublyLinkedList
{
    Node head;
    public void insertAtBeginning(int data)
    {
        Node newNode = new Node(data);
        newNode.previous=null;
        newNode.next=head;
        head.previous=newNode;
        head=newNode;
    }
    public void insertAtLast(int data)
    {
        Node newNode=new Node(data);
        newNode.next=null;
        Node n=head;
        if(n==null)
        {
            head=newNode;
        }
        else
        {
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=newNode;
            newNode.previous=n;
        }
    }
    public void insertAtPos()
    {
        
    }
    public void forwardTraverse()
    {
        Node n=head;
        while(n!=null)
        {
            System.out.print(n.data+" -> ");
            n=n.next;
        }
        System.out.println();
    }
    public void backwardTraverse()
    {
        Node n=head;
        while(n.next!=null)
        {
            n=n.next;
        }
        while(n!=null)
        {
            System.out.print(n.data+" -> ");
            n=n.previous;
        }
        System.out.println();
    }
}
class Node{
    
    int data;
    Node next;
    Node previous;
    
    public Node(int data)
    {
       this.data=data;
       this.next=null;
       this.previous=null;
    }
    
}
public class Main
{
	public static void main(String[] args) {
	  
	  doublyLinkedList l1= new doublyLinkedList();
	  l1.insertAtLast(1);
	  l1.insertAtBeginning(0);
	  l1.insertAtLast(2);
	  l1.insertAtBeginning(-1);
	  l1.insertAtLast(3);
	  l1.insertAtBeginning(-2);
	  l1.insertAtLast(4);
	  l1.insertAtBeginning(-3);
	  l1.insertAtLast(5);
	  l1.insertAtBeginning(-4);
	  l1.insertAtLast(6);
	  l1.insertAtLast(7);
	  l1.insertAtBeginning(-5);
	  l1.insertAtLast(8);
	  l1.insertAtLast(9);
	  l1.insertAtLast(10);
	  l1.insertAtBeginning(-6);
      l1.forwardTraverse();
      l1.backwardTraverse();
	}
}
