class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
       int i=0;
       List<Integer> ll =new LinkedList<>();
       // cyclic sort as the question jas condtion of 1-n
       while(i<arr.length){
        int corect=arr[i]-1;
        if(arr[i]<=arr.length && arr[i]!=arr[corect]){
            int temp = arr[i];
            arr[i]= arr[corect];
            arr[corect]=temp;
        }
        else{
            i++;
        }
        
       // checking ecah and every element
       }
       for(int ind=0;ind<arr.length;ind++){
            if(arr[ind]!=ind+1  ){
                ll.add(ind+1);
            }
        }
        return ll;
    }
}//Time complexity is O(n)