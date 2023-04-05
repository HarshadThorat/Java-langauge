//write a java program which accept string from user and check whether it contain vowels or not
// input  :  marvellous       xyz
// output :  true              false


import java.util.*;

class Alphabate
{
    public boolean CheckVowels(String s)
    {
        boolean flag = false;
        char Arr[] = s.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] == 'a') || (Arr[i] == 'e') || (Arr[i] == 'i') || (Arr[i] == 'o') || (Arr[i] == 'u')  )
            {
                flag = true;
            }
        }
        
        return flag;
    }
}


class program29
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sobj.nextLine();

        Alphabate obj = new Alphabate();

        boolean ret = obj.CheckVowels(str);
        if(ret == true)
        {
            System.out.println("It contain vowels");
        }
        else
        {
            System.out.println("It not contain vowels");
        }
        
        
    }
}