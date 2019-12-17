package Math;

public class Solution812 {
    public double largestTriangleArea(int[][] points) {
        double area = 0;
        for (int i =0;i < points.length;i++)
            for (int j = i+1;j < points.length;j++)
                for (int k = j+1;k < points.length;k++){
                    area = Math.max(area,Math.abs((points[i][0] - points[k][0]) * (points[j][1] - points[k][1]) - (points[j][0] - points[k][0]) * (points[i][1] - points[k][1])) * 0.5);
                }
        return area;
    }
}
