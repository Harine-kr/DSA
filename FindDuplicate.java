//https://leetcode.com/problems/find-the-duplicate-number/description/

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int i=0;
        //cyclic sort logic
        while(i<n){
            int correct = nums[i];
            if(nums[i]!=nums[correct]){
                swap(i,nums,correct);
            }
            else i++;
        }
        return nums[0];
    }

    //function to swap
    static void swap(int first,int[] nums,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second]=temp;
    }
}

