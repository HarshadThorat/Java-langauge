//write java program which accept String from user and display below pattern?
// Input :  Hello

// H  e  l  l  o
// H  e  l  l  *  
// H  e  l  *  *   
// H  e  *  *  *  
// H  *  *  *  *

import java.util.*;

class Pattern
{
    public void Display(String s)
    {
        for(int i = 0; i < s.length(); i++)
        {
            for(int j = 0; j < s.length(); j++)
            {
                if(j < s.length()-i)
                {
                    System.out.print(s.charAt(j)+"\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }        
            System.out.println();
        }
    }
}


class program42
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number of Rows");
        String str = sobj.nextLine();
        
        Pattern obj = new Pattern();
        obj.Display(str); 
    }
}
