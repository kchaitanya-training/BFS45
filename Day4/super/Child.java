public class Child extends Parent {
        Child() {
            super(10);
            System.out.println("This is child");
        }

        Child(int a){
            super(a);
            System.out.println("This is argument cons of Child");
        }

    public static void main(String[] args) {
        Child c = new Child(5);
        Child d = new Child();
    }
}
