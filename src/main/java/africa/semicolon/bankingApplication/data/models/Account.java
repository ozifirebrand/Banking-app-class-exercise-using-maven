package africa.semicolon.bankingApplication.data.models;

import java.math.BigDecimal;

public class Account {
    private final BigDecimal balance = BigDecimal.ZERO;
    private String number;
    private String customerId;
    private AccountType type;
}
