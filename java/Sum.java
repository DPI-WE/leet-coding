public class Sum {
    public static void main(String[] args) {
        System.out.println("Test sum(0, 0): " + (Sum.sum(0, 0) == 0));
        System.out.println("Test sum(1, 2): " + (Sum.sum(1, 2) == 3));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
