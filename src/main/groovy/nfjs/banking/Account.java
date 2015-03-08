package nfjs.banking;

import java.math.BigDecimal;

public interface Account {
    double deposit(BigDecimal amount);
    double withdraw(BigDecimal amount);
    double getBalance();
    Integer getId();
}
