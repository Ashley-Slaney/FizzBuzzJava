public class Fizzbuzz {
    public String generate(Integer upto) {
        String output = "";
        for (short i = 1; i <= upto; i++) {
            if (i < 2) {
                output += "" + i;
            } else if (i % 3 == 0) {
                output += ", " + "Fizz";
            } else {
                output += ", " + i;
            }
        }
        return output;
    }
}
