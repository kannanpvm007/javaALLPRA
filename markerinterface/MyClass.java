public class MyClass implements MyMarker {
 
    public void doFunnyStuff() {
        if (this instanceof MyMarker)
            System.out.println("This is a marker type");
        else
            ; //do nothing
    }
 
}