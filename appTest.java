public class AppTest {
    public static void main(String[] args) {
        int result = App.prod(2, 3);
        if (result != 6) {
            System.out.println("TEST FAILED: expected 6 but got " + result);
            System.exit(1);
        }
        System.out.println("TEST PASSED");
    }
}
