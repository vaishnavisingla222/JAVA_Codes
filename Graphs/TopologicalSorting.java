import java.util.ArrayList;
import java.util.Stack;

class TopologicalSorting//Implimented for Directed Acyclic Grapgh
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

        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,0));
        graph[5].add(new Edge(5,2));
        graph[5].add(new Edge(5,0));
    }
    public static void sort(ArrayList<Edge> graph[],boolean visited[],int curr,Stack<Integer> st)
    {
        visited[curr]=true;

        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(visited[e.dest]==false)
                sort(graph,visited,e.dest,st);
        }
        st.push(curr);
        return;
    }
    public static void main(String args[])
    {
        int vertex=6;
        ArrayList<Edge> graph[]=new ArrayList[vertex];
        createGraph(graph);

        boolean visited[]=new boolean[vertex];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<vertex;i++)
        {
            if(visited[i]==false)
            sort(graph,visited,i,st);
        }
        while(!st.isEmpty())
            System.out.print(st.pop()+" ");
        System.out.println();
    } 
}
