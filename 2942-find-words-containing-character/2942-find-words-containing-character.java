class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        //Easy logic u just need to iternate and remember String.valueOf() fxn
        List<Integer> list = new ArrayList<>();
        String ans = String.valueOf(x);
        for(int i=0;i<words.length;i++){
           if( words[i].contains(ans)){
            list.add(i);
           }
            
        }
        return list;
    }
}//Time complexity is O(n)