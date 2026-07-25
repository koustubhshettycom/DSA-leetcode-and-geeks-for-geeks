class Solution {
    public int findCenter(int[][] edges) {
        // easy logic of adjacentcy graph with minor changes
        // make the list then if size is more thn 1 return it
        List<List<Integer>> grp = new ArrayList<>();
        for(int i=0;i<=edges.length+1;i++){
            grp.add(new ArrayList<>());
        }

        for(int[] edge:edges){
            int v = edge[0];
            int u = edge[1];

            grp.get(v).add(u);
            grp.get(u).add(v);

            if(grp.get(v).size()>1){
                return v;
            }
            else if(grp.get(u).size()>1){
                return u;
            }


        }

        return 1;
        
    }
}//Time complexity is O(n)