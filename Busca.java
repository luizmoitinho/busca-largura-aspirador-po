class Busca
   {
   public static void main(String[] args){
       
      Graph theGraph = new Graph();
  
	  	theGraph.addVertex('A', 0, new int[] {1,1}); // 0
		theGraph.addVertex('B', 1, new int[] {1,1}); // 1
		theGraph.addVertex('C', 0, new int[] {0,1}); // 2
		theGraph.addVertex('D', 1, new int[] {0,1}); // 3
		theGraph.addVertex('E', 0, new int[] {1,0}); // 4
		theGraph.addVertex('F', 1, new int[] {1,0}); // 5
		theGraph.addVertex('G', 0, new int[] {0,0}); // 6
		theGraph.addVertex('H', 1, new int[] {0,0}); // 7
		
	  
		theGraph.addEdge(0, 0, true); //A -> A
		theGraph.addEdge(0, 1, true); //A -> B
		theGraph.addEdge(0, 2, false); //A -> C
		
		theGraph.addEdge(1, 1, true); //B -> B
		theGraph.addEdge(1, 0, true); //B -> A
		theGraph.addEdge(1, 4, false); //B -> E
		
		theGraph.addEdge(2, 2, true); //C -> C
		theGraph.addEdge(2, 3, true); //C -> D
	
		theGraph.addEdge(3, 3, true); //D -> D
		theGraph.addEdge(3, 2, true); //D -> C
		theGraph.addEdge(3, 7, false); //D -> H
		
		theGraph.addEdge(4, 4, true); //E -> E
		theGraph.addEdge(4, 5, true); //E -> F
		theGraph.addEdge(4, 6, false); //E -> G
		
		theGraph.addEdge(5, 5, true); //F -> F
		theGraph.addEdge(5, 4, true); //F -> E
		
		theGraph.addEdge(6, 6, true); //G -> G
		
		theGraph.addEdge(7, 7, true); //H -> h

		theGraph.showAdjMat();
		
	
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