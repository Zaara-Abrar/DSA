class Solution {
    public int maxArea(int[] height) {
        int s=0, e=height.length-1;
        int max_area=0;
        while(s<e){
            int width=e-s;
            int high=Math.min(height[s],height[e]);
            int current_area= width*high;
            max_area=Math.max(current_area,max_area);
            if(height[s]<height[e]){
                s++;
            }
            else{
                e--;
            }
        }
        return max_area;
    }
}