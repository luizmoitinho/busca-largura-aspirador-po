
class Vertex {
	public char label;
	public boolean wasVisited;
	public int position;
	public int[] trash;

	public Vertex(char lab, int position, int[]trash) {
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
	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	

	public String ToString() {
		return  " - Label: " + this.label + 
				" | wasVisited: " + this.wasVisited+
				" | Pos: "+this.getPosition()+
				" | trash {"+this.isClean(0)+", "+this.isClean(1)+"}";
		
	}
	

}
