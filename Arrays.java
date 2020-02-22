
/******************************************************************************

 Welcome to GDB Online.
 GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
 C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
 Code, Compile, Run and Debug online from anywhere in world.

 *******************************************************************************/
import java.util.*;
public class Main
{
    static Scanner sc= new Scanner(System.in);
    static int Capacity;
    static int Size;
    static int[] arr;
    public static void main(String[] args) {

        //Array Capacity
        System.out.println("Please Enter the Capacity Of the Array:");
        Capacity=sc.nextInt();

        //Array Size
        System.out.println("Please Enter The Size Of the Array :");
        Size=sc.nextInt();

        //Declaring Array
        arr=new int[Capacity];

        //Scanning elements upto Size
        System.out.println("Please Enter The")
        for(int i=0;i<Size;i++)
        {
            arr[i]=sc.nextInt();
        }
        //Calling Insert Function
        //insert();
        //Calling Traverse Function
        //traverse();
        //Calling remove
        remove();
        //Calling Traverse Function
        traverse();
    }
    //Function to insert an element
    public static void insert()
    {
        System.out.println("Please Enter The Index You Want To Insert The Element At: ");
        int pos=sc.nextInt();
        if(pos>=Size)
        {
            System.out.println("Index Exceeds The Size!");
        }
        else if(Size+1>=Capacity)
        {
            System.out.println("Array Capacity Reached! Cannot Store More Elements");
        }
        else
        {
            System.out.println("Enter The Element You Want To Insert :");
            int element=sc.nextInt();
            Size++;
            for(int i=Size-1;i>pos;i--)
            {
                arr[i]=arr[i-1];
            }
            arr[pos]=element;
        }
    }
    //Function to traverse the array
    public static void traverse()
    {
        for(int i=0;i<Size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    //Function to remove an element
    public static void remove()
    {
        System.out.println("Please Enter The Index You Want To Delete The Element From: ");
        int pos=sc.nextInt();

        if(pos>=Size)
        {
            System.out.println("No element at this index");
        }
        else
        {
            for(int i=pos;i<Size;i++)
            {
                arr[i]=arr[i+1];
            }
            arr[Size-1]=0;
            Size--;
        }
    }
}
