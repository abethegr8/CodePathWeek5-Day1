/*
https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
Problem #1: Word Frequency
Implement a method to find the number of occurrences of any given word in a book. A word is represented as a string and a book is represented as an array / list of strings.

Optimize the method to be called multiple times.

Examples:

Input: [" The", "dog", "jumped", "in", "the", "dog", "house"], "dog"
Output: 2

Understand:
Will we every get a empty List?
Are all the words lowercase, no spaces, punctionations, etc.
what is default to return, 0?
How large or small is the list going to be?
What are the time/space constraints?

Match:
Arrays, 2 pointer technique, sliding window, hashtables, nested for loops

Plan:
create an integer to keep count of how many occurances are of k.
create a for each loop, check if the string is equal to k. may need to make the elements to lowercase to deal with capitals.

Implement:

Review:

Evaluate:

 */

public class WordFrequency {
    public static int wordFrequency(String[] arr, String k){
        //deal with edge cases, if arr is null, word is null, arr length is 0, word has nothing, word.equals("");
        if(arr.length == 0 || k.equals("") || arr == null || k == null){
            return -1;
        }

        int count = 0;

        for (String s: arr ) {
            s = s.toLowerCase();
            if(s.equals(k.toLowerCase())){
                count++;
            }
        }
        return count;
    }

}
