//write java program which accept String from user and display below pattern?
// Input :  Hello
// H  #  #  #  #  
// H  e  #  #  #
// H  e  l  #  #  
// H  e  l  l  #  
// H  e  l  l  o

import java.util.*;

class Pattern
{
    public void Display(String s)
    {
        for(int i = 0; i < s.length(); i++)
        {
            for(int j = 0; j < s.length(); j++)
            {
                if(i >= j)
                {
                    System.out.print(s.charAt(j)+"\t");
                }
                else
                {
                    System.out.print("#\t");
                }
            }        
            System.out.println();
        }
    }
}


class program43
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
