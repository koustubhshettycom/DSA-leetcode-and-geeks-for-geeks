class Solution {
    public int compress(char[] chars) {
        StringBuilder str = new StringBuilder();
        char ref = chars[0];
        int count=0;
        for(int i=0;i<chars.length;i++){
            if(chars[i] == ref){
                count++;
            
            }else{
                str.append(ref);
                
                if(count>1){
                    str.append(count);
                    
                }
                ref = chars[i];
                count=1;
                
            }
        }
        str.append(ref);
        if (count > 1) {
         str.append(count);
        }
        for(int i=0;i<str.length();i++){
            chars[i] = str.charAt(i);
        }

        return str.length();
        
    }
}// Time complexity O(n)