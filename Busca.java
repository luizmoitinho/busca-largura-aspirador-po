class Busca
   {
   public static void main(String[] args){
       
      Graph theGraph = new Graph();
  
	  	theGraph.addVertex('A', 'L', new int[] {1,1}); // 0
		theGraph.addVertex('B', 'R', new int[] {1,1}); // 1
		theGraph.addVertex('C', 'L', new int[] {0,1}); // 2
		theGraph.addVertex('D', 'R', new int[] {0,1}); // 3
		theGraph.addVertex('E', 'L', new int[] {1,0}); // 4
		theGraph.addVertex('F', 'R', new int[] {1,0}); // 5
		theGraph.addVertex('G', 'L', new int[] {0,0}); // 6
		theGraph.addVertex('H', 'R', new int[] {0,0}); // 7
		
		theGraph.showListVertex();
	  
		theGraph.addEdge(0, 0); //A -> A
		theGraph.addEdge(0, 1); //A -> B
		theGraph.addEdge(0, 2); //A -> C
		
		theGraph.addEdge(1, 1); //B -> B
		theGraph.addEdge(1, 0); //B -> A
		theGraph.addEdge(1, 5); //B -> F
		
		theGraph.addEdge(2, 2); //C -> C
		theGraph.addEdge(2, 3); //C -> D
	
		theGraph.addEdge(3, 3); //D -> D
		theGraph.addEdge(3, 2); //D -> C
		theGraph.addEdge(3, 7); //D -> H
		
		theGraph.addEdge(4, 4); //E -> E
		theGraph.addEdge(4, 5); //E -> F
		theGraph.addEdge(4, 6); //E -> G
		
		theGraph.addEdge(5, 5); //F -> F
		theGraph.addEdge(5, 4); //F -> E
		
		theGraph.addEdge(6, 6); //G -> G
		theGraph.addEdge(5, 4); //G -> H
		
		theGraph.addEdge(7, 7); //H -> G
		theGraph.addEdge(7, 6); //h -> G
		
	
		System.out.print("\nNos Visitados LARGURA: ");
		theGraph.bfs(); 
      
      
//      System.out.print("Nos Visitados PROFUNDIDADE: ");
//      theGraph.dfs();  
 
//      System.out.print("\nArvore Geradora Minima: ");
//      theGraph.mst();  
//
//      System.out.println();
      
      }
   } 