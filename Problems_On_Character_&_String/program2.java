//Accept character from user and check whether it is Capital or not(A-Z)
// input : F             f
// output : true        false

import java.util.*;

class Alphabate
{
    public char ch;

    public Alphabate(char i)
    {
        ch = i;
    }

    public boolean ChkCapital()
    {
        if((ch >= 'A') && (ch <= 'Z'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}


class program2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character");
        char ch = sobj.next().charAt(0);

        Alphabate obj = new Alphabate(ch);

        boolean ret = obj.ChkCapital();
        if(ret == true)
        {
            System.out.println("It is Capital letter");
        }
        else
        {
            System.out.println("It is Not a Capital letter");
        }
    }
}