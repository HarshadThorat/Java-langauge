//write java program which accept  arrays from user Replace each member with summation of its digit 
//Input :  89  687  56  549   87   9
//Outut :  17   21  11   18   15    9
//          


import java.util.*;

class Number
{
    public void Summation(int Arr[],int Size)
    {
        int Sum = 0;
        int iDigit = 0;

        System.out.println("Addition is : ");
        for(int iCnt = 0; iCnt < Size; iCnt++)
        {
            while(Arr[iCnt] != 0)
            {
                iDigit = Arr[iCnt] % 10;
                Sum = Sum + iDigit;
                Arr[iCnt] = Arr[iCnt] / 10;
            }
            System.out.print(Sum+"\t");
            Sum = 0;
        }        
    } 
        
}


class program32
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the Size of first Array");
        int size1 = sobj.nextInt();

        System.out.println("Enter the Elements of array");
        int Arr1[] = new int[size1];
        for(int iCnt = 0; iCnt < size1; iCnt++)
        {
            Arr1[iCnt] = sobj.nextInt();
        }

        Number obj = new Number();
        obj.Summation(Arr1,size1);


    }
}
