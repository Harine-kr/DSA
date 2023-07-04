import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> kk = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(kk.containsKey(target - nums[i])){
                return new int[] {kk.get(target - nums[i]),i};
            }
            kk.put(nums[i],i);
        }
        return new int[] {};

        }
    }