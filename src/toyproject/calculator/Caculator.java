package toyproject.calculator;

public class Caculator {
    public double performOperation(Operation operation, double a, double b){
        return operation.calculate(a,b);
    }

    public static void main(String[] args) {
        Caculator cal = new Caculator();

        //사칙연산 실행
        System.out.println("100 + 2 = " + cal.performOperation(new Add(), 100, 2));
        System.out.println("100 + 2 = " + cal.performOperation(new Sub(), 100, 2));
        System.out.println("100 + 2 = " + cal.performOperation(new Multi(), 100, 2));
        System.out.println("100 + 2 = " + cal.performOperation(new Div(), 100, 2));
    }
}
