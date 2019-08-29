class OuterClass {
    private int serialno = 10;

    class InnerClass {
        int getvalue() {
            return serialno;
        }
    }

    void displayserialno() {
        InnerClass ic = new InnerClass();
        System.out.println("serialno is:" + ic.getvalue());
    }
}