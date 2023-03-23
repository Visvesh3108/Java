import java.util.Scanner;

class A{

    int a;
}

class B extends A {

    Scanner sc = new Scanner(System.in);
}

class C extends B {

    void input() {
        System.out.print("Enter a number:");
        a = sc.nextInt();
    }
}

class Main extends C {

    void display() {
        System.out.println("The value of a is:" + a);
    }

    public static void main(String args[]) {
        Main obj = new Main();
        obj.input();
        obj.display();
    }
}