class Solution {
public:
    bool isPalindrome(int x) {
        int temp=x;
        long revNum=0;
        while(x>0){
            int digit=x%10;
            revNum= revNum * 10 + digit;
            x=x/10;
        }
        if(revNum == temp ){
            return true;
        }
        return false;
    }
};
