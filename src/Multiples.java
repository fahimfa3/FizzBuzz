public class Multiples {

    public static int main(Integer n, Integer a, Integer b) {
        int count = 0;
        for (int i = 1; i < n; ) {
            boolean divisibleBya = i % a == 0;
            boolean divisibleByb = i % b == 0;

            if (divisibleBya) {
                count ++;
            }
            else if (divisibleByb) {
                count ++;
            }
            i ++;
        }
        return count;


    }

}

