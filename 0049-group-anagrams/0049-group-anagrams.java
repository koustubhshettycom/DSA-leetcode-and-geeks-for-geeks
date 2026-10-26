class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    //Logic is to sort each string and make grps
    //if grp of tht str doesnt exist make one and add
        Map<String,List<String>> mp = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String w = strs[i];
            char[] arr = w.toCharArray();
            Arrays.sort(arr);
            String ele = new String(arr);
            if(!mp.containsKey(ele)){
                mp.put(ele,new ArrayList<>());
            }
            mp.get(ele).add(w);

        }

        return new ArrayList<>(mp.values());

    }
}//Time complexity is O(nlogn)