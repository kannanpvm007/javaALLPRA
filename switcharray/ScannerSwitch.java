import java.util.Scanner;

public class ScannerSwitch {
    static String a[] = new String[2];
    static int i;

    public static void main(String[] args) {
        System.out.println("1.Create" + '\n' + "2.Display" + '\n' + "3.FindName" + '\n' + "4.Update" + '\n' + "5.Delete"
                + '\n' + "6.Stop");
        options();
    }

    static void options() {
        System.out.println("Enter your option:");
        Scanner op = new Scanner(System.in);
        int ch = op.nextInt();
        switch (ch) {
        case 1:
            create();
            options();
            break;
        case 2:
            display();
            options();
            break;
        case 3:
            findName();
            options();
            break;
        case 4:
            update();
            options();
            break;
        case 5:
            delete();
            options();
            break;
        case 6:
            break;
        }
    }

    static void create() {
        System.out.println("1.Create");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter your name:");
            Scanner sname = new Scanner(System.in);
            // String s=sname.
            String name = sname.nextLine();
            a[i] = name;
        }
    }
    static void display() {
        System.out.println("2.Display");
        for( String disName : a) {
            System.out.println("Name:" + disName);
        }
    }
    static void findName() {
        System.out.println("3.Find Name");
        System.out.println("Type a name to findout:");
        Scanner fname = new Scanner(System.in);
        String name = fname.nextLine();
        
        for (String names : a) {
            if (name.equals(names)) {
                System.out.println("Can find:" + name);
            } else {
                System.out.println("Can't find:" + name);
            }
        }
    }
    static void update() {
        System.out.println("4.Update Name");
        System.out.print("Type a name to change:");
        Scanner fsc = new Scanner(System.in);
        String findName = fsc.nextLine();
        System.out.print("Enter name to replace:");
        Scanner rsc = new Scanner(System.in);
        String replaceName = rsc.nextLine();
        for (String rname : a) {
            if (findName.equals(a[i])) {
                a[i] = replaceName;
                // break;
                System.out.println("Name updated as: " + a[i]);
            }
        }
    }
    static void delete() {
        System.out.println("5.Delete name");
        System.out.println("Type a name to remove:");
        Scanner dsc = new Scanner(System.in);
        String delName = dsc.nextLine();
        for (String deleteName : a) {
            if (delName.equals(a[i])) {
                delName = "";
            }
        }
        System.out.println("Name removed!" + delName + "--");
    }
}



















































