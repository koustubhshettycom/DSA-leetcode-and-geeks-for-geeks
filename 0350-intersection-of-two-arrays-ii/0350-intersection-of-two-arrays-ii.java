class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        LinkedList<Integer> ll =new LinkedList<>();
        int i=0;int j=0;
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
        int[] arr = new int[ll.size()];
        for(int k=0;k<arr.length;k++){
            arr[k]=ll.get(k);
        }
        return arr;
    }
}