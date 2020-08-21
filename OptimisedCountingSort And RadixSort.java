/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

class SortingTechniques
{
    public void CountingSort(int[] arr)    //Normalized CountingSort
    {
        int maxVal = arr[0];
        int minVal = arr[0];
        for(int i=0;i<arr.length;i++)
        {
             if(arr[i]>maxVal)
               maxVal=arr[i]; 
               
             if(arr[i]<minVal)
                 minVal=arr[i];
        }
        if(minVal<0)
            for(int i=0;i<arr.length;i++)
                arr[i]=arr[i]+(minVal*-1);
        else
            minVal=0;
        
        int[] countArr = new int[maxVal+1+(minVal*-1)];
        
        for(int i=0;i<arr.length;i++)
            countArr[arr[i]]++;
        
        for(int i=1;i<countArr.length;i++)
            countArr[i]+=countArr[i-1];
            
        int[] resultArr = new int[arr.length];
        
        for(int i=arr.length-1;i>=0;i--)
            resultArr[--countArr[arr[i]]]=arr[i]+minVal;
            
        printArray(resultArr);
    }
    public void RadixSort(int[] arr)
    {
        int maxVal=arr[0];
        
        for(int i=0;i<arr.length;i++)
            if(arr[i]>maxVal)
               maxVal=arr[i];
        
        for(int pos=1;maxVal/pos>0;pos*=10)
        {
            radixCountSort(arr,pos);
        }
        printArray(arr);
    }
    public void radixCountSort(int[] arr, int pos)
    {
        int[] countArr = new int[10];
        int[] resultArr = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            countArr[(arr[i]/pos)%10]++;
        }
        for(int i=1;i<countArr.length;i++)
        {
            countArr[i]=countArr[i]+countArr[i-1];
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            resultArr[--countArr[(arr[i]/pos)%10]]=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=resultArr[i];
        }
    }
    
    public void printArray(int[] arr)
    {
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
public class Main
{
	public static void main(String[] args) {
		
		int[] arr = {55,134,763,462,2431,26,34,4,5,992,1};
		
		SortingTechniques sort = new SortingTechniques();
		
		sort.RadixSort(arr);
		
	}
}
