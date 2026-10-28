class Parent {

    int a = initializeParent();

    int initializeParent() {
        System.out.println("Parent instance variable initialized");
        return 10;
    }

    Parent() {
        System.out.println("Parent constructor body");
    }
}

class Child extends Parent {

    int b = initializeChild();

    int initializeChild() {
        System.out.println("Child instance variable initialized");
        return 20;
    }

    Child() {
        System.out.println("Child constructor body");
    }
}

public class Main {

    public static void main(String[] args) {
        Child c = new Child();
    }
}