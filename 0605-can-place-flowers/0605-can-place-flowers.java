// leetcode daily challenge - 20th March


class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       if(n==0)  return true;
        if(n==flowerbed.length && n!=1) return false; 
        if(flowerbed.length == 1)       return flowerbed[0]==0;
        
        int c=0;
        if(flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            c++;
        }
        for(int i=1;i<flowerbed.length-1;i++){
            if(flowerbed[i] == 0){
                if(flowerbed[i-1] ==0 && flowerbed[i+1]==0){
                    flowerbed[i]=1;   c++;
                }
            }
        }
        if(flowerbed[flowerbed.length-2]==0 && flowerbed[flowerbed.length-1]==0 ) c++;
        if(c>=n) return true;
        return false;
    }
}