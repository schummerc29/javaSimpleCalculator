public class Calculator implements MathFunctions{
    private int a;
    private int b;
    private int answer;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void add(int a, int b){
        answer = a + b;
        System.out.println("Your answer is " + answer + "!");
    }

    public void subtract(int a, int b){
        answer = a - b;
        System.out.println("Your answer is " + answer + "!");
    }

    public void multiply(int a, int b){
        answer = a * b;
        System.out.println("Your answer is " + answer + "!");
    }

    public void divide(int a, int b){
        answer =  a / b;
        var remainder = a % b;
        System.out.println("Your answer is " + answer + ", and the remainder is " + remainder + "!");
    }
}