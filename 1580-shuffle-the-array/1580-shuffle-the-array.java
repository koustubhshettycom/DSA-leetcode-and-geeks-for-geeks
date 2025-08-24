class Solution {
    public int[] shuffle(int[] nums, int n) {
        //extending the length of the array to 
        int[] arr = new int[2*n];
        for(int i = 0, j = 0;i < arr.length && j < n;i += 2,j++){
        // adding the elements 
                arr[i]=nums[j];
                arr[i+1]=nums[j+n];

           

            
            
            }
             return arr; 

        }
       
       
    }

// Time complexity is good or great O(n) 9/10


