public class Fizzbuzz {
    public String generate(Integer upto) {
        String output = "";
        for (short i = 1; i <= upto; i++) {
            if (i < 2) {
                output += "" + i;
            } else if (i % 15 == 0) {
                output += ", " + "FizzBuzz";
            } else if (i % 3 == 0) {
                output += ", " + "Fizz";
            } else if (i % 5 == 0) {
                output += ", " + "Buzz";
            } else {
                output += ", " + i;
            }
        }
        return output;
    }
}
