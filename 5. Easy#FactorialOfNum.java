import java.util.ArrayList;
class Solution {
    public static ArrayList<Integer> factorial(int n) {
        // code here
        
        // int fact=1;
        // for(int i=1;i<=n;i++){
        //     fact=fact*i;
        
        ArrayList<Integer> result= new ArrayList<>();
        result.add(1);
        for(int i=2;i<=n;i++){
            multiply(result,i);
        }
        return result;
        }
    
    
    private static void multiply(ArrayList<Integer> result, int num){
        int carry=0;
        for(int i=result.size()-1;i>=0;i--){
            int prod= result.get(i)*num+carry;
            result.set(i,prod%10);
            carry=prod/10;
        }
        
        while(carry>0){
            result.add(0,carry%10);
            carry/=10;
        }
    }
}
