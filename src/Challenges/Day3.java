package Challenges;

/*Challenge Link
* https://www.hackerrank.com/challenges/30-conditional-statements/problem?isFullScreen=true*/

/*NOTES
* We are looking for weird or not weird for the results of this challenge
* num % 0 == will determine odd or even. This looks for even results
*
* If the number is odd or greater than 20, automatically checked out of the program.
* Check for greater than 20 first then odd number?
*
* last two results are easy, if the number is even between 2 + 5, not weird
* if the number is even between 6 + 20, weird
*
* could it be 3 checks? default out is weird but then runs thru the checks?
* */

public class Day3 {

    public static void main(String[] args) {
        int num = 4;
        String statement = "Weird";

        if (num != 0 && num % 2 == 0){
            if (num <= 5|| num > 20){
                statement = "Not Weird";
            }
        }
        System.out.println(statement);
    }

}
