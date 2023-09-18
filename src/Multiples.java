public class Multiples {

    public static int multiples(int n, int a, int b) {
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

