class Solution {
    public boolean validPath(int n, int[][] edges, int source, int dest) {
        // easy logic first usage of conversion of edgelist to adjacentcy list f
        // second usage of any traversal method that is bfs or dfs
        List<List<Integer>> grp = new ArrayList<>();
        boolean[] visit = new boolean[n];
        
        for(int i=0;i<n;i++){
            grp.add(new ArrayList<>());// adding of empty graph
        }

        for(int[] edge : edges){
            int u = edge[0]; // index for graph
            int v = edge[1]; // connection

            grp.get(u).add(v);
            grp.get(v).add(u); // bidirectional graph

        }

        return dfs(source,grp,visit,dest);

        
    }
    // slight modification of traversal of graph via dfs
    public boolean dfs(int node,List<List<Integer>> grp,boolean[] visit, int dest){
        boolean ans = false;
        if(node == dest){
            return true;
        }

        visit[node]=true;

        for(int neighbour : grp.get(node)){
            if(!visit[neighbour]){
               ans = ans || dfs(neighbour,grp,visit,dest);
            }
        }
        return ans;

    }

}
//Time complexity is O(n)