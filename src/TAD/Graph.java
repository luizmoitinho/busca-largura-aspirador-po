package TAD;

import java.util.ArrayList;

public class Graph {
	
	protected Vertex[] vertexList = new Vertex[8];
	protected int[][] adjMat = new int[8][8];
	private int nVerts = 0;
	private ArrayList<Integer> queue = new ArrayList<Integer>();

	public void addVertex(char lab) {
		this.vertexList[this.nVerts++] = new Vertex(lab);
		this.prepareAdjMat();
	}
	
	public void addEdge(int start, int end) {
		this.adjMat[start][end] = 1; 
		this.adjMat[end][start] = 1; 
		
	}
	
	public void displayVertex(int index) {
		System.out.printf(this.vertexList[index].label+" ");
	}
	
	public void bfs() {
		
		this.vertexList[0].wasVisited = true;
		this.displayVertex(0);
		queue.add(0);
		int v2;
		
		while(!queue.isEmpty()) {
			int v1 = queue.remove(0);
			while((v2 = this.getAdjUnvisitedVertex(v1)) != -1) {
				vertexList[v2].wasVisited = true;
				this.displayVertex(v2);
				queue.add(v2);
			}
		}
		
		for(int i=0;i<this.nVerts;i++)
			this.vertexList[i].wasVisited=false;
		
	}
	
	private int getAdjUnvisitedVertex(int vertex) {
		for(int i=0; i< this.adjMat[vertex].length;i++) {
			for(int j=0;j<this.nVerts;j++) {
				if(this.adjMat[vertex][i] == this.vertexList[i].label && this.vertexList[i].wasVisited)
					return i;
				
			}
		}	
		return 0;
	}
	
	
	private void prepareAdjMat() {
		for(int i=0;i<this.adjMat.length;i++)
			for(int j=0;j<this.adjMat.length;j++) 
				this.adjMat[i][j] = -1;

	}
	
	public void showEdgeVisited() {
		for(int i=0;i<this.vertexList.length;i++)
			System.out.printf("%4d"+this.vertexList[i]);
	}
	
	public void showListVertex() {
		for(int i = 0;i<this.nVerts;i++) {
			System.out.println("Index "+i+" - Label: "+this.vertexList[i].label+" | wasVisited: "+this.vertexList[i].wasVisited);
		}
		
	}
	
	public void showAdjMat() {
		for(int i=0;i<this.adjMat.length;i++) {
			for(int j=0;j<this.adjMat.length;j++) {
				System.out.printf("%4d",this.adjMat[i][j]);
			}
			System.out.println(" ");
		}
		
	}
	

	


	
}
