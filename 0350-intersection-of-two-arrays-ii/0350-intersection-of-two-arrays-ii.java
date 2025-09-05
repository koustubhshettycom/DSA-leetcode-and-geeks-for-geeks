class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // sort the arrays first then create a new ll
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        LinkedList<Integer> ll =new LinkedList<>();
        int i=0;int j=0;
        // check for the equal value and add it to the ll
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                ll.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        //from ll add it back to array now
        int[] arr = new int[ll.size()];
        for(int k=0;k<arr.length;k++){
            arr[k]=ll.get(k);
        }
        return arr;
    }
}// time complexity is O(logn)