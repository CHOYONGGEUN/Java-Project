package toyproject.calculator;

public class Div implements Operation {
    @Override
    public double calculate(double a, double b) {

        if(b==0){
            throw new IllegalStateException("나누는 숫자가 0이 될 수는 없습니다.");
        }
        return a/b;
    }
}
