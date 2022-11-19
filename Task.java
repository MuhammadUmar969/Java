package task;

import java.util.ArrayList;
import java.util.Scanner;

class color {

    ArrayList<String> colors = new ArrayList<String>();
    ArrayList<String> colors1 = new ArrayList<String>();
    public void addDefaultColor() {
        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");
    }

    public void displayColor() {
        System.out.println("List of Colors");
        for (String c1 : colors) {
            System.out.println(c1);
        }
    }

    public void ListOfOperation() {
        System.out.println("1 Add Colors");
        System.out.println("2 Remove Colors");
        System.out.println("3 Update Colors");
        System.out.println("4 Clear Colors");
        System.out.println("5 Copy Colors");
    }

    public void addColor(String mycolor) {
        colors.add(mycolor);
    }

    public void remColor(String mycolor) {
        colors.remove(mycolor);
    }

    public void updateColor(String mycolor, int index) {
        colors.set(index, mycolor);
    }

    public void clearColor() {
        colors.clear();
    }

    public void copyColor() {
        for(int i = 0; i<colors.size() ; i++){
            colors1.add(colors.get(i));
        }
        for(String el: colors1 ){
            System.out.println("This is the copy " +el);
        }
    }
}

public class Task {

    public static void main(String[] args) {
        color c = new color();
        c.addDefaultColor();
        c.displayColor();
        c.ListOfOperation();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Operation: ");
        int opt = sc.nextInt();
        if (opt == 1) {
            System.out.println("Enter the color: ");
            String mycolor = sc.next();
            c.addColor(mycolor);
            c.displayColor();
        } else if (opt == 2) {
            System.out.println("Which color you want to remove");
            String mycolor = sc.next();
            c.remColor(mycolor);
            c.displayColor();
        } else if (opt == 3) {
            System.out.println("Which color you want to update");
            String mycolor = sc.next();
            System.out.println("Enter the number ");
            int index = sc.nextInt();
            c.updateColor(mycolor, (index - 1));
            c.displayColor();
        } else if (opt == 4) {
            c.clearColor();
            c.displayColor();
        }
        else if (opt == 5){
            c.copyColor();
        }

    }

}
