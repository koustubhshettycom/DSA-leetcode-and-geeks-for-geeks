class Solution {
    public List<Integer> remainingMethods(int p, int k, int[][] invocations) {
    //Tricky logic of graph make note of all corrupted nodes using a traversal 
    //method of graph and remove them from normal nodes
    //in the next round of traversal of normal nodes
    // if it points towards any corrupted node u cant remove them
    // thus return everything else return only right nodes
    List<Integer> ans = new ArrayList<>();
    HashSet<Integer> all = new HashSet<>(); 
    Queue<Integer> qu = new LinkedList<>();
    HashSet<Integer> visited = new HashSet<>();
    List<List<Integer>> graph = new ArrayList<>();
    for(int i=0;i<p;i++){
        graph.add(new ArrayList<>());
        all.add(i);
    }
    

    for(int[]edge :invocations){
        int v = edge[0];
        int u = edge[1];
        graph.get(v).add(u);
        
    }
    qu.offer(k);
    all.remove(k);
    visited.add(k); 
    while(!qu.isEmpty()){
        int num = qu.poll();
        for(Integer n : graph.get(num) ){
            if(!visited.contains(n)){
                visited.add(n);
                qu.offer(n);
                all.remove(n);
            }
            
            

        }
    }
    
    for(Integer node : all){
       for(Integer num:graph.get(node)){
        if(visited.contains(num)){
            ans.clear();
            for(int i=0;i<p;i++){
                ans.add(i);
            }
            return ans;
        }
       }
       
    }
    ans.addAll(all);
    return ans;

     
    }
}//Time complexity is O(n)