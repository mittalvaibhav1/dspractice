/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class Node 
{
    int data;
    Node leftChild;
    Node rightChild;
    
    public Node(int data)
    {
        this.data=data;
    }
}
class Tree 
{
    Node root;
    
    public void printInorder(Node root)
    {
        if(root==null)
        return;
        
        printInorder(root.leftChild);
        System.out.print(root.data+" ");
        printInorder(root.rightChild);
    }
    
    public void printLevelOrder(Node root)
    {
        if(root==null)
        return;
        
        ArrayDeque<Node> q = new ArrayDeque<>();
        
        q.add(root);
        
        while(q.size()!=0)
        {
           Node n = q.poll();
           System.out.print(n.data+" ");
           if(n.leftChild!=null)
               q.add(n.leftChild);
           if(n.rightChild!=null)
              q.add(n.rightChild);
        }
    }
    public void printTopView(Node root)
    {
       if(root==null)
        return;
        
        TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();
        fillMap(root,map,0,0);
        
        for(Map.Entry<Integer,ArrayList<Integer>> entry : map.entrySet())
        {
            ArrayList<Integer> al= entry.getValue();
            System.out.print(al.get(0)+" ");
        } 
    }
    public void printVerticalOrder(Node root)
    {
        if(root==null)
        return;
        
        TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();
        buildMap(root,map,0);
        
        for(Map.Entry<Integer,ArrayList<Integer>> entry : map.entrySet())
        {
            ArrayList<Integer> al= entry.getValue();
            for(int i:al)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
    public void fillMap(Node root,TreeMap<Integer,ArrayList<Integer>> map,int hd,int level)
    {
        if(root==null)
        return;
        
        if(map.containsKey(hd) && map.get(hd).get(1)>level)
        {
            ArrayList<Integer> al = new ArrayList<>();
            al.add(root.data);
            al.add(level);
            map.put(hd,al);
        }
        else if(!map.containsKey(hd))
        {
            ArrayList<Integer> al = new ArrayList<>();
            al.add(root.data);
            al.add(level);
            map.put(hd,al);
        }
        fillMap(root.leftChild,map,hd-1,level+1);
        fillMap(root.rightChild,map,hd+1,level+1);
    }
    
    public void buildMap(Node root,TreeMap<Integer,ArrayList<Integer>> map,int hd)
    {
        if(root==null)
        return;
        
        if(map.containsKey(hd))
        {
            ArrayList<Integer> al = map.get(hd);
            al.add(root.data);
            map.put(hd,al);
        }
        else
        {
            ArrayList<Integer> al = new ArrayList<>();
            al.add(root.data);
            map.put(hd,al);
        }
        buildMap(root.leftChild,map,hd-1);
        buildMap(root.rightChild,map,hd+1);
    }
    
}
public class Main
{
	public static void main(String[] args) {
		
		Tree t1 = new Tree();
		
		Node root = new Node(1); 
        root.leftChild = new Node(2); 
        root.rightChild = new Node(3); 
        root.leftChild.leftChild = new Node(4); 
        root.leftChild.rightChild = new Node(5); 
        root.rightChild.leftChild = new Node(6); 
        root.rightChild.rightChild = new Node(7); 
        root.rightChild.leftChild.rightChild = new Node(8); 
        root.rightChild.rightChild.rightChild = new Node(9);
        
        t1.printLevelOrder(root);
        System.out.println();
        t1.printTopView(root);
	}
}
