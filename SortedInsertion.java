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
    
    void insertSorted(int data)
    {
        Node n=head;
        Node tmp=head;
        Node newNode =new Node(data);
        newNode.next=null;
        if(head==null)
        {
            head=newNode;
        }
        else if(head.data>=newNode.data)
        {
            newNode.next=head;
            head=newNode;
        }
        else
        {
            while(n!=null && n.data<newNode.data)
            {
                tmp=n;
                n=n.next;
            }
            tmp.next=newNode;
            newNode.next=n;
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
	    l1.insertSorted(3);
	    l1.insertSorted(2);
	    l1.insertSorted(1);
	    l1.insertSorted(6);
	    l1.insertSorted(1);
	    l1.insertSorted(7);
	    l1.insertSorted(2);
	    l1.traverse();
	    System.out.println();

	}
}

