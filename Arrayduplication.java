import java.util.*;
class Arrayduplication
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter size of en array::");
        int n=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<=arr.length-1;i++)
        {
	    arr[i]=sc.nextInt();
	}
         Arrays.sort(arr);
        System.out.println("Sorted elements");
       for(int i=0;i<arr.length-1;i++)
        {
	   System.out.println(arr[i]);
	}
         System.out.println(arr[n-1]+ "  ");
	 System.out.println("Array Elements");
         System.out.println("**************");
         Duplicate d1=new Duplicate();
         d1.remove_duplication(arr,n);
        System.out.println(arr[n-1]+ "  ");
     }
     
    
}
class Duplicate 
{
     public void remove_duplication(int arr[],int n)
     {

        for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i]!=arr[i+1])
		{ 
                      System.out.println(arr[i]);
		}
         
        }
     }
}
