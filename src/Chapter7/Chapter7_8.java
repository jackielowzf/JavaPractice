package Chapter7;
/*
 * Chapter 7.8
 * (All closest pairs of points) Revise Listing 7.3, FindNearestPoints.java, to find all closest pairs of points with the same minimum distance.
 */
public class Chapter7_8 {
	public static void main(String args[]) {
		double[][] points = {{-1, 3},
							 {-1, -1},
							 {1, 1},
							 {2, 0.5},
							 {2, -1},
							 {3, 3},
							 {4, 2},
							 {4, -0.5}};
		
		int p1 = 0, p2 =1;
		double shortestDistance = distance(points[p1][0], points[p1][1],
				points[p2][0], points[p2][1]);
		
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1],
						points[j][0], points[j][1]);
				
				if (shortestDistance > distance) {
					p1 = i;
					p2 = j;
					shortestDistance = distance;
				}
			}
		}
		
		System.out.println("The closest two points are: ");
		
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1],
						points[j][0], points[j][1]);
				
				if (shortestDistance == distance) {
					System.out.println("(" + points[i][0] + ", " + points[i][1] + ") and (" +
							points[j][0] + ", " + points[j][1] + ")");
					
					
				}
			}
		}
		
		
				
	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 -x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

}
