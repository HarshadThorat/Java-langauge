// Write a program which accept string from user and check whether it contain vowels in it or not.
// input :  "Marvellous"            "xyz"  
// output :   true                  false

import java.util.*;

class Alphabate
{
    public boolean CheckVowels(String s)
    {   
        int i = 0;
        boolean flag = false;

        while(i < s.length())
        {
            //System.out.println(s.charAt(i));
            if((s.charAt(i) == 'A') || (s.charAt(i) == 'E') || (s.charAt(i) == 'I') || (s.charAt(i) == 'O') || (s.charAt(i) == 'U') || (s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i') || (s.charAt(i) == 'o') || (s.charAt(i) == 'u'))
            {
                flag = true;
            }
            i++;
        }
        return flag;
    }    
}


class program14
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        System.out.println("Number of character are : "+str.length());
        
        Alphabate obj = new Alphabate();

        boolean ret = obj.CheckVowels(str);
        if(ret == true)
        {
            System.out.println("It contain vowels");
        }
        else
        {
            System.out.println("It NOT contain vowels");
        }

    }    
} 