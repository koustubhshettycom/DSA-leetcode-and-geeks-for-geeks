class Solution {
    public int minAddToMakeValid(String s) {
        //easy logic of stack add if opp found delete both of them and 
        // remove everything with having count of everything and return it 
       Stack<Character> stc = new Stack<>();
        if(s.equals("")){
            return 0;
        }

        for (char c : s.toCharArray()){
            if(c==')' && !stc.isEmpty() && stc.peek() == '('){
               stc.pop();


            }
            else{
                stc.push(c);

            }
        }
        int count=0;
        while(!stc.isEmpty()){
            stc.pop();
            count++;
        }
        return count;
      

        
        
    }
}// Time compelxity is O(n)