package TAD;


public class Vertex {
	
	protected char label;
	protected boolean wasVisited;
	
	protected char position;
	
	private static int[] trash = {1,1}; 
	
	public Vertex(char label) {
		this.label = label;
		wasVisited = false;
	}
	
	
	public void clean(int index){
		Vertex.trash[index] = 0;
	}
	
	public boolean isClean(int index) {
		return Vertex.trash[index] == 0;
	}
	
	public char getPosition() {
		return position;
	}

	public void setPosition(char position) {
		this.position = position;
	}
	

	

	
}
