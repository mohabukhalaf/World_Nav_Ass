import java.rmi.UnexpectedException;
import java.util.LinkedList;
import java.util.Map;

public class Graph {
    LinkedList<Integer>[] graph;
    public Graph(int n)
    {
        if(n<=0)
            throw new IllegalArgumentException();
        graph=new LinkedList[n];
        for(int i=0;i<n;i++)
        {
            graph[i]=new LinkedList<Integer>();
        }
        for(int i=1;i<n;i++)
        {
            graph[i-1].add(i);
            graph[i].add(i-1);

        }


    }
    public void display()
    {
        for(int i=0;i<graph.length;i++)
        {
            System.out.print(i +" -->");
            for(int r=0;r<graph[i].size();r++)
            {
                System.out.print(graph[i].get(r)+"  ");

            }
            System.out.println();
        }
    }



}
