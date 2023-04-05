//Accept character from user and check whether it is alphabate or not(A-Z a-z)
// input : F           &
// output : true        false

import java.util.*;

class Alphabate
{
    public char ch;

    public Alphabate(char i)
    {
        ch = i;
    }

    public boolean ChkAlpha()
    {
        if((ch >= 'A') && (ch <= 'Z') || (ch >= 'a') && (ch <= 'z'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}


class program1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character");
        char ch = sobj.next().charAt(0);

        Alphabate obj = new Alphabate(ch);

        boolean ret = obj.ChkAlpha();
        if(ret == true)
        {
            System.out.println("It is Alphabate");
        }
        else
        {
            System.out.println("It is Not a Alphabate");
        }
    }
}