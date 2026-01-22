import java.io.*;
import java.util.*;
public class Caesar
{ 
    public static StringBuffer encrypt(String text, int k)
    {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) + k - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) + k - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
    public static StringBuffer decrypt(String text, int k)
    {
        StringBuffer result= new StringBuffer();
       

        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) - k - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) - k - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = new String();
        int k;
        
       while(true)
       {
        System.out.println(" 1.Encryption\n\n 2.Decryption \n \n3.Exit ");
        System.out.println("***********************************************");
        System.out.print("Enter Your Choice::");
        int choice=sc.nextInt();
        System.out.print("Enter the String :");
        text = sc.next();
        System.out.println("Enter Shift Key:");
        k = sc.nextInt();
        switch(choice)
        {
            case 1: 
             System.out.println("Text  : " + text);
             System.out.println("Shift : " + k);
             System.out.println("Cipher: " + encrypt(text, k));
               break;
            case 2:
             System.out.println("Text  : " + text);
             System.out.println("Shift : " + k);
             System.out.println("Plain: " + decrypt(text, k));
               break;
            case 3: System.out.println("Invalid choice");
                break;
        }
      
       }
    
   }
 }