import java.util.*;
class DescendingNumber
{
     public static void main(String args[])
     {
         int temp;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter First Number::");
         int n1=sc.nextInt();
         System.out.print("Enter Second Number::");
         int n2=sc.nextInt();
         System.out.print("Enter Third Number::");
         int n3=sc.nextInt();
         if(n1<n2)
         {
              temp=n1;
              n1=n2;
              n2=temp;
         } 
         if(n3>n2)
         {   
              if(n3>n1){
              temp=n2;
              n2=n3;
              n3=temp;
            }
          else
          {
               temp=n3;
               n3=n2;
               n2=temp;
          }
       }
         System.out.print("Value of variables in descendig order:: " +n1+" "+n2+ " "+n3+" ");
     }
}