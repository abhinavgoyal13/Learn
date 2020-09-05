package javacodes;

public class Fibonacci {
    public static void fibonacciByLimit(int x) {
        int x1 = 0;
        int x2 = 1;
        int sum = 0;
        System.out.println(x1);
        while (sum <= x) {
            System.out.println(x2);
            sum = x1 + x2;
            x1 = x2;
            x2 = sum;

        }
    }
    public static void fibonacciByNth(int x)
    {
       int x1=0,x2=1,sum=0,i=1;
        System.out.println(x1);
       while(i<=x)
       {
           System.out.println(x2);
           sum= x1+x2;
           x1=x2;
           x2=sum;
           i++;

       }

    }
}
