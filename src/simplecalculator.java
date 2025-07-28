import java.util.Scanner;
public class simplecalculator
{
    public static void main(String args[])
    {
        Scanner S= new Scanner(System.in);
        System.out.println("enter the first no: ");
        int no1=S.nextInt();
        System.out.println("enter the second no: ");
        int no2=S.nextInt();
        System.out.println("select the symbols(+,-,/,*)");
        String sym= S.next();
        int res;
        switch(sym)
        {
            case"+":res=no1+no2;
            System.out.println("Addition is:"+res);
            break;
            case"-":res=no1-no2;
            System.out.println("Subtraction is :"+res);
            break;
            case"/":res=no1/no2;
            System.out.println("Division is:"+res);
            break;
            case"*":res=no1*no2;
            System.out.println("Multiplication is:"+res);
            break;
            default:System.out.println("Invalid sysmbol ");

        }
    }

}
