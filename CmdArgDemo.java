class CmdArgDemo
{ 
       public static void main(String args[])
       {
             
                   String a[]={"FIRST","SECOND","THIRED","FOURTH","FIFTH","SISTH","SEVENTH","EIGHTH","NINETH","Tenth","ELEVENTH","TWELVETH","THIRTEENTH","FOUREENTH","FIFTEENTH","SISTEENTH","SEVENTEENTH","EIGHTEENTH","NINENTEENTH","TWENTYTH"};
                int n=args.length;
                System.out.println("\n\n Number of arguments = "+n+"\n");
                for(int i=0;i<n;i++)
                {
                     System.out.println(" "+(i+1) +": "+ a[i] + " Student name is: " +args[i]+"\n");
                }
                   
          }
}