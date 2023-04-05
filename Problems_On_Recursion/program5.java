//write a Recursive program which display below pattern?
// output : a  b  c  d  e  f

import java.util.*;

class Recursion
{
    static int i = 1;
    static char ch = 'a';

    public void DisplayR()
    {
        if(i <= 6)
        {
            System.out.print(ch+"\t");
            ch++;
            i++;
            DisplayR();
        } 
    } 
}


class program5
{
    public static void main(String arg[])
    {
        Recursion obj = new Recursion();
        obj.DisplayR();
    }

}