public class EvenChecker {
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;}}
public static void main(String[] args) {
        int testNumber = 4;
        if (isEven(testNumber)) {
            System.out.println(testNumber + " is even.");
        } else {
            System.out.println(testNumber + " is odd.");}}
}
