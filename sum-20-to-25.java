public class SumNumbersDoWhile {
    public static void main(String[] args) {
        int sum = 0;
        int number = 20;

        do {
            sum += number;
            number++;
        } while (number <= 25);

        System.out.println("Sum of numbers between 20 and 25: " + sum);
    }
}
