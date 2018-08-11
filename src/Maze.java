import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Maze {

	static class Vertex {
		int x;
		int y;
		
		public Vertex(int x, int y) {
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
			Vertex other = (Vertex) obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}



		public String toString() {
			return " " + this.x + "," + this.y + " ";
		}
	}
	
	static class Result {
		boolean result;
		List<Vertex> path;
		
		public Result(boolean result, List<Vertex> path) {
			this.result = result;
			this.path = path;
		}
	}
	
	public static void main(String[] args) {
		Maze m = new Maze();
		int[][] maze = {{1,0,0,0,0,0,1,1,0,0},{0,0,1,0,0,0,0,0,0,0},{1,0,1,0,0,1,1,0,1,1},{0,0,0,1,1,1,0,0,1,0}, 
			{0,1,1,0,0,0,0,0,0,0},{0,1,1,0,0,1,0,1,1,0},{0,0,0,0,1,0,0,0,0,0},{1,0,1,0,1,0,1,0,0,0}
			,{1,0,1,1,0,0,0,1,1,1},{0,0,0,0,0,0,0,1,1,0}};
		List<Vertex> path = m.findPath(maze, new Vertex(9 , 0), new Vertex(0, 9));
		for(Vertex v: path) {
			System.out.print(v + " --> ");
		}
		System.out.print(new Vertex(0, 9));
	}
	
	private Map<Vertex, Set<Vertex>> buildGraph(int[][] maze) {
		Map<Vertex, Set<Vertex>> graph = new HashMap<Vertex, Set<Vertex>>();
		int width = maze[0].length;
		int height = maze.length;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if(maze[i][j] == 0) {
					Vertex source = new Vertex(i, j);
					Set<Vertex> set = graph.get(source);
					if(set == null) {
						set = new HashSet<Vertex>();
					}
					if(i > 0 && maze[i-1][j] == 0) {
						set.add(new Vertex(i-1, j));
					}
					if(i < height - 1 && maze[i + 1][j] == 0) {
						set.add(new Vertex(i+1, j));
					}
					if(j > 0 && maze[i][j-1] == 0) {
						set.add(new Vertex(i, j-1));
					}
					if(j < width - 1 && maze[i][j+1] == 0) {
						set.add(new Vertex(i, j+1));
					}
					graph.put(source, set);
				}
			}
		}
		return graph;
	}
	
	public List<Vertex> findPath(int[][] maze, Vertex s, Vertex e) {
		List<Vertex> path = new ArrayList<>();
		Map<Vertex, Set<Vertex>> graph = buildGraph(maze);
		Set<Vertex> visited = new HashSet<Vertex>();
		Result result = findPath(graph, s, e, visited, path); 
		if(result.result) {
			return result.path;
		}
		return Collections.emptyList();
	}
	
	private Result findPath(Map<Vertex, Set<Vertex>> graph, Vertex s, Vertex e, Set<Vertex> visited, List<Vertex> path) {
		path.add(s);
		Set<Vertex> al = graph.get(s);
		if(al == null) {
			return new Result(false, null);
		}
		for(Vertex v: al) {
			if(v.equals(e)) {
				return new Result(true, path);
			}
			if(!visited.contains(v)) {
				visited.add(v);
				Result result = findPath(graph, v, e, visited, path); 
				if(result.result) {
					return new Result(true, path);
				}
			}
		}
		path.remove(s);
		return new Result(false, null);
	}
}
