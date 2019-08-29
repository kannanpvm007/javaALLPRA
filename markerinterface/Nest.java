interface World{
    void show();
    interface Country{
        void display();
    }
}
class Nest implements World.Country{
    //public void show(){
      //  System.out.println("it is nested interface");
    //}
    public void display(){
        System.out.println("it is nest interface");
    }
    public static void main(String[] args) {
        World.Country msg=new Nest();
        //msg.show();
        msg.display();
        
    }
}