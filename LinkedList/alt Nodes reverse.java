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
       int i=0;
       while(n!=null)
       {
           i++;
           System.out.print(n.data+" -> ");
           n=n.next;
       }
       
    }
     Node revAltKNodes (Node head, int K)
     {
        if(K==1 || head==null)
        {
          return head;
        }
        Node n=head;
        int count=0,i;
        boolean reverse=true;
        while(n!=null)
        {
          n=n.next;
          count++;
        }
        n=head;
        Node head2=null;
        Node next,previous=null,link=head,link1=null;
        for(i=1;i<=count;i++)
        {
             
          next=n.next;
          if(reverse==true)
          {
              n.next=previous;
            System.out.println(n.data);
          }
          previous=n;
          if(i%K==0)
          {
            if(reverse==true)
            {
              reverse=false;
              link.next=next;
              if(link1!=null)
              link1.next=n;
            }
            else
            {
              reverse=true;
              previous=null;
            }
          }
          if(reverse==false && head2==null)
          {
            head2=n;
          }
          if(reverse==true && i%K==0)
          {
            link1=n;
            if(n!=null)
            {
                link=n.next;
            }
          }
          n=next;
        }
        return head2;
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
	    l1.insertAtEnd(1);
	    l1.insertAtEnd(2);
	    l1.insertAtEnd(3);
	    l1.insertAtEnd(4);
	    l1.insertAtEnd(5);
	    l1.insertAtEnd(6);
	    l1.insertAtEnd(7);
	    l1.insertAtEnd(8);
	    l1.insertAtEnd(9);
	    l1.insertAtEnd(10);
	    l1.insertAtEnd(11);
	    l1.insertAtEnd(12);
	    l1.insertAtEnd(13);
	    l1.insertAtEnd(14);
	    l1.insertAtEnd(15);
	    l1.insertAtEnd(16);
	    l1.insertAtEnd(17);
	    l1.insertAtEnd(18);
	    l1.insertAtEnd(19);
	    //l1.insertAtEnd(20);
	    l1.traverse();
	    System.out.println();
	   // LinkedList l2=new LinkedList();
	   // l2.insertAtStart(11);
	   // l2.insertAtStart(01);
	   // l2.insertAtEnd(21);
	   // l2.insertAtEnd(31);
	   // l2.insertAtEnd(41);
	   // l2.insertAtStart(-11);
	   // l2.traverse();
	   // System.out.println();
	   
	   LinkedList l3=new LinkedList();
	   l3.head=l3.revAltKNodes(l1.head,4);
	   l3.traverse();
	}
}
