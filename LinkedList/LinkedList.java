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
    
    LinkedList insertAtEnd(LinkedList l,int data)
    {
        Node newNode=new Node(data);
        if(l.head==null)
        {
            l.head=newNode;
        }
        else
        {
            Node current=l.head;
            while(current.next!=null)
            {
               current=current.next; 
            }
            current.next=newNode;
        }
        return l;
    }
    LinkedList insertAtStart(LinkedList l,int data)
    {
        Node newNode=new Node(data);
        if(l.head==null)
        {
            l.head=newNode;
        }
        else
        {
            newNode.next=l.head;
            l.head=newNode;
        }
        return l;
    }
    
    LinkedList traverse(LinkedList l)
    {
       Node n=l.head;
       while(n!=null)
       {
           System.out.print(n.data+" -> ");
           n=n.next;
       }
       
       return l;
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
	    l1=l1.insertAtStart(l1,1);
	    l1=l1.insertAtStart(l1,0);
	    l1=l1.insertAtEnd(l1,2);
	    l1=l1.insertAtEnd(l1,3);
	    l1=l1.insertAtEnd(l1,4);
	    l1=l1.insertAtStart(l1,-1);
	    l1.traverse(l1);
	}
}
