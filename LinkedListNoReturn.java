/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class LinkedList
{
    Node head;
    
    public LinkedList()
    {
     this.head=null;   
    }
    
    void insertAtEnd(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            Node current=head;
            while(current.next!=null)
            {
               current=current.next; 
            }
            current.next=newNode;
        }
    }
    void insertAtStart(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }
    }
    
    void traverse()
    {
       Node n=head;
       while(n!=null)
       {
           System.out.print(n.data+" -> ");
           n=n.next;
       }
       
    }
}
class Node
{
  int data;
  Node next;
  
  public Node(int data)
  {
      this.data=data;
      this.next=null;
  }
  
}
public class Main
{
	public static void main(String[] args) {
	    LinkedList l1=new LinkedList();
	    l1.insertAtStart(1);
	    l1.insertAtStart(0);
	    l1.insertAtEnd(2);
	    l1.insertAtEnd(3);
	    l1.insertAtEnd(4);
	    l1.insertAtStart(-1);
	    l1.traverse();
	    System.out.println();
	    LinkedList l2=new LinkedList();
	    l2.insertAtStart(11);
	    l2.insertAtStart(01);
	    l2.insertAtEnd(21);
	    l2.insertAtEnd(31);
	    l2.insertAtEnd(41);
	    l2.insertAtStart(-11);
	    l2.traverse();
	    System.out.println();
	    l1.traverse();
	}
}
