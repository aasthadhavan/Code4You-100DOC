class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        double reverse=0;
        while(n>0){
           int remainder=n%10;
           reverse=reverse*10+remainder;
           n=n/10; 
        }
        if(x==reverse){
            return true;
        }
        
        return false;
    }
}
