public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        int c = 5;
        int d = 15;

        int sum1 = a + b;
        int sum2 = c + d;

        boolean WhichIsBigger = sum1 > sum2;
        System.out.println(WhichIsBigger);

        int res1 = ++sum1;
        int res2 = sum2 - 2;

        boolean ResultsCompare = res1>res2;
        System.out.println(ResultsCompare);

        String evenOrOdd = 0 == sum1%2 || 0 == sum2%2 ? "true" : "false";
        System.out.println(evenOrOdd);
    }

}