class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color){
            return image;
        }
        int orgColor=image[sr][sc];
        fill(image,sr,sc,color,orgColor);
        return image;
    }
     public void fill(int[][] image, int sr, int sc, int color,int orgColor) {
        if(sr>=image.length ||sc>=image[0].length || sr<0 || sc<0 ){
            return;
        }
        if(image[sr][sc]!=orgColor){
            return;
        }
        image[sr][sc]=color;
        fill(image,sr+1,sc,color,orgColor);
        fill(image,sr-1,sc,color,orgColor);
        fill(image,sr,sc+1,color,orgColor);
        fill(image,sr,sc-1,color,orgColor);
     }
}