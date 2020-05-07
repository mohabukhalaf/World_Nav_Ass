import java.rmi.UnexpectedException;
import java.util.*;

public class Senario {
   Map[] rooms;
  final int n=5;
   public Senario()
   {
       if(n<=0)
          throw new IllegalArgumentException();
       rooms=new Map[n];
       ArrayList<Object> obj1=new ArrayList<Object>(5);
       obj1.add(new Mirror());
       obj1.add(new Mirror());
       obj1.add(new Seller());
       obj1.add(new Chest());
       obj1.add(new Painting());
      ArrayList<Object> obj2=new ArrayList<Object>(4);
      obj2.add(new Mirror());
      obj2.add(new Painting());
      obj2.add(new PlainWall());
      obj2.add(new PlainWall());



      Random random=new Random();
       for(int i=0;i<n;i++)
       {
          rooms[i]=new HashMap(4);
          if(i==0)
             rooms[i].put(0,new Door());
          else {
             rooms[i].put(0, new Door());
             rooms[i].put(1, new Door());
          }
          if(i<2)
          {
             for(int r=i+1;r<4;r++)
             {
                int rand=random.nextInt(obj1.size());
                rooms[i].put(r,obj1.get(rand));
                obj1.remove(rand);
             }
          }
          else if(i<n-1)
          {
             for(int r=2;r<4;r++)
             {
                int rand=random.nextInt(obj2.size());
                rooms[i].put(r,obj2.get(rand));
                obj2.remove(rand);

             }
          }
          else
          {
             rooms[i].put(2,new PlainWall());
             rooms[i].put(3,new PlainWall());
          }
       }
   }
   public void display()
   {
      for(int i=0;i<rooms.length;i++)
      {
         System.out.print(i+" -->");
         for(int r=0;r<rooms[i].size();r++)
         {
            System.out.print(rooms[i].get(r));
         }
         System.out.println();
      }
   }



}
