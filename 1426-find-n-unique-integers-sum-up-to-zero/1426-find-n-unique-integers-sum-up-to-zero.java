class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int num=0;
        int item=0;
        if(n%2==0){
            item++;
            while(num!=arr.length){
                arr[num]= item;
                arr[num+1] = -item;
                num+=2;
                item++;
            }
        }
        else{
            arr[num]=0;
            item++;
            num++;
            while(num<arr.length){
                arr[num]= item;
                arr[num+1] = -item;
                num+=2;
                item++;
            }


        }
        return arr;
    }
}