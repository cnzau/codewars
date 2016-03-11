class MaxDiffLength {
    
    public static int mxdiflg(String[] a1, String[] a2) {
        // your code
        int max_diff = 0;
        
        //if one of the argument array is empty
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }

        //iterate through argument arrays
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {

                int diff = java.lang.Math.abs(a1[i].length() - a2[j].length());
                  //reassigns if diff is greater
                if(diff > max_diff) {
                    max_diff = diff;
                }
            }
        }
        return max_diff;
    }
}

/*
You are given two arrays a1 and a2 of strings. Each string is composed with letters from a to z.
Let x be any string in the first array and y be any string in the second array.

Find max(abs(length(x) − length(y)))

If a1 or a2 are empty return -1 in each language except in Haskell where you will return Nothing.
Example:

s1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
s2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
mxdiflg(s1, s2) --> 13

*/