class Solution {
public:
    bool isPalindrome(int x) {
        int temp=x;
        long revNum=0;
        if(x<0) 
            return false;
        while(x>0){
            int digit=x%10;
            revNum= revNum * 10 + digit;
            x=x/10;
        }
      
        return revNum==temp;
    }
};
