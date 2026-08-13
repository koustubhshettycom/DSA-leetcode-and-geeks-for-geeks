class Solution {
    public int[] scoreValidator(String[] events) {
        //Easy logic read the question 
        int score=0;
        int counter =0;
        for(String str : events){
            if(counter==10){
                break;
            }
            if(str.equals("0")){
                score+=0;
            }
            else if(str.equals("1")){
                score+=1;
            }
            else if(str.equals("2")){
                score+=2;
            }
            else if(str.equals("3")){
                score+=3;
            }
            else if(str.equals("4")){
                score+=4;
            }
            else if(str.equals("5")){
                score+=5;
            }
            else if(str.equals("6")){
                score+=6;
            }
            else if(str.equals("W")){
                counter++;
            }
            else if(str.equals("WD")||str.equals("NB")){
                score+=1;
            }
            
        }
        int[] arr = {score,counter};
        return arr;
    }
}//Time complexity is O(n)