class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //sort both the arrays first
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        // create a ll to add common elements 
        LinkedList<Integer> ll= new LinkedList<>();
        int i=0;
        int j=0;
        // run a loop until its end
        while(i<nums1.length&& j<nums2.length){
            if(nums1[i]==nums2[j]){
            if(ll.isEmpty() || ll.getLast()!=nums1[i]){
                ll.add(nums1[i]);
            }
            i++;
            j++;
           
        }
        else if(nums1[i]<nums2[j]){
            i++;
        }
        else if(nums1[i]>nums2[j]){
            j++;
        }

        }
        // replicate then it into array as it is what they have asked 

        int[] arr = new int[ll.size()];
        for(int k=0;k<arr.length;k++){
            arr[k]=ll.get(k);
        }
        return arr;
        //time complexity is O(logn)
    }
}