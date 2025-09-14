class Solution {
    public String reversePrefix(String word, char ch) {
        // easy logic use stringbuilder so that you can control time complexity
     int i =0;
     int size = word.length();
     boolean found = false;
     while(i<size){
        char cha = word.charAt(i);
        if(cha!= ch){
            i++;
        }
        else{
            found= true;
            break;
        }
     }
     StringBuilder sb = new StringBuilder();
     if(found){
             sb.append(word.substring(0,i+1));
     sb.reverse();
     sb.append(word.substring(i+1,size));
     return sb.toString();
     }
     else{
        return word;
     }

    }
}// Time complexity is O(n)