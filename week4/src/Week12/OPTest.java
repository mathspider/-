package Week12;

import java.util.ArrayList;
import java.util.List;

public class OPTest {
    public static void main(String[] args) {
        List<iOp> operators = new ArrayList<>();
        operators.add(new Addition());
        operators.add(new Subtraction());
        operators.add(new Multiplication());
        operators.add(new Division());
    }
}
