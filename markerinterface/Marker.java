public interface Mark{

}
public class Marks implements Mark{
    public void ref(){
        if(this instanceof Mark)
        System.out.println("this is marker interface");
        else
        ;//do nothing
    }
}
public class Marker{
    public static void main(String[] args) {
        Marks obj=new Marks();
        obj.ref();
    }
}