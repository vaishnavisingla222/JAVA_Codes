import java.util.ArrayList;

class CycleDetection_1//UnDirected graph
{    
    static class Edge
    {
        int src;//source
        int dest;//destination

        public Edge(int s,int d)
        {
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[])
    {
        int len=graph.length;
        for(int i=0;i<len;i++)
            graph[i]=new ArrayList<Edge>();

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,4));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        //graph[1].add(new Edge(1,4));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,2));
        //graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,5));
        graph[5].add(new Edge(5,4));
    }
    public static boolean cycleCheck(ArrayList<Edge> graph[],boolean visited[],int curr,int parent)
    {
        visited[curr]=true;

        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(visited[e.dest]==true && e.dest!=parent)
                return true;
            else if(visited[e.dest]==false)
            {
                if(cycleCheck(graph, visited, e.dest, curr))
                    return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        int vertex=6;
        ArrayList<Edge> graph[]=new ArrayList[vertex];
        createGraph(graph);

        boolean visited[]=new boolean[vertex];
        if(cycleCheck(graph,visited,0,-1))
            System.out.println("Cycle is present");
        else
            System.out.println("Cycle is not present");
    }
}
