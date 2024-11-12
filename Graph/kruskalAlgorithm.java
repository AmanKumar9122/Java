// import required classes and packages  
import java.util.*;  
  
// create KruskalAlgorithm class to create minimum spanning tree of the given graph  
class kruskalAlgorithm {  
    //create class Edge to create an edge of the graph that implements Comparable interface   
    class Edge implements Comparable<Edge> {  
        int source, destination, weight;  
  
        public int compareTo(Edge edgeToCompare) {  
            return this.weight - edgeToCompare.weight;  
        }  
    };  
  
    // create class Subset for union  
    class Subset {  
        int parent, value;  
    };  
      
    //initialize vertices, edges and edgeArray  
    int vertices, edges;  
    Edge edgeArray[];  
  
    // using constructor to create a graph  
    kruskalAlgorithm(int vertices, int edges) {  
        this.vertices = vertices;  
        this.edges = edges;  
        edgeArray = new Edge[this.edges];  
        for (int i = 0; i < edges; ++i)  
            edgeArray[i] = new Edge();  //create edge for all te edges given by the user  
    }  
      
    // create applyKruskal() method for applying Kruskal's Algorithm  
    void applykruskal() {  
          
        // initialize finalResult array to store the final MST  
        Edge finalResult[] = new Edge[vertices];  
        int newEdge = 0;  
        int index = 0;  
        for (index = 0; index < vertices; ++index)  
            finalResult[index] = new Edge();  
  
        // using sort() method for sorting the edges  
        Arrays.sort(edgeArray);  
          
        // create an array of the vertices of type Subset for the subsets of vertices  
        Subset subsetArray[] = new Subset[vertices];  
          
        // allocate memory to create vertices subsets  
        for (index = 0; index < vertices; ++index)  
            subsetArray[index] = new Subset();  
  
        // it is used to create subset with single element  
        for (int vertex = 0; vertex < vertices; ++vertex) {  
            subsetArray[vertex].parent = vertex;  
            subsetArray[vertex].value = 0;  
        }  
        index = 0;  
          
        // use for loop to pick the smaller edge from the edges and increment the index for next iteration  
        while (newEdge < vertices - 1) {  
            // create an instance of Edge for next edge  
            Edge nextEdge = new Edge();  
            nextEdge = edgeArray[index++];  
              
            int nextSource = findSetOfElement(subsetArray, nextEdge.source);  
            int nextDestination = findSetOfElement(subsetArray, nextEdge.destination);  
              
            //if the edge doesn't create cycle after including it, we add it in the result and increment the index  
            if (nextSource != nextDestination) {  
                finalResult[newEdge++] = nextEdge;  
                performUnion(subsetArray, nextSource, nextDestination);  
            }  
        }  
        for (index = 0; index < newEdge; ++index)  
            System.out.println(finalResult[index].source + " - " + finalResult[index].destination + ": " + finalResult[index].weight);  
    }  
      
    // create findSetOfElement() method to get set of an element  
    int findSetOfElement(Subset subsetArray[], int i) {  
        if (subsetArray[i].parent != i)  
            subsetArray[i].parent = findSetOfElement(subsetArray, subsetArray[i].parent);  
        return subsetArray[i].parent;  
    }  
      
    // create performUnion() method to perform union of two sets  
    void performUnion(Subset subsetArray[], int sourceRoot, int destinationRoot) {  
          
        int nextSourceRoot = findSetOfElement(subsetArray, sourceRoot);  
        int nextDestinationRoot = findSetOfElement(subsetArray, destinationRoot);  
  
        if (subsetArray[nextSourceRoot].value < subsetArray[nextDestinationRoot].value)  
            subsetArray[nextSourceRoot].parent = nextDestinationRoot;  
        else if (subsetArray[nextSourceRoot].value > subsetArray[nextDestinationRoot].value)  
            subsetArray[nextDestinationRoot].parent = nextSourceRoot;  
        else {  
            subsetArray[nextDestinationRoot].parent = nextSourceRoot;  
            subsetArray[nextSourceRoot].value++;  
        }  
    }  
  
    //main() method starts  
    public static void main(String[] args) {  
          
        int v, e;  
        //create scanner class object to get input from user  
        Scanner sc = new Scanner(System.in);  
          
        //show custom message  
        System.out.println("Enter number of vertices: ");  
          
        //store user entered value into variable v  
        v = sc.nextInt();  
          
        //show custom message  
        System.out.println("Enter number of edges");  
          
        //store user entered value into variable e  
        e = sc.nextInt();  
          
        kruskalAlgorithm graph = new kruskalAlgorithm(v, e);        // use for creating Graph  
          
        for(int i = 0; i < e; i++){  
            System.out.println("Enter source value for edge["+ i +"]");  
            graph.edgeArray[i].source = sc.nextInt();  
              
            System.out.println("Enter destination value for edge["+ i +"]");  
            graph.edgeArray[i].destination = sc.nextInt();  
              
            System.out.println("Enter weight for edge["+i+"]");  
            graph.edgeArray[i].weight = sc.nextInt();  
        }  
          
        // call applykruskal() method to get MST  
        graph.applykruskal();  
    }  
}  


//Output
// Enter number of vertices: 
// 6
// Enter number of edges
// 8
// Enter source value for edge[0]
// 0
// Enter destination value for edge[0]
// 1
// Enter weight for edge[0]
// 7
// Enter source value for edge[1]
// 1
// Enter source value for edge[3]
// 3
// Enter destination value for edge[3]        
// 4
// Enter weight for edge[3]
// 2
// Enter source value for edge[4]
// 4
// Enter destination value for edge[4]        
// 5
// Enter weight for edge[4]
// 3
// Enter source value for edge[5]
// 5
// Enter destination value for edge[5]        
// 0
// Enter weight for edge[5]
// 8
// Enter source value for edge[6]
// 1
// Enter destination value for edge[6]        
// 5
// Enter weight for edge[6]
// 3
// Enter source value for edge[7]
// 2
// Enter destination value for edge[7]        
// 4
// Enter weight for edge[7]
// 2
// 3 - 4: 2
// 2 - 4: 2
// 4 - 5: 3
// 1 - 5: 3
// 0 - 1: 7