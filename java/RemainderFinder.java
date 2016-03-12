class RemainderFinder {
  
  public static SimpleInteger remainder(SimpleInteger dividend, SimpleInteger divisor) {
    // Code goes here! 
    SimpleInteger test = dividend.subtract(divisor);
    //Check for 0 divisor if test equals dividend
    if(test.compareTo(dividend) == 0) {
      return null;
    }
    
    SimpleInteger rem = dividend;
    //Repeat subtraction to implement divide
    while (rem.compareTo(divisor) >= 0 ) {
      rem = rem.subtract(divisor);
    }
    return rem;
  }
}

/*
Task

Write a method remainder which takes two integer arguments, dividend and divisor, and returns the remainder when dividend is divided by divisor. Do NOT use the modulus operator (%) to calculate the remainder!

Assumption

Dividend will always be greater than or equal to divisor.

Notes

Make sure that the implemented remainder function works exactly the same as the Modulus Operator (%). For example n % 0 = NaN, your method should return null.

Some Random Test Cases are waiting up ahead...

To Java warriors...

SimpleInteger is a tiny and immutable implementation of an integer 
*/