// Write a program which accept string from user and display only digits from that string.
// input :  Marve89llous121  
// output :   89121

import java.util.*;

class Alphabate
{
    public void DisplayDigit(String s)
    {   
        char Arr[] = s.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] >= '0') && (Arr[i] <= '9'))
            {
                System.out.print(Arr[i]);
            }
        }
        
    }     
        
}


class program19
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        System.out.println("Number of character are : "+str.length());
        
        Alphabate obj = new Alphabate();

        obj.DisplayDigit(str);

        
        
    }    
} 