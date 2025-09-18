class Solution {
    public boolean isLongPressedName(String name, String typed) {
        // best method to use pointers for both the strings 
        int i=0;
        int j=0;
        while(j < typed.length()){// logic here you are supposed to use is for j
            if(i < name.length() && name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }
            else if (j > 0 && typed.charAt(j)==name.charAt(i-1)){// j should be more than 0 as j-1 is being used 
                j++;
            }
            else{
                return false;
            }
        }
        return i== name.length();// to check if the words are complete 
    }
}// time complexity is O(n)