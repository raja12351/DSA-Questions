// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static class A{
        public void meth(){
            System.out.println("Invoking method from class A");
        }
    }
    public static class B extends A{
        @Override
        public void meth(){
            System.out.println("Method is overridden in Extendend class B");
        }
    }
    public static void main(String[] args) {
        A a = new A();
        a.meth();

        B b = new B();
        b.meth();
    }
}