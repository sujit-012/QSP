class Parent {
	 int a = 10;

}

class Child extends Parent {

    static int a = 20;

    Child() {
    }
}

public class Main {

    public static void main(String[] args) {
        Parent c = new Child();
		System.out.println(c.a);
    }
}