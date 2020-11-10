
class Vertex {
	public char label;
	public boolean wasVisited;
	public char position;
	public int[] trash;

	public Vertex(char lab,char position, int[]trash) {
		this.label = lab;
		this.position = position;
		this.trash = trash;
		
		wasVisited = false;
		
	}

	public void clean(int index) {
		this.trash[index] = 0;
	}

	public boolean isClean(int index) {
		return this.trash[index] == 0;
	}
	
	public char getPosition() {
		return position;
	}

	public void setPosition(char position) {
		this.position = position;
	}
	

	public String ToString() {
		return  " - Label: " + this.label + 
				" | wasVisited: " + this.wasVisited+
				" | Pos: "+this.getPosition()+
				" | trash {"+this.isClean(0)+", "+this.isClean(1)+"}";
		
	}
	

}
