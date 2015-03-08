package nfjs.banking

import groovy.transform.Canonical

@Canonical
class GroovyAccount implements Account {
    Integer id
    BigDecimal balance

    double deposit(BigDecimal amount) {
        balance += amount
    }

    double withdraw(BigDecimal amount) {
        deposit(-amount)
    }

    double getBalance() { balance }
}
