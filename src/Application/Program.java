package Application;

import TAD.Graph;
import TAD.Vertex;

public class Program {

	public static void main(String[] args) {
		Graph graph = new Graph();
		
		System.out.println("\n Lista de vértices \n");
		
		graph.addVertex('0');
		graph.addVertex('1');
		graph.addVertex('2');
		graph.addVertex('3');
		graph.addVertex('4');
		graph.addVertex('5');
		graph.addVertex('6');
		graph.addVertex('7');
		
		
		graph.showListVertex();
		graph.addEdge(0, 0); //0 -> 0
		graph.addEdge(0, 1); //0 -> 1
		graph.addEdge(0, 2); //0 -> 2
		
		graph.addEdge(1, 1); //1 -> 1
		graph.addEdge(1, 0); //1 -> 0
		graph.addEdge(1, 5); //1 -> 5
		
		graph.addEdge(2, 2); //2 -> 2
		graph.addEdge(2,3);  //2 -> 3

		graph.addEdge(3, 3); //3 -> 3
		graph.addEdge(3, 2); //3 -> 2
		graph.addEdge(3, 7); //3 -> 7
		
		graph.addEdge(4, 4); //4 -> 4
		graph.addEdge(4, 3); //4 -> 3
		graph.addEdge(4, 6); //4 -> 6
		
		graph.addEdge(5, 5); //5 -> 5
		graph.addEdge(5, 4); //5 -> 4

		
		System.out.println("\n Matriz de adjacência \n");
		graph.showAdjMat();
		
		
	}

}
