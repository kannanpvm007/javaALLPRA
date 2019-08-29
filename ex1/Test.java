class Car {
    String color = "red";
}

class Engine extends Car {
    String color = "white";

    void printColor() {
        System.out.println(color);

        System.out.println(super.color);

    }
}

class Test {
    public static void main(String[] args) {
        Engine e = new Engine();
        e.printColor();
    }

}