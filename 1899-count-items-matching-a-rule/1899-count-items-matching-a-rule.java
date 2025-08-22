class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
       int col =0;
      
       int count=0;
       switch(ruleKey){
       case "type":col=0; break;
       case "color":col=1;break;
       case "name":col=2;break;
       } 
       for(int row=0;row<items.size();row++){
        if(items.get(row).get(col).equals(ruleValue)){
            count++;
        }
       }
       return count;

    }
}