public class Test {

    /**
     * Write a recursive implementation of the factorial function. Recall that n! = 1 × 2 × ... × n,
     * with the special case that 0! = 1.
     * @param n
     * @return
     */
    public int factorial(int n){
        if(n == 0) return 1;
        else return n * factorial(n-1);
    }

    /**
     * Write a recursive function that, given a number n, returns the sum of the digits of the number n.
     * @param n
     * @return
     */
    public int sumDigitos(int n){
        if(n<10) return n;
        else return (n%10) + sumDigitos(n/10);
    }

    /**
     * Write a recursive function that, given a string s, prints the characters of s in reverse order.
     */
    public void printReverse(String c){
        if(c.length()>0){
            System.out.println(c.charAt(c.length()-1));
            printReverse(c.substring(0, c.length()-1));
        }
    }

    /**
     * Write a recursive function that checks whether a string is a palindrome (a palindrome is
     * a string that's the same when reads forwards and backwards.)
     */
    public boolean palindrome(String c){
        if(c.length()==1) return true;
        else
            if(c.length()==2) return c.charAt(0)==c.charAt(1);
            else
                if(c.charAt(0)!=c.charAt(c.length()-1)) return false;
                return palindrome(c.substring(1, c.length()-1));
    }

        
    /**
     * EXERCISES
     *  Write a recursive function that, given two strings, returns whether the first string is a subsequence
     *  of the second. For example, given hac and cathartic, you should return true, but given bat and table,
     *  you should return false.
     *
     *  The basic idea behind recursion is that your function does two different things:
     *
     * If the answer is really easy, it returns the answer. (This is a "base case".)
     * Otherwise, it figures out a way to make the problem easier, and calls itself to solve
     * the easier version of the problem. (A function calling itself is what's meant by "recursion.")
     * In the case of this problem, you have two base cases:
     *
     * If the first string is empty, it's a subsequence of anything, so that's True.
     * If the second string is empty (and the first string isn't), nothing can be a subsequence of it, so that's False.
     * Then you have two ways to make the problem easier (i.e. by making one or both strings smaller):
     *
     * If the first characters match, then the answer is the same as if you called the function on both strings minus
     * the first letter. (That is, ac is a subsequence of artic IFF c is a subsequence of rtic.)
     * If not, then the answer is the same as if you used the same first string but minus the first letter of
     * the second string (That is, hac is a subsequence of cathartic IFF hac is a subsequence of athartic.)
     *
     * @param sub
     * @param cad
     * @return
     */
    public boolean isSubsequent(String sub, String cad){
        if(sub.isEmpty()) return true;
        if(cad.isEmpty()) return false;
        if(sub.charAt(0) == cad.charAt(0))
            return isSubsequent(sub.substring(1), cad.substring(1));
        else
            return isSubsequent(sub, cad.substring(1));
    }


    public static void main(String[] args) {
        Test t = new Test();

        System.out.println(new Test().isSubsequent("hac", "cathartic"));
        System.out.println(new Test().isSubsequent("bat", "table"));
        System.out.println(new Test().factorial(5));
        System.out.println(new Test().sumDigitos(12));
        new Test().printReverse("ABCDEFG");
        System.out.println(t.palindrome("AABSA"));
    }


}