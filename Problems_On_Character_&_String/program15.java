// Write a program which accept string from user and display it in reverse order
// input :   Marvellous 
// output :   soullevraM

import java.util.*;

class Alphabate
{
    public void Reverse(String s)
    {   
        char Arr[] = s.toCharArray();

        for(int i = Arr.length-1; i >= 0; i--)
        {
            System.out.print(Arr[i]);
        }
        
    }    
}


class program15
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        System.out.println("Number of character are : "+str.length());
        
        Alphabate obj = new Alphabate();

        obj.Reverse(str);
        
    }    
} 