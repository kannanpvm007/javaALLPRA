public class StaticNested {
    public static void main(String[] args) {
        OuterClass.InnerClass oi = new OuterClass.InnerClass();
        System.out.println("serialno is:" + oi.getvalue());
    }
}