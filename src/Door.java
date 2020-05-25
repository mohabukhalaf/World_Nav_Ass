public class Door implements lookable,checkable {
    private boolean open;
    private static int closeDoors=0;
    public Door(boolean open)
    {
        this.open=open;
        if(open==false)
            closeDoors++;
    }
    @Override
    public Object check() {
        return null;
    }

    @Override
    public void look() {

    }

    public static int getCloseDoors() {
        return closeDoors;
    }
}
