package africa.semicolon.bankingApplication.data.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data

public class Bank {
    private final List<Account> accounts = new ArrayList<Account>();
}
