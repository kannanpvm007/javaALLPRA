class Address {
    int streetno;
    String city;
    String state;
    String country;

    Address(int strno, String c, String st, String coun) {
        this.streetno = strno;
        this.city = c;
        this.state = st;
        this.country = coun;
    }
}

class Student {
    int rollno;
    String studentname;
    Address studentAddr;

    Student(int roll, String name, Address addr) {
        this.rollno = roll;
        this.studentname = name;
        this.studentAddr = addr;
    }

    public static void main(String[] args) {
        Address ad = new Address(30, "cbe", "tamilnadu", "india");
        Student stu = new Student(101, "sasikumar", ad);
        System.out.println(stu.rollno);
        System.out.println(stu.studentname);
        System.out.println(stu.studentAddr.streetno);
        System.out.println(stu.studentAddr.city);
        System.out.println(stu.studentAddr.state);
        System.out.println(stu.studentAddr.country);

    }
}