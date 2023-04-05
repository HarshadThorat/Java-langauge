//write java program which accept  arrays of character from user and return the difference between of capital and frequency of small character
//Input :  b  N   e  B  R  b  A  I  O   G  i
//Outut :  3  (7-4)
//          


import java.util.*;

class Alphabate
{
    public int Difference(char Arr[],int Size)
    {
        int EvenCnt = 0;
        int OddCnt = 0;

        for(int iCnt = 0; iCnt < Size; iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                EvenCnt++;
            }
            else
            {
                OddCnt++;
            }
        }    
        return (EvenCnt-OddCnt);    
        
    } 
        
}


class program37
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

        Alphabate obj = new Alphabate();
        int ret = obj.Difference(Arr1,size1);
        System.out.println("Difference is : "+ret);

    }
}
