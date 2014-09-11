/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
public class Solution {
    public static int maxPoints(Point[] points) {
        if(points.length <= 2){
            return points.length;
        }
        HashMap<Double,Integer> slopeMap = new HashMap<Double,Integer>();
        int paraY;
        int samePointNum;
        int currentTotal;
        int maxNum = 0;
        double slope;
        for(int i = 0; i < points.length; i++){
            samePointNum = 0;
            currentTotal = 0;
            paraY = 0;
            slopeMap.clear();
            for(int j = i+1; j < points.length; j++){
                slope = 0;
                if(points[i].x == points[j].x && points[i].y == points[j].y){
                    samePointNum++;
                }
                else if(points[i].x == points[j].x){
                    paraY++;
                }else{
                    if(points[i].y == points[j].y){
                        slope = 0;
                    }else{
                        slope = (points[i].y - points[j].y - 0.0)/(points[i].x - points[j].x - 0.0);
                    }
                    if(slopeMap.containsKey(slope)){
                        int temp = slopeMap.get(slope) + 1;
                        slopeMap.put(slope,temp);
                    }else{
                        slopeMap.put(slope,1);
                    }
                    currentTotal = Math.max(currentTotal, slopeMap.get(slope));
                }
            }
            currentTotal = Math.max(currentTotal, paraY);
            if(maxNum < (currentTotal+samePointNum)){
                maxNum = currentTotal + samePointNum;
            }
        }
        return maxNum + 1;
    }
}