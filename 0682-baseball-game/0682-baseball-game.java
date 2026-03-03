class Solution {
    public int calPoints(String[] operations) {
        // easy logic keep adding numbers to stack and change when required acc to the array 
        Stack<Integer> stc = new Stack<>();
        for(String ch: operations){
            if(ch.equals("C")){
                stc.pop();
            } 
            else if(ch.equals("D")){
                int n = stc.peek()*2;
                stc.push(n);
            }
            else if(ch.equals("+")){
                int n = stc.pop();
                int m = stc.pop();
                stc.push(m);
                stc.push(n);
                stc.push(n+m);

            }
            else{
                int n = Integer.parseInt(ch);
                stc.push(n);
            }
        }
        int sum =0;
        while(!stc.isEmpty()){
            sum+= stc.pop();
        }
        return sum;

        
    }
}//Time complexity is O(n)