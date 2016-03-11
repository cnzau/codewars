import java.math.BigInteger;
public class Fibonacci {
  public static int getFibNumb(int n) {
    // paste your code here
    int n1 = 1;
    int n2 = 1;
    for(int i = 3; i <= n; i++) {
      int x = n1;
      n1 = n2;
      n2 = (n2 + x)%10;
    }
    return n2;
  }
}

/*
As you probably know, Fibonacci sequence are the numbers in the following integer sequence: 1, 1, 2, 3, 5, 8, 13... Write a method that takes the index as an argument and returns last digit from fibonacci number. Example: getLastDigit(15) - 610. Your method must return 0 because the last digit of 610 is 0. Fibonacci sequence grows very fast and value can take very big numbers (bigger than integer type can contain), so, please, be careful with overflow.

Hardcore version of this kata, no bruteforce will work here ;)
*/