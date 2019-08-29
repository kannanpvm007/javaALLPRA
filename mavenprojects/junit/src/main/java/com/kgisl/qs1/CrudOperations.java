package com.kgisl.qs1;

import java.util.Scanner;

/**
 * CrudOperations
 */
public class CrudOperations {

    //static String str[] = { "sasikumar", "shiens", "prabha", "gk", "sathyaraj" };
    static String str[] = new String[2];

    public static void main(String[] args) {
        selectOptions();

    }

    static void selectOptions() {
        System.out.println("Select Options:");
        System.out.println("1.create\t2.update\t3.remove\t4.display");
        System.out.println("Select your option");
        Scanner scan = new Scanner(System.in);
        int myOption = scan.nextInt();
        switch (myOption) {
        case 1:
            create();
            selectOptions();
            break;
        case 2:
            update();
            selectOptions();
            break;
        case 3:
            remove();
            selectOptions();
            break;
        case 4:
            display();
            selectOptions();
            break;

        default:
            selectOptions();
            break;
        }
    }

    private static void create() {
        System.out.println("Create:");
        for(int i=0;i<str.length;i++){
            System.out.println("Enter name:");
            Scanner scan=new Scanner(System.in);
            String createName=scan.nextLine();
            str[i]=createName;
        }
    }

    private static void update() {
        System.out.println("Update:");
        System.out.println("Enter name to update");
        Scanner scan=new Scanner(System.in);
        String findName=scan.nextLine();
        System.out.println("Enter new name");
        scan=new Scanner(System.in);
        String updateName=scan.nextLine();
        for(int i=1;i<str.length;i++){
        if(findName.equals(str[i])){
            str[i]=updateName;
        }
    }
    }

    private static void remove() {
        System.out.println("Remove");
        System.out.println("Enter name to remove");;
        Scanner scan=new Scanner(System.in);
        String findName=scan.nextLine();
        for(int i=0;i<str.length;i++){
        if(findName.equals(str[i])){
            str[i]="";
            break;
        }
    }
    }

    private static void display() {
        System.out.println("Display");
        for (String var : str) {
         System.out.println(var);   
        }
    }
}