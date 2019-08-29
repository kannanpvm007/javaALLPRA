public class AnonymousExample {

    public static void main(String[] args) {
        Driving d = new Driving() {
            public void drive(String msg) {
                System.out.println(msg);
            }
        };
        d.drive("Driving Car");
    }
}