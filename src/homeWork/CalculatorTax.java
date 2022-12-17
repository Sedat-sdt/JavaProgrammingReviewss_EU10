package homeWork;

public class CalculatorTax {

    public static void main(String[] args) {

        int price = 120000;

        double tax_Rate;

        if (price>=20000 && price<40000) {
            tax_Rate = 0.2;
            System.out.println(tax_Rate);
        }else if (price>=40000 && price<60000) {
            tax_Rate = 0.3;
            System.out.println(tax_Rate);
        }else if (price>=60000 && price<80000) {
            tax_Rate = 0.4;
            System.out.println(tax_Rate);
        }else {
            System.out.println("Not Elligible");
        }



      /*
      Create a class which is "CalculateCarTax"
        if the price between $20000 and $39999 taxRate=0.2
        if the price between $40000 and $59999 taxRate=0.3
        if the price between $60000 and $80000 taxRate=0.4

       */

    }

}
