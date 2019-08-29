
/**
 * ScanSwitch
 */
import java.util.Scanner;

public class ScanSwitch {
    static String a[] = new String[2];
    static int i;

    public static void main(String[] args) {
        System.out.println("1.create" + '\n' + "2.display" + '\n' + "3.findOne" + '\n' + "4.update" + '\n' + "5.remove"
                + '\n' + "6.stop");
        options();
    }

    static void options() {
        System.out.println("Enter the options");
        Scanner opt = new Scanner(System.in);
        int op = opt.nextInt();
        switch (op) {
        case 1:
            create();
            options();
            break;
        case 2:
            display();
            options();
            break;
        case 3:
            findOne();
            options();
            break;
        case 4:
            update();
            options();
            break;
        case 5:
            remove();
            options();
            break;
        case 6:
            break;

        }
    }
    static void create(){
        System.out.println("1.create");
        for(int i=0;i<a.length;i++){
            System.out.println("Enter the Number");
            Scanner creat=new Scanner(System.in);
            String name=creat.nextLine();
            a[i]=name;
        }
    }
        static void display(){
            System.out.println("2.display");
            for(String disname : a){
                System.out.println("Name:"+disname);
            }
        }
        static void findOne(){
            System.out.println("3.findOne");
            Scanner find=new Scanner(System.in);
            String fname=find.nextLine();
            for(String fnname : a){
                if(fname.equals(fnname)){
                    System.out.println("Find the value");
                }
                else{
                    System.out.println("Cant Find the value");
                }
            }
        }
        static void update(){
            System.out.println("4.update");
            System.out.println("Type a name to change");
            Scanner upd=new Scanner(System.in);
            String upname=upd.nextLine();
            System.out.println("Enter name to replace");
            Scanner up=new Scanner(System.in);
            String rep=up.nextLine();
            for(String repname : a){
                if(upname.equals(a[i])){
                    a[i]=rep;
                    System.out.println("Name updated as"+a[i]);
                }
            }
            
        }
        static void remove(){
            System.out.println("5.remove");
            System.out.println("Type name to remove");
            Scanner rem=new Scanner(System.in);
            String remname=rem.nextLine();
            for(String del : a){
                if(remname.equals(a[i])){
                    remname="";
                }
            }
            System.out.println("Name removed"+remname+"--");
    
            
        }
}
