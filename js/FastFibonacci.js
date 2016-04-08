function fib(num) {
  // fix me!
  var a = 0, b= 1, c = 0, arr = [0, 1];
  if (num < 2) return num;
  for (var i = 2; i <= num; i++) {
    c = a + b;
    arr.push(c);
    a = b;
    b = c;
  }
  return arr[arr.length - 1];
}


/*
Fast Fibonacci

Description:

Fast Fibonacci

The generic implementation of the fibonacci algorithm is usually something like the following

function fib(num) {
  if (num < 2) return num;
  return fib(num - 1) + fib(num - 2);
}
Now thats all and well and good but that function isn't too efficient. If I wanted to get the 1000th number in the series, I'd have to wait... days? maybe years?

Your task

Write a more efficient fibonacci function that can calculate the 1000th+ number series without breaking a sweat. Read up on tail call optimization for some help.

Starting values

fib(0) = 0;
fib(1) = 1;

*/