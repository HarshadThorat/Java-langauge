// Accept division of student from user and depends on the division display exam timing.
// There are 4 divisions in school as A,B,C,D. 
// Exam of division A at 7 AM, B at 8.30 AM, C at 9.20 AM and D at 10.30 AM. 
//(Application should be case insensitive)
// Input : C                                   d
// output : your exam at 9.20 AM             your exam at 10.30 AM


import java.util.*;

class Alphabate
{
    public char ch;

    public Alphabate(char i)
    {
        ch = i;
    }

    public void DisplaySchedule()
    {
        if(ch == 'A')
        {
            System.out.println("Your exam at 7 Am");
        }
        else if(ch == 'B')
        {
            System.out.println("Your exam at 8:30 Am");
        }
        else if(ch == 'C')
        {
            System.out.println("Your exam at 9:20 Am");
        }
        else if(ch == 'D')
        {
            System.out.println("Your exam at 10:30 Am");
        }
    }

}


class program5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character");
        char ch = sobj.next().charAt(0);

        Alphabate obj = new Alphabate(ch);

        obj.DisplaySchedule();
        
    }
}