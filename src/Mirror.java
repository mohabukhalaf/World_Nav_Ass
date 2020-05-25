public class Mirror implements lookable,checkable {
    Item item;
    public Mirror(Item item)
    {
this.item=item;
    }
    @Override
    public Object check() {
        return null;
    }

    @Override
    public void look() {

    }
}
