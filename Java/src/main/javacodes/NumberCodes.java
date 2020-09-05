package javacodes;

import java.util.Random;

public class NumberCodes {
    public static void reverseNumber(int x)
    { int revdigit=0;
        while(x!=0)
        {
            int dividend =x%10;
            revdigit =revdigit*10 + dividend;
            x=x/10;
        }
        System.out.println("Reversed Number is " + revdigit);
    }

    public static void powerOfNumber(int x,int y)
    { int power=1;
        while(y>=0)
        {
            power=power * x;
            y--;
        }
        System.out.println(power);

    }
    public static void randomNumbers(int y)
    {
        Random x= new Random();
        System.out.println(x.nextInt(y));
    }
    public static void randomNumbers(int low,int high)
    {
        Random x= new Random();
        System.out.println(x.nextInt(high-low)+low);
    }
    public static void factorial(int x)
    { int[] arr= new int[10];
        for (int i = 1; i <=x/2 ; i++) {
            if(x%i==0)
            {
                System.out.println("factorial of " + x + " is " + i);
            }

        }
    }
}
