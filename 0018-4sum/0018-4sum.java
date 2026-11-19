class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

    Set<List<Integer>> ans=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Long> hashSet=new HashSet<>();

            
            for(int k=j+1;k<n;k++){
                {
                    
                    long require=(long) target-nums[i]-nums[j]-nums[k];
                    if(hashSet.contains(require)) {  
                      List <Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],(int)require);
                        Collections.sort(temp);
                        ans.add(temp);


                    }
                    hashSet.add((long)nums[k]);
                }
                
            }
            
        }
        
        }
                return new ArrayList<>(ans);

    }
}