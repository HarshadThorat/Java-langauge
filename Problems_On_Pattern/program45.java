//write java program which accept String from user and display below pattern?
// Input :  Hello
// H  #  #  #  #  
// H  e  #  #  #
// H  e  l  #  #  
// H  e  l  l  #  
// H  e  l  l  o
// H  e  l  l  #  
// H  e  l  #  #   
// H  e  #  #  #  
// H  #  #  #  #


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
        for(int i = 1; i < s.length(); i++)
        {
            for(int j = 0; j < s.length(); j++)
            {
                if(j < s.length()-i)
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


class program45
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
