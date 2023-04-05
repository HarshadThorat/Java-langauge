// Accept character from user. if character is small display its corresponding capital character.
// and if it small then display its corresponding capital.in other cases display as it is??
// Input :    Q      m      4        %              
// output :   q      M      4        %

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
            //ch = (char)(ch + 32);
            //System.out.println((ch));
            System.out.println(Character.toLowerCase(ch));
        }
        else if((ch >= 'a') && (ch <= 'z'))
        {
            //ch = (char)(ch - 32);
            //System.out.println((ch));
            System.out.println(Character.toUpperCase(ch));
        }
        else
        {
            System.out.println(ch);
        }
    }

}


class program7
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