// Accept character from user and display its ASCII value in decimal, octal, hexadecimal format.
// input : A          Decimal       65
//                    Octal         0101
//                    Hexadecimal   0X41
//incomplete

import java.util.*;

class Alphabate
{
    public char ch;

    public Alphabate(char i)
    {
        ch = i;
    }

    public void Display()
    {
        if((ch >= 'A') && (ch <= 'Z'))
        {
            
        }
        
    }

}


class program10
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character");
        char ch = sobj.next().charAt(0);

        Alphabate obj = new Alphabate(ch);

        obj.Display();
        
    }
}