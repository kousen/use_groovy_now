package nfjs.banking

import nfjs.banking.Bank
import nfjs.banking.GroovyAccount
import nfjs.banking.JavaAccount
import spock.lang.Specification

class BankSpec extends Specification {
    Bank javaBank
    Bank groovyBank

    void setup() {
        javaBank = new Bank([new JavaAccount(1, 100.0),
                             new JavaAccount(2, 100.0)])
        groovyBank = new Bank([new GroovyAccount(1, 100.0),
                               new GroovyAccount(2, 100.0)])
    }

    def "deposit 50 to account 1 adds 50"() {
        when:
        javaBank.deposit(1, 50.0)
        groovyBank.deposit(1, 50.0)

        then:
        javaBank.getBalance(1) ==
                old(javaBank.getBalance(1)) + 50
        groovyBank.getBalance(1) ==
                old(groovyBank.getBalance(1)) + 50
    }

    def "withdraw 50 from account 2 subtracts 50"() {
        when:
        javaBank.withdraw(2, 50.0)
        groovyBank.withdraw(2, 50.0)

        then:
        javaBank.getBalance(2) ==
                old(javaBank.getBalance(2)) - 50
        groovyBank.getBalance(2) ==
                old(groovyBank.getBalance(2)) - 50
    }
}
