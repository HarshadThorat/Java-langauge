//Accept character from user and check whether it is Small case or not(a-z)
// input :   d            D
// output : true        false


import java.util.*;

class Alphabate
{
    public char ch;

    public Alphabate(char i)
    {
        ch = i;
    }

    public boolean ChkSmall()
    {
        if((ch >= 'a') && (ch <= 'z'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}


class program4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character");
        char ch = sobj.next().charAt(0);

        Alphabate obj = new Alphabate(ch);

        boolean ret = obj.ChkSmall();
        if(ret == true)
        {
            System.out.println("It is Small letter");
        }
        else
        {
            System.out.println("It is Not a Small letter");
        }
    }
}