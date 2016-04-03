function oddity(n){
  if(Math.sqrt(n) % 1 == 0) {
    return 'odd'
  }
  return 'even'
}

/*
Odd/Even number of divisors

Description:

Given an integer n return 'odd' if the number of its divisors is odd. Otherwise return 'even'.

Examples:

All prime numbers have exactly two divisors (hence 'even')

For n=12 the divisors are [1,2,3,4,6,12] – 'even'

For n=4 the divisors are [1,2,4] – 'odd'

*/