package general_practice.accounting_example;

import java.util.ArrayList;

public class AccDriver {
    public static void main(String[] args) {

        AccReceivable accReceivable = new AccReceivable();
       // int sum = accReceivable.calculate();

        Accounting a = new Accounting();
        Accounting ac = new AccReceivable();
        AccReceivable acr = new AccReceivable();

        ArrayList<Accounting> el = new ArrayList<>();
        el.add(new AccReceivable());
        el.add(new Accounting());
        el.add(new AccPayable());


        int johnSalary = 3;
        int JohnsBonus = 5;

        for (int i = 0; i < el.size(); i++) {

            el.get(i).calculate(johnSalary, JohnsBonus);
        }
    }
}
