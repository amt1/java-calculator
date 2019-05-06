public class Calculator {

    public Calculator() {

    }

    public int add(int int1, int int2){
        return int1 + int2;
    }

    public int subtract(int int1, int int2){
        return int1 - int2;
    }

    public int multiply(int int1, int int2){
        return int1 * int2;
    }

    public int divideIntResult(int int1, int int2){
        return int1 / int2;
    }

    public float divideFloatResult(int int1, int int2){
        float num1 = int1;
        float num2 = int2;
        float answer = num1 / num2;
        return  answer;
    }
}
