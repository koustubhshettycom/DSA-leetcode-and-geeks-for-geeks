class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0 ;i<image.length ;i++){
          int  end= image[i].length-1;
          int  start = 0;
            while(end>=start){
                int temp=0;
                temp = image[i][start];
                image[i][start]=image[i][end];
                image[i][end]=temp;
                end--; start++;


            }
        } 
        for(int i=0 ;i<image.length ;i++){
            for(int j=0 ;j<image[0].length ;j++){
                switch(image[i][j]){
                    case 0 -> image[i][j]= 1;
                    case 1 -> image[i][j]= 0;

                }

               
                
            }
    
        }

        return image;







    }

}