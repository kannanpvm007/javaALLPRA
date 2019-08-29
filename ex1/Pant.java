class Shirt{
    void brand(){
        System.out.println("levis");
    }
}
class Pant extends Shirt{
    void brand(){
        System.out.println("uspa");
    }
    public static void main(String args[]){
        Pant obj=new Pant();
        obj.brand();
    }
}
