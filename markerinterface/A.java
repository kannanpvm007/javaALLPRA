interface Student {
    void studying();
}

interface Person extends Student {
    void eat();
}

class A implements Person {
    public void studying() {
        System.out.println("in college");
    }

    public void eat() {
        System.out.println("vegetables");
    }

    public static void main(String[] args) {
        Person obj = new A();
        obj.studying();
        obj.eat();
    }
}
