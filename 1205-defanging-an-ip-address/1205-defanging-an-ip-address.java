// the main goal of Strings is to learn different categories of commands
class Solution {
    public String defangIPaddr(String str) {
       //iterate through each and every char then defang the ip address
        int size = str.length();
        String str2 ="";
        for(int i=0;i<size;i++){
            if(str.charAt(i) == '.'){
                str2= str2 +"[.]";
            }
            else{
                str2= str2 + str.charAt(i);
            }
        }
        return str2;
    }
}// time complexity is O(n)
// recommended to use string builder 