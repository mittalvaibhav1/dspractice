/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

class Sort
{
    int arr[];
    Scanner sc =new Scanner(System.in);
    
    public int scan()
    {
        System.out.print(" Enter the Size Of the Array: ");
        arr = new int[sc.nextInt()];
        System.out.print("\nEnter the elements of the Array:  ");
        for(int i=0;i<arr.length;arr[i++]=sc.nextInt());
        
        return arr.length;
    }
    
    public void QuickSort(int arr[],int start,int end)
    {
        if(start<end)
        {
            int pivot = arr[end];
            int i=start,j;
            
            for(j=start;j<end;j++)
            {
              if(arr[j]<=pivot)
              {
                  int tmp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=tmp;
                  i++;
              }
            }
            
            arr[end]=arr[i];
            arr[i]=pivot;
            
		System.out.println();
        
            QuickSort(arr,start,i-1);
            QuickSort(arr,i+1,end);
        }
        else
        {
            return;
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		
		Sort sort = new Sort();
		sort.scan();
		sort.QuickSort(sort.arr,0,sort.arr.length-1);
		
		for(int i:sort.arr)
		{
		    System.out.print(i+" ");
		}
	}
}
