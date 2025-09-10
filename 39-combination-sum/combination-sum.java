class Solution {
    List<List<Integer>> result;
    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums,target,0,new ArrayList<>(),result);
        return result;
    }

    public static void backtrack(int []nums,int remains,int start,List<Integer> path,List<List<Integer>>result){
        if(remains == 0 ){
            result.add(new ArrayList<>(path));
            return;
        }

        if(remains< 0 ){
            return;
        }
        for(int i = start;i<nums.length;i++){
            int num = nums[i];
            if(num > remains) break;
            path.add(num);
            backtrack(nums,remains- num,i,path,result);
            path.remove(path.size()-1);
        }
    }
}
