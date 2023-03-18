public class Palindrome {

    public static void main(String [] args){
        Palindrome pn = new Palindrome();

        if(pn.isPalindrome("noe")){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }   
    }


    boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        
        return true;
    }    

}