// write a program which accept string from user and accept one character. check whether is present in string or not.
// input : Marvellous
// output : (e)  true

import java.util.*;

class Alphabate
{
    public boolean CheckCharacter(String s,char ch)
    {   
        boolean flag = false;
        char Arr[] = s.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ch) 
            {
                flag = true;
            }
        }
        return flag;
    }     
}


class program21
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        System.out.println("Enter the character : ");
        char ch = sobj.next().charAt(0);

        System.out.println("Number of character are : "+str.length());
        
        Alphabate obj = new Alphabate();

        boolean ret = obj.CheckCharacter(str,ch);
        if(ret == true)
        {
            System.out.println("Character found");
        }
        else
        {
            System.out.println("Character not found");
        }
        
    }    
} 