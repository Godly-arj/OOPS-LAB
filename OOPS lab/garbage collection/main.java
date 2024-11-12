public class main {
    public static void main(String[] args) {
        main m1 = new main();
        main m2 = new main();

        // To nullify the reference variable
        m1.cleanup();
        m1 = null;

        // Requesting JVM to run garbage collector
        System.gc();

        // To nullify the reference variable
        m2.cleanup();
        m2 = null;

        // Requesting JVM to run garbage collector
        Runtime.getRuntime().gc();
    }

    private void cleanup() {
        System.out.print("Custom cleanup method called: ");
        System.out.print("\nObject cleaned up: " + this);
    }
}
