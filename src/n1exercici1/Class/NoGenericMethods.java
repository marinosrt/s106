package n1exercici1.Class;

public class NoGenericMethods {

    private Integer num1;
    private Integer num2;
    private Integer num3;;

    public NoGenericMethods(Integer num1, Integer num2, Integer num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public Integer getNum1() {
        return num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public Integer getNum3() {
        return num3;
    }

    @Override
    public String toString() {
        return "First introduced integer: " + getNum1() + "" +
                ". The second one: " + getNum2()
                + ". The third one: " + getNum3();
    }
}
