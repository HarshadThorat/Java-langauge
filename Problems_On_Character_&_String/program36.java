//write java program which accept  arrays of character from user and accept one character. return occurance of that character without considering case 
//Input :  b  N   j  B  R  b  A  d  G   G
//Outut :  B    Ans = 3
//          


import java.util.*;

class Alphabate
{
    public int CheckOccurance(char Arr[], int Size, char ch)
    {
        int i = 0;
        int iCnt = 0;
        int ipos = -1;

        for(iCnt = 0; iCnt < Size; iCnt++)
        {
            if(Arr[iCnt] == ch)
            {
                ipos = iCnt;
                break;
            }
        }    

        if(ipos == -1)
        {
            return -1;
        }    
        else
        {
            return ipos;
        }
        
    } 
        
}


class program36
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the Size of character Array");
        int size1 = sobj.nextInt();

        System.out.println("Enter the Elements of array");
        char Arr1[] = new char[size1];
        for(int iCnt = 0; iCnt < size1; iCnt++)
        {
            Arr1[iCnt] = sobj.next().charAt(0);
        }

        System.out.println("Enter the character you have to find");
        char CH = sobj.next().charAt(0);

        Alphabate obj = new Alphabate();
        int ret = obj.CheckOccurance(Arr1,size1,CH);
        if(ret == -1)
        {
            System.out.println("Character Not present in array");    
        }
        else
        {
            System.out.println("Character is present at  Index : "+ret);
        }

    }
}
