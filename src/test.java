import java.util.LinkedList;

public class test {
    public static void main(String[] args) {
        Object[] room1={new Chest(),new Painting(),new Door(),new Mirror()};
        Object[] room2={new Door(),new Door(),new Mirror(),new Seller()};
        Object[] room3={new PlainWall(),new Painting(),new Door(),new Door()};
        Object[] room4={new Door(),new Door(),new Mirror(),new PlainWall()};
        Object[] room5={new Painting(),new Door(),new PlainWall(),new Door()};
       Room[] obj={new Room(room1,true),new Room(room2,true),new Room(room3,true),new Room(room4,true),new Room(room5,false)};
       Graph<Room> map=new Graph<Room>(obj);
       map.addEdge(0,1);
       map.addEdge(1,2);
       map.addEdge(2,3);
       map.addEdge(3,4);





    }
}
