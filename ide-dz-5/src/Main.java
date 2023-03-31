import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1. Надає значення 4 полям типу int.
        int a = 1;
        int b = 10;
        int c = 5;
        int d = 15;
        //2. Сумує їх попарно.
        calculatingSum(a, b, c, d);
    }
    public static int[] calculatingSum(int a, int b, int c, int d){
        int sum1 = a + b;
        int sum2 = c + d;
        int [] sums = {sum1, sum2};

        System.out.println("A+B and D+C" + Arrays.toString(sums));
       // 3. Виводить результат порівняння сум (true, якщо перша сума більша).
        comparingSum(sums);
        return sums;
    }
    public static void comparingSum(int[] sums){

        int sum1 = sums[0];
        int sum2 = sums[1];

        boolean WhichIsBigger = sum1 > sum2;
        System.out.println("sum 1 is bigger: " + WhichIsBigger);
        //4. Збільшує першу суму на 1.
        //5. Другу суму зменшує на 2.
        //6. Виводить результат порівняння (true якщо перша сума більша).
        comparingRes(sums);
    }
    public static int[] comparingRes(int[] sums){
        int sum1 = sums[0];
        int sum2 = sums[1];

        int res1 = ++sum1;
        int res2 = sum2 - 2;
        System.out.println(sum1 + " +1 is " + res1 + " ," + sum2 + "-2 is " + res2);

        boolean ResultsCompare = res1>res2;
        System.out.println("Is first sum is bigger: " + ResultsCompare);

        int[] result = {res1, res2};
        //7. Виводить true якщо хоча б одна сума кратна 2, інакше - false.
        isEven(result);

        return result;
    }
    public static void isEven(int[] result){
        int res1 = result[0];
        int res2 = result[1];

        String evenOrOdd = 0 == res1%2 || 0 == res2%2 ? "true" : "false";
        System.out.println("at least one sum is even: " + evenOrOdd);
    }
}