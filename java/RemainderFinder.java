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