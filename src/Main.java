public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);

        int e = calc.pow.apply(5);
        int f = calc.abs.apply(-9);

        boolean g = calc.isPositive.test(-5);
        calc.println.accept(c);
    }
}
