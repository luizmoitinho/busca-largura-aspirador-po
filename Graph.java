import java.util.Random;

class Graph {
	private final int MAX_VERTS = 8;
	private Vertex vertexList[];
	private int adjMat[][];
	private int nVerts;
	private StackX theStack;
	private Queue theQueue;

// ------------------------------------------------------------
	public Graph() {
		vertexList = new Vertex[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		
		for (int y = 0; y < MAX_VERTS; y++)
			for (int x = 0; x < MAX_VERTS; x++)
				adjMat[x][y] = 0;

		theStack = new StackX();
		theQueue = new Queue();

	}

// ------------------------------------------------------------
	public void addVertex(char lab,int position, int[]trash) {
		vertexList[nVerts++] = new Vertex(lab,position, trash);
	}

// ------------------------------------------------------------
	public void addEdge(int start, int end, boolean digrafo) {
		adjMat[start][end] = 1;
		if(digrafo)
			adjMat[end][start] = 1;
	}

// ------------------------------------------------------------
	public void displayVertex(int v) {
		System.out.print(vertexList[v].label);
	}

// -------------------------------------------------------------
	public void bfs() {
		int initialState = getRandomNumber(0, 7);
		System.out.println("\nEstado inicial gerado aleatoriamente: "+initialState);
		vertexList[initialState].wasVisited = true;
		displayVertex(initialState);
		theQueue.insert(initialState);
		int v2;

		while (!theQueue.isEmpty()) {
			int v1 = theQueue.remove();
			while ((v2 = getAdjUnvisitedVertex(v1)) != -1) {
				
				vertexList[v2].wasVisited = true;
				//System.out.println("\n\n"+vertexList[v2].ToString());
				displayVertex(v2);
				theQueue.insert(v2);
				if((vertexList[v2].isClean(0) && (vertexList[v2].isClean(1))))
						return;
			}
		}
		

		for (int j = 0; j < nVerts; j++)
			vertexList[j].wasVisited = false;
	}

// ------------------------------------------------------------
	public void dfs() {
		vertexList[0].wasVisited = true;
		displayVertex(0);
		theStack.push(0);

		while (!theStack.isEmpty()) {
			int v = getAdjUnvisitedVertex(theStack.peek());
			if (v == -1)
				theStack.pop();
			else {
				vertexList[v].wasVisited = true;
				displayVertex(v);
				theStack.push(v);
			}
		}

		for (int j = 0; j < nVerts; j++)
			vertexList[j].wasVisited = false;
	}

// -------------------------------------------------------------
	public void mst() {
		vertexList[0].wasVisited = true;
		theStack.push(0);

		while (!theStack.isEmpty()) {
			int currentVertex = theStack.peek();
			int v = getAdjUnvisitedVertex(currentVertex);
			if (v == -1)
				theStack.pop();
			else {
				vertexList[v].wasVisited = true;
				theStack.push(v);

				displayVertex(currentVertex);
				displayVertex(v);
				System.out.print(" ");
			}
		}

		for (int j = 0; j < nVerts; j++)
			vertexList[j].wasVisited = false;
	}

// ------------------------------------------------------------- 
	public int getAdjUnvisitedVertex(int v) {
		for (int j = 0; j < nVerts; j++)
			if (adjMat[v][j] == 1 && vertexList[j].wasVisited == false)
				return j;
		return -1;
	}
// ------------------------------------------------------------

	public void showAdjMat() {
		System.out.printf("    ");
		for (int i = 0; i < this.adjMat.length; i++)
			System.out.printf("%7d", i);
		System.out.println(" \n");
		for (int i = 0; i < this.adjMat.length; i++) {
			System.out.printf("%4d", i);
			for (int j = 0; j < this.adjMat.length; j++) {
				System.out.printf("%7d", this.adjMat[i][j]);
			}
			System.out.println(" ");
		}

	}

	public void showListVertex() {
		for (int i = 0; i < this.nVerts; i++) {
			System.out.println("Index " + i + " - Label: " + this.vertexList[i].label + " | wasVisited: "
					+ this.vertexList[i].wasVisited+" | Pos: "+this.vertexList[i].getPosition()+
					" | trash {"+this.vertexList[i].isClean(0)+", "+this.vertexList[i].isClean(1)+"}");
		}

	}
	
	public int getRandomNumber(int min, int max) {
		Random rnd = new Random();
		return rnd.nextInt((max - min) + 1) + min;
	}

}