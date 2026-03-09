class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int size=nums1.length;
      int i=0;
      int j=0;
      int k=0;
      int[] nums=new int[size]; 
      while(i<m && j<n){
        if(nums1[i]<=nums2[j]){
            nums[k]=nums1[i];
            i++;
        }else{
            nums[k]=nums2[j];
            j++;
        }
        k++;
      }  
      while(i<m){
         nums[k]=nums1[i];
            i++;
            k++;
      }
      while(j<n){
         nums[k]=nums2[j];
            j++;
            k++;
      }
      for(int a=0;a<size;a++){
        nums1[a]=nums[a];
      }
    }
}