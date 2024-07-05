package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 0;
        while (counter <= printToInclusive) {
            if (counter == 2 || counter == 3 || counter == 5 || counter == 7 || counter == 11 || counter == 13 || counter == 17 ||
            counter == 19 || counter == 23 || counter == 29 || counter == 31) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
