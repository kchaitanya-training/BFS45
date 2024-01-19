public class ThisKeyword {
    String name;

    ThisKeyword(String name) {
        this.name = name;
    }

    void printName() {
        System.out.println("Language: " + this.name);
    }

    public static void main(String[] args) {
        ThisKeyword tk = new ThisKeyword("Java");
        tk.printName();
    }
}
