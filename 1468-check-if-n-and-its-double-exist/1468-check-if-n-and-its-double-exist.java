    class Solution {
        public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);   
        // sort it and compare with each and every element thats it
        for(int i=0;i<arr.length;i++){
            int req= arr[i]*2;
            int start=0;
            int end =arr.length-1;
            while(start<=end){
                    int mid = start+ (end-start)/2;
                    if(req==arr[mid] && mid != i){
                        return true;
                    }
                    else if(req<arr[mid]){
                    end=mid-1; 
                    }
                    else{
                        start=mid+1;
                    }
                }
        
                
            

            
        
        }
        return false;
        
        }
    }
    // Time complexity is good O(logn)