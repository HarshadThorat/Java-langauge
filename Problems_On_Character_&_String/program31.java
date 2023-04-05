//Write a java program which accepts 2 strings from user and concat N characters of second string after first string.Value of N should be accepted from user.

//Note: If third parameter is greater than the size of second string then concat whole string after first string.
// Input : Marvellous Infosystem
//         Logic Building
//          5
//output : "Marvellous Infosystem Logic" 
import java.util.*;


class Alphabate
{
    public void StrConcat(String s1,String s2, int no)
    {
        String str = " ";
        
        char Arr[] = s2.toCharArray();

        for(int i = 0; i < no; i++)
        {
            str = str + Arr[i];
        }
        
        String s3 = s1.concat(str);
        System.out.println(s3);
    }
}

class program31
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String1");
        String str1 = sobj.nextLine();
        
        System.out.println("Enter the String2");
        String str2 = sobj.nextLine();

        System.out.println("Enter the number");
        int No = sobj.nextInt();

        Alphabate obj = new Alphabate();

        obj.StrConcat(str1,str2,No);
    }
}