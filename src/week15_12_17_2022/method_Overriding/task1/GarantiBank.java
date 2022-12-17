package week15_12_17_2022.method_Overriding.task1;

public class GarantiBank extends Bank {

    @Override
    public void calculateTheInterest() {
        System.out.println(getCapital()*8/1000);
    }
}
