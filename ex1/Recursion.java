class Recursion {
    static int count = 0;

    static void rec() {
        count++;
        if (count <= 5) {
            System.out.println("sasikumar" + count);
            rec();
        }
    }

    public static void main(String args[]) {
        rec();
    }
}