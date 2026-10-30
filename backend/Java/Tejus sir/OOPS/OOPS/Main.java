class Parent {

    static void show() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {

    static void display() {
        show();
    }

}

class Driver
{
	 public static void main(String[] args) {
        Child.show();
    }
}