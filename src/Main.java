public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(2, 3);
        int b = calc.minus.apply(5, 3);
        int c = calc.multiply.apply(4, 3);
        int d = calc.devide.apply(9, 3);

        int e = calc.pow.apply(5);
        int f = calc.abs.apply(-9);

        boolean g = calc.isPositive.test(-5);
        calc.println.accept(f);


    }
}
