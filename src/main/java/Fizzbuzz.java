public class Fizzbuzz {
    public String generate(Integer upto) {
        String[] fizzbuzz = new String[upto];

        for (short i = 0; i < upto; i++) {
            if ((i + 1) % 15 == 0) {
                fizzbuzz[i] = "FizzBuzz";
            } else if ((i + 1) % 3 == 0) {
                fizzbuzz[i] = "Fizz";
            } else if ((i + 1) % 5 == 0) {
                fizzbuzz[i] = "Buzz";
            } else {
                fizzbuzz[i] = Integer.toString(i + 1);
            }
        }
        return String.join(", ", fizzbuzz);
    }
}
