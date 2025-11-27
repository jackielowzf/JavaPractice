package Chapter6;
import java.util.Arrays;

/*
 * Game: Eight Queens
 * The classic Eight Queens puzzle is to place eight queens on a chessboard such that 
 * no two queens can attack each other (i.e., no two queens are on the same row, same column,
 * or same diagonal). There are many possible solutions. Write a program that displays one such 
 * solution. A sample output is shown below: (according to textbook)
 */
public class Chapter6_22 {
	public static void main(String args[]) {
		
		double[][] points = {{-1, 3},
							{-1, -1},
							{1, 1},
							{2, 0.5},
							{2, -1},
							{3, 3},
							{4, 2},
							{4, -0.5}};
		
		//p1 and p2 are the indices in the points' array
		int p1 = 0, p2 = 1;
		double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);
		
		//Compute distance for every two points
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
				
				if (shortestDistance > distance) {
					p1 = i;
					p2 = j;
					shortestDistance = distance;
				}
			}
		}
		
		System.out.println("The closest two points are " +
				"(" + points[p1][0] + ", " + points[p1][1] + ") and (" +
				points[p2][0] + ", " + points[p2][1] + ")");
							
		

}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
	
}
