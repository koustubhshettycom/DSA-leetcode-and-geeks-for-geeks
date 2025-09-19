class Solution {
    public int repeatedStringMatch(String a, String b) {
        // logic is to multiply the code until the length of b 
        // then check if u have the required substring 
        
        int count =0;
        StringBuilder sb = new StringBuilder();
        while(sb.length()< a.length()+ b.length()){
            count++;
            sb.append(a);
            
            if(sb.toString().contains(b)){
                
                return count;
            }
        }
        return -1;
    }
}//Time complexity is not goodO(n*n)