class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        set.add(nums1[i]);
        HashSet<Integer> sets=new HashSet<>();
                for(int j=0;j<nums2.length;j++){
                 
                if (set.contains(nums2[j])){
                       sets.add(nums2[j]);
                }}

        int[] ans = new int[sets.size()];
        int k = 0;

        for (int x : sets) {
            ans[k] = x;
            k++;
        }

        return ans;
    }
}