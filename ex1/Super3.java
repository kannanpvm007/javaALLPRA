class Student{
    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class Emp extends Student{
    float fee;
    Emp(int id,String name,float fee){
        super(id,name);
        this.fee=fee;
    }
    void show(){
        System.out.println(id+" "+name+" "+fee);
    }
}
class Super3{
    public static void main(String args[]) {

        Emp obj=new Emp(101,"Sasikumar",10000f);
        obj.show();
        
    }
}