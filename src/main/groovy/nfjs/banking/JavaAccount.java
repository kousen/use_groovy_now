package nfjs.banking;

import java.math.BigDecimal;

public class JavaAccount implements Account {
    private Integer id;
    private BigDecimal balance;

    public JavaAccount() {}

    public JavaAccount(Integer id, BigDecimal balance) {
        this.id = id;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getBalance() {
        return balance.doubleValue();
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public double deposit(BigDecimal amount) {
        balance = balance.add(amount);
        return balance.doubleValue();
    }

    @Override
    public double withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
        return balance.doubleValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JavaAccount that = (JavaAccount) o;

        if (balance != null ? !balance.equals(that.balance) : that.balance != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (balance != null ? balance.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "JavaAccount{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }
}
