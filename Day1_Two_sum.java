import java.util.Map;
import java.util.HashMap;

public class Day1Twosum {
    public int[] twoSum(int []nums, int target){
        Map <Integer,Integer> map= new HashMap <> ();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int moreNeeded=target-num;
            if(map.containsKey(moreNeeded)){
                return new int[]{map.get(moreNeeded),i};

            }
            map.put(num,i);
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        Day1Twosum obj = new Day1Twosum();
        int[] nums = {2, 7, 11, 15};
        int target = 17;
        int[] result = obj.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }

}
