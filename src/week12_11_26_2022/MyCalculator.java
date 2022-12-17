package week12_11_26_2022;

public class MyCalculator {

    public double a,b;

    public MyCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double myCalcPlus(){
      double  result= a+b;
      return result;
    }
    public double myCalcMinus(){
        double  result= a-b;
        return result;
    }

    public double myCalcMul(){
        double  result= a*b;
        return result;
    }

    public double myCalcDiv(){
        double  result= a/b;
        return result;
    }

    public String toString() {
        return "MyCalculator{" +
                "a=" + a +
                ", b=" + b +
                ", a+b=" + myCalcPlus() +
                ", a-b=" + myCalcMinus() +
                ", a*b=" + myCalcMul() +
                ", a/b=" + myCalcDiv() +
                '}';
    }
}
