package TAD;

public class Graph {
	
	protected Vertex[] vertexList = new Vertex[8];
	protected int[][] adjMat = new int[8][8];
	private int nVerts = 0;
	

	public void addVertex(char lab) {
		this.vertexList[this.nVerts++] = new Vertex(lab);
		this.prepareAdjMat();
	}
	
	public void addEdge(int start, int end) {
		this.adjMat[start][end] = 1; 
		this.adjMat[end][start] = 1; 
		
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
	
	private void prepareAdjMat() {
		for(int i=0;i<this.adjMat.length;i++)
			for(int j=0;j<this.adjMat.length;j++) 
				this.adjMat[i][j] = -1;

	}
	

}
