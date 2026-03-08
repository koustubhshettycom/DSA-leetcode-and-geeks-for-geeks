class Solution {
    public void duplicateZeros(int[] arr) {
        // easy logic use stack modify when u see the 0
        Stack<Integer> stc = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            stc.push(arr[i]);
            if(stc.peek()==0){
                stc.push(0);

            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=stc.pop();
        }

        return;
        
    }
}// Time complexity is O(n)