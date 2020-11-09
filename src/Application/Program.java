package Application;

import TAD.Graph;
import TAD.Vertex;

public class Program {

	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('G');
		graph.addVertex('M');
		graph.addVertex('R');
		
		graph.showListVertex();
		
		
	}

}
