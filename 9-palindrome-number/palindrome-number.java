class Solution {
    public boolean isPalindrome(int x) {
        if (x<0 || x!=0 && x%10 == 0) return false;
        int rev_num=0;
        while(x>rev_num){
            rev_num = rev_num*10 + x%10;
            x/=10;
        }
        return (x==rev_num || x ==rev_num/10);
    }
}