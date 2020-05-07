import java.rmi.UnexpectedException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Graph {
    LinkedList<HashMap>[] graph;
    public Graph(int n)
    {
        if(n<=0)
            throw new IllegalArgumentException();
        graph=new LinkedList[n];
        for(int i=0;i<n;i++)
        {
            graph[i]=new LinkedList<HashMap>();
        }
        for(int i=0;i<n;i++)
        {
           graph[i]=new LinkedList<>();
        }
        Map m=new HashMap (4);
        m.put(0,new Door());
        m.put(1,new Painting());
        m.put(2,new Mirror());
        m.put(3,new Chest());
        for(int i=0;i<n-1;i++)
        {
           graph[i].add((HashMap) m);

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
