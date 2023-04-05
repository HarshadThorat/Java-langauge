//write java program which accept  arrays of character from user and count number of capital character 
//Input :  b  N   j  B  R  b  A  d  G   G
//Outut :  6
//          


import java.util.*;

class Alphabate
{
    public void CountCapital(char Arr[],int Size)
    {
        int i = 0;
        for(int iCnt = 0; iCnt < Size; iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                i++;
            }
        }        
        System.out.println("Number of capital character are : "+i);
    } 
        
}


class program33
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
        obj.CountCapital(Arr1,size1);


    }
}
