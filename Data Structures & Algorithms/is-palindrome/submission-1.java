class Solution {

    public boolean isPalindrome(String s) {
        String a = s.replaceAll("[^a-zA-Z0-9]", "");
        String z = new StringBuilder(a).reverse().toString().toLowerCase();
        String b = a.toLowerCase();

        return z.equals(b);
    }
}