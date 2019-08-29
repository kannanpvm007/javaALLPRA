class Bike {
    Bike() {
        System.out.println("starting");
    }
}

class Accelerator extends Bike {
    Accelerator() {
        super();

        System.out.println("moving");

    }
}

class Super2 {
    public static void main(String args[]) {
        new Accelerator();

    }
}