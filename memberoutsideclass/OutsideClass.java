class OutsideClass {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass oi = oc.new InnerClass();
        System.out.println("serialno is:" + oi.getvalue());

    }
}