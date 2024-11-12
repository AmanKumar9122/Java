// Import required classes and packages
import java.util.*;

// Creating MinimumSpanningTreeExample class to implement Prim's algorithm in Java
class prims {
    // Define the count of vertices available in the graph
    private int countOfVertices;

    // Constructor to initialize the number of vertices
    public prims(int vertices) {
        this.countOfVertices = vertices;
    }

    // Create findMinKeyVertex() method for finding the vertex v that has minimum key-value and that is not added MST yet
    int findMinKeyVertex(int keys[], Boolean setOfMST[]) {
        // Initialize min value and its index
        int minimum_index = -1;
        int minimum_value = Integer.MAX_VALUE;

        // Iterate over all vertices to find minimum key-value vertex
        for (int vertex = 0; vertex < countOfVertices; vertex++) {
            if (!setOfMST[vertex] && keys[vertex] < minimum_value) {
                minimum_value = keys[vertex];
                minimum_index = vertex;
            }
        }

        return minimum_index;
    }

    // Create showMinimumSpanningTree for printing the constructed MST stored in mstArray[]
    void showMinimumSpanningTree(int mstArray[], int graphArray[][]) {
        System.out.println("Edge \t\t Weight");
        for (int j = 1; j < countOfVertices; j++)
            System.out.println(mstArray[j] + " <-> " + j + "\t \t" + graphArray[j][mstArray[j]]);
    }

    // Create designMST() method for constructing and printing the MST
    void designMST(int graphArray[][]) {
        int mstArray[] = new int[countOfVertices];
        int keys[] = new int[countOfVertices];
        Boolean setOfMST[] = new Boolean[countOfVertices];

        for (int j = 0; j < countOfVertices; j++) {
            keys[j] = Integer.MAX_VALUE;
            setOfMST[j] = false;
        }

        keys[0] = 0; // Start from the first vertex
        mstArray[0] = -1; // Root of MST

        for (int i = 0; i < countOfVertices - 1; i++) {
            int edge = findMinKeyVertex(keys, setOfMST);
            setOfMST[edge] = true;

            for (int vertex = 0; vertex < countOfVertices; vertex++) {
                if (graphArray[edge][vertex] != 0 && !setOfMST[vertex] && graphArray[edge][vertex] < keys[vertex]) {
                    mstArray[vertex] = edge;
                    keys[vertex] = graphArray[edge][vertex];
                }
            }
        }

        showMinimumSpanningTree(mstArray, graphArray);
    }

    // main() method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the number of vertices as input
        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();
        prims mst = new prims(vertices);

        // Initialize the graph adjacency matrix
        int[][] graphArray = new int[vertices][vertices];

        // Take the number of edges as input
        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();

        // Input each edge and its weight
        System.out.println("Enter each edge in the format: vertex1 vertex2 weight");
        for (int i = 0; i < edges; i++) {
            System.out.print("Edge " + (i + 1) + ": ");
            int vertex1 = scanner.nextInt();
            int vertex2 = scanner.nextInt();
            int weight = scanner.nextInt();
            graphArray[vertex1][vertex2] = weight;
            graphArray[vertex2][vertex1] = weight; // For undirected graph
        }

        // Print the Minimum Spanning Tree solution
        mst.designMST(graphArray);

        scanner.close();
    }
}


//Output

// Enter the number of vertices: 6
// Enter the number of edges: 8
// Enter each edge in the format: vertex1 vertex2 weight
// Edge 1: 0 1 7
// Edge 2: 1 2 6
// Edge 3: 2 3 5 
// Edge 4: 3 4 2
// Edge 5: 4 5 3 
// Edge 6: 5 0 8
// Edge 7: 1 5 3
// Edge 8: 2 4 2
// Edge             Weight
// 0 <-> 1         7
// 4 <-> 2         2
// 4 <-> 3         2
// 5 <-> 4         3
// 1 <-> 5         3
