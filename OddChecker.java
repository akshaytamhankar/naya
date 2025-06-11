public class OddChecker {
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static void main(String[] args) {
        int testNumber = 7;
        if (isOdd(testNumber)) {
            System.out.println(testNumber + " is odd.");
        } else {
            System.out.println(testNumber + " is even.");
        }
    }
}