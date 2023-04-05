// Accept character from user. 
//If it is capital then display all the characters from the input characters till Z. 
//If input character is small then print all the characters in reverse order till a.
// In other cases return directly.
// Input: Q
// Output: Q R S T U V W X Y Z
// Input: m
// Output: m k j h g f e d c b a

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
        while((ch >= 'A') && (ch <= 'Z'))
        {
            System.out.print(ch+"\t");
            ch++;
        }
        
        while((ch >= 'a') && (ch <= 'z'))
        {
            System.out.print(ch+"\t");
            ch--;
        }
    }

}


class program8
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