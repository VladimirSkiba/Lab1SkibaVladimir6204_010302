package myfirstpackage;

public class MySecondClass {
    private int number1, number2;

    public MySecondClass(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void setNum1(int number1) {
        this.number1 = number1;
    }

    public void setNum2(int number2) {
        this.number2 = number2;
    }

    public int getNum1() {
        return number1;
    }

    public int getNum2() {
        return number2;
    }
    public int mult() {
        return number1 * number2;
    }
}