//Accept character from user and check whether it is Digit or not(0-9)
// input :   7            d
// output : true        false 

import java.util.*;

class Alphabate
{
    public char ch;

    public Alphabate(char i)
    {
        ch = i;
    }

    public boolean ChkDigit()
    {
        if((ch >= '0') && (ch <= '9'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}


class program3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Digit");
        char ch = sobj.next().charAt(0);

        Alphabate obj = new Alphabate(ch);

        boolean ret = obj.ChkDigit();
        if(ret == true)
        {
            System.out.println("It is Digit");
        }
        else
        {
            System.out.println("It is Not a Digit");
        }
    }
}