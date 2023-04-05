// write a program which accept string from user and accept one character. return index of first occurance of that character.
// input : Marvellous   Multi OS
// output : (M)  0  

import java.util.*;

class Alphabate
{
    public void CheckIndex(String s,char ch)
    {   
        char Arr[] = s.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ch) 
            {
                System.out.println("Character present at index : "+i);
                break;
            }
        }
    }     
}


class program23
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

        obj.CheckIndex(str,ch);
       
    }    
} 