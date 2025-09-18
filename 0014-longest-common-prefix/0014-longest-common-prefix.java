class Solution {
    public String longestCommonPrefix(String[] strs) {
        /* the logic here is to go through the first element's char and compare with 
         other elements char one by one if mis match or array out of index then just return the
         substring */
      if(strs == null|| strs.length==0) return"";

      String str = strs[0];

      for(int i=0;i<str.length();i++) {
        char c = str.charAt(i);

        for(int j=1;j<strs.length;j++){

            if(i== strs[j].length() || c!= strs[j].charAt(i)){
                return str.substring(0,i);
            }
        }
      }
      return str;
    }
}// Time compelxity is O(n*n)