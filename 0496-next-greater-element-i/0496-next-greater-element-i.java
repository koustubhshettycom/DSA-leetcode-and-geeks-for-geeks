class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // a standard question but tricky logic 
        //Standard Stack question approach
        // take a loop and check for empty and greater or lesser case if its safe then pop it
        // if empty its nothing if its greater or lesser case then peek()is the ans for tht arr
        // commonly push every element after checking to the stack 
        int n = nums2.length;
        int m = nums1.length;
        Stack<Integer> stc = new Stack<>();
        int[] arr = new int[n];
        int point1 = 0;
        int point2 =0;
        int[] arr2 = new int[m];



        for(int i=n-1;i>=0;i--){
            while(!stc.isEmpty() && nums2[i] >= stc.peek()){
                stc.pop();

            }
            if(stc.isEmpty()){
                arr[i]=-1;
            }
            else if(stc.peek()>= nums2[i]){
                arr[i]= stc.peek();
            }
            

            stc.push(nums2[i]);

        }
        while(point1<m){
            if(nums1[point1]!=nums2[point2]){
                point2++;

            }
            else {
                arr2[point1]= arr[point2];
                point2 =0;
                point1++;
                
            }
        }
        return arr2;
        
    }
}// Time complexity is O(n*n)