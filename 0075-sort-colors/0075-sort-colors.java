class Solution {
    public void sortColors(int[] arr) {
        int start=0;
        int end =arr.length-1;
        int[] array = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                   int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}