public class Swap {
    public static void main(String[] args) {
        int number = 78;
        int anotherNumber = 32;

        int temp = number;
        number = anotherNumber;
        anotherNumber = temp;
        System.out.println(number);
        System.out.println(anotherNumber);
    }
}
