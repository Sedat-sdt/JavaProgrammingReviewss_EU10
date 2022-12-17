package week11_11_19_2022.customClass;

public class FirstClass {

    public int a;

    public String b;
    public SecondClass secondClass;

    //shortcut for creating cons


    public FirstClass(int a, String b, SecondClass secondClass) {
        this.a = a;
        this.b = b;
        this.secondClass = secondClass;
    }

    public void methodA(){

    }

    @Override
    public String toString() {
        return "FirstClass{" +
                "a=" + a +
                ", b='" + b + '\'' +
                ", secondClass=" + secondClass +
                '}';
    }
}
