import java.util.Scanner;
    public class multiplicationtable
    {
        public static void main(String args[])
        {
            Scanner S = new Scanner(System.in);
            System.out.println("enter the no");
            int no = S.nextInt();
            for (int i = 1; i <= 10; i++)
            {
                System.out.println(no + "*" + i + "=" + no * i);
            }

        }

    }
