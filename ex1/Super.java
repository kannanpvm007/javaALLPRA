class Animal {
    void eat() {
        System.out.println("eating");
    }
}

class Lion extends Animal {
    void eat() {
        super.eat();
        System.out.println("eating meat");

    }

}

class Super {
    public static void main(String args[]) {
        Lion obj = new Lion();
        obj.eat();
    }
}