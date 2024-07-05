package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 0;
        while (counter <= printToInclusive) {
            int divider = 1;
            int sum = 0;
            while (divider < counter) {
                if (counter % divider == 0) {
                    sum++;
                }
                divider++;
            }
            if (sum > 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
