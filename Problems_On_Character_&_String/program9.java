//Accept character from user and check whether it is Special symbol or not(A-Z)
// input :   %            d
// output : true        false


import java.util.*;

class Alphabate
{
    public char ch;

    public Alphabate(char i)
    {
        ch = i;
    }

    public boolean ChkSymbol()
    {
        if((ch >= '!') && (ch <= '*'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}


class program9
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character");
        char ch = sobj.next().charAt(0);

        Alphabate obj = new Alphabate(ch);

        boolean ret = obj.ChkSymbol();
        if(ret == true)
        {
            System.out.println("It is Symbol");
        }
        else
        {
            System.out.println("It is Not a  Symbol");
        }
    }
}