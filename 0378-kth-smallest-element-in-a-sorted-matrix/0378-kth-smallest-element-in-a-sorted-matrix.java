class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        //easy logic as we need take kth smallest ele we use max heap(reverse taking)
        //take the elements in until they r less than k
        //when its above k length pop the element
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                
                pq.add(matrix[i][j]);
                if(pq.size()>k){
                    pq.poll();
                }
            }
        }
        return pq.peek();

    }
}//Time complexity is O(n*n)