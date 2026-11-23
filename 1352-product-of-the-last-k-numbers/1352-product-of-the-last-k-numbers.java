class ProductOfNumbers {
    //Easy logic keep a arraylist of products tc of edge cases divided by0 & k>=size
    
     List<Integer> list;

    public ProductOfNumbers() {
        list = new ArrayList<>();
        list.add(1);
    }
    
    public void add(int num) {
        int n = list.size();
        int i= list.get(n-1);
        if(num==0){
            list.clear();
            list.add(1);
            return ;
        }
        list.add(i*num);
    }
    
    public int getProduct(int k) {
        int n = list.size();
        if(k>=n){
            return 0;
        }
        int s= n-k;
        return list.get(n-1)/list.get(s-1);
    }
}//Timecomplexity is O(1)

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */