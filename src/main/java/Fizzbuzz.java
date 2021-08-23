public class Fizzbuzz {
    public String generate(Integer upto) {
        String output = "";
        for (short i = 1; i <= upto; i++) {
            if (i < 2) {
                output += "1";
            } else {
                output += ", " + i;
            }
        }
        return output;
    }
}
