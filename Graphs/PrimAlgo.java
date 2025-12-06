import java.util.*;
/*
Prim’s Algorithm gives a Minimum Spanning Tree (MST) with set of edges such that
With minimum total weight
That connects all vertices
With NO cycles
And exactly V-1 edges
*/
public class PrimAlgo 
{
    static class Edge 
    {
        int src;
        int dest;
        int weight;
        Edge(int s,int d,int w) 
        {
            this.src=s;
            this.dest=d;
            this.weight=w;
        }
    }
    public static void createGraph(List<Edge> graph) 
    {
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));
        graph.add(new Edge(1, 2, 1));
        graph.add(new Edge(1, 3, 7));
        graph.add(new Edge(2, 4, 3));
        graph.add(new Edge(3, 4, 5));
    }
    public static void primAlgo(List<Edge> edges, int vertex) 
    {
        List<List<int[]>>adj=new ArrayList<>();
        for(int i=0;i<vertex;i++)
            adj.add(new ArrayList<>());

        for (Edge e : edges) 
        {
            adj.get(e.src).add(new int[]{e.dest,e.weight});
            adj.get(e.dest).add(new int[]{e.src,e.weight});
        }
        int start=0;
        int[] key=new int[vertex];
        int[] parent=new int[vertex];
        boolean[] inMST=new boolean[vertex];
        for(int i=0;i<vertex;i++)
        {
            key[i]=Integer.MAX_VALUE;
            parent[i]=-1;
            inMST[i]=false;
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        key[start]=0;
        pq.offer(new int[]{0,start});
        while (!pq.isEmpty()) 
        {
            int[] top=pq.poll();
            int u=top[1];
            if (inMST[u]) 
                continue;

            inMST[u]=true;

            for (int[] nb : adj.get(u)) 
            {
                int v=nb[0];
                int wt=nb[1];
                if (!inMST[v] && wt<key[v]) 
                {
                    key[v]=wt;
                    parent[v]=u;
                    pq.offer(new int[]{key[v],v});
                }
            }
        }
        int mstWeight=0;
        System.out.println("Prim's MST edges:");
        for (int v=0;v<vertex;v++) 
        {
            if (parent[v]!=-1) 
            {
                System.out.println(parent[v]+" to "+v+" -> weight="+key[v]);
                mstWeight+=key[v];
            }
        }
        System.out.println("Total weight of MST=" + mstWeight);
    }
    public static void main(String[] args) 
    {
        int vertex=5;
        List<Edge> graph=new ArrayList<>();
        createGraph(graph);
        primAlgo(graph, vertex);
    }
}
