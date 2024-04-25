import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();


        SavingsAccount savings1 = new SavingsAccount(191.50, 1.24);
        SavingsAccount savings2 = new SavingsAccount(3261.50, 0.44);
        SavingsAccount savings3 = new SavingsAccount(4191.50, 2.64);
        accounts.add(savings1);
        accounts.add(savings2);
        accounts.add(savings3);

        CheckingAccount checkings1 = new CheckingAccount(511.10, 1.20);
        CheckingAccount checkings2 = new CheckingAccount(735, 1.10);
        CheckingAccount checkings3 = new CheckingAccount(11504.41, 1.00);
        accounts.add(checkings1);
        accounts.add(checkings2);
        accounts.add(checkings3);


        int i = 1;
        for (Account a : accounts)
            if (a instanceof SavingsAccount) {
                BigDecimal bd = new BigDecimal(String.valueOf(a.calculateInterest()));
                bd = bd.setScale(2, RoundingMode.UP);

                System.out.println(i + ". " + bd);
                i++;
            }
    }
}