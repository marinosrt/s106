package n1exercici1.Class;

import java.util.Arrays;

public class NoGenericMethods2 {

    private Number[] Num1;
    private Number[] Num2;
    private Number[] Num3;

    public NoGenericMethods2(Number[] num1, Number[] num2, Number[] num3) {
        Num1 = num1;
        Num2 = num2;
        Num3 = num3;
    }

    public Number[] getNum1() {
        return Num1;
    }

    public void setNum1(Number[] num1) {
        Num1 = num1;
    }

    public Number[] getNum2() {
        return Num2;
    }

    public void setNum2(Number[] num2) {
        Num2 = num2;
    }

    public Number[] getNum3() {
        return Num3;
    }

    public void setNum3(Number[] num3) {
        Num3 = num3;
    }

    @Override
    public String toString() {
        return "\nFirst set of numbers, " +
                "Num1 = " + Arrays.toString(Num1) +
                ".\nSecond one, Num2 = " + Arrays.toString(Num2) +
                ".\nThird one, Num3 = " + Arrays.toString(Num3);
    }
}
