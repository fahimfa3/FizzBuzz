public class Multiples {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; ) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy5) {
                count ++;
            }
            else if (divisibleBy3) {
                count ++;
            }
            i ++;
    }
        System.out.println(count);


    }

}

