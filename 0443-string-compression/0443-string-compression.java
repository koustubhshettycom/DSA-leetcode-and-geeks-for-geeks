class Solution {
    public int compress(char[] chars) {
        String str ="";
        char ref = chars[0];
        int count=0;
        for(int i=0;i<chars.length;i++){
            if(chars[i] == ref){
                count++;
            }
            else{
                str+= ref;
                
                if(count>1){
                    str+=count;
                    
                }
                ref = chars[i];
                count=1;
                
            }
        }
        str += ref;
        if (count > 1) {
         str += count;
        }
        for(int i=0;i<str.length();i++){
            chars[i] = str.charAt(i);
        }

        return str.length();
        
    }
}