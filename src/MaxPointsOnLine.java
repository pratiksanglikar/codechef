import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class MaxPointsOnLine {
	
	static class Point {
		int x;
		int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Point other = (Point) obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}
	}
	
	static class Line {
		
		Double slope;
		Double c;
		
		public Line(Double slope, Double c) {
			this.slope = slope;
			this.c = c;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((c == null) ? 0 : c.hashCode());
			result = prime * result + ((slope == null) ? 0 : slope.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Line other = (Line) obj;
			if (c == null) {
				if (other.c != null)
					return false;
			} else if (!c.equals(other.c))
				return false;
			if (slope == null) {
				if (other.slope != null)
					return false;
			} else if (!slope.equals(other.slope))
				return false;
			return true;
		}
	}
	
	public static void main(String[] args) {
		
		Point p1 = new Point(1,1);
		Point p2 = new Point(3,2);
		Point p3 = new Point(5,3);
		Point p4 = new Point(4,1);
		Point p5 = new Point(2,3);
		Point p6 = new Point(1,4);
		
		List<Point> p = new ArrayList<Point>();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		p.add(p6);
		
		System.out.println(maxPointsPlane(p));
	}

	
	
	public static int maxPointsPlane(List<Point> points) {
		Map<Line, Set<Point>> lines = new HashMap<Line, Set<Point>>();
		
		for(int i = 0; i < points.size(); i++) {
			for(int j = 0; j < points.size(); j++) {
				if(i != j) {
					Double slope = getSlope(points.get(i), points.get(j));
					Double c = getC(points.get(i), slope);
					Line l = new Line(slope, c);
					//System.out.println(slope);
					if(lines.get(l) == null) {
						Set<Point> set = new HashSet<Point>();
						set.add(points.get(i));
						set.add(points.get(j));
						lines.put(l, set);
					} else {
						Set<Point> set = lines.get(l);
						set.add(points.get(i));
						set.add(points.get(j));
						lines.put(l, set);
					}
				}
			}
		}
		
		int maxPoints = Integer.MIN_VALUE;
		for(Map.Entry<Line, Set<Point>> entry: lines.entrySet()) {
			if(entry.getValue().size() > maxPoints) {
				maxPoints = entry.getValue().size();
			}
		}
		return maxPoints;
	}
	
	private static Double getC(Point point, Double slope) {
		//y = mx + c;
		return point.y - (point.x * slope);
	}



	private static Double getSlope(Point p1, Point p2) {
		int base = p2.x - p1.x;
		if(base == 0) {
			return Double.MAX_VALUE;
		}
		return (double) ((p2.y - p1.y) / base);
	}
}
