class OuterClass {
    private int Serialno = 15;

    void getValue() {
        class InnerClass {
            void display() {
                System.out.println("serial no is:" + Serialno);
            }
        }
        InnerClass ic = new InnerClass();
        ic.display();
    }
}