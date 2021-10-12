package africa.semicolon.bankingApplication.data.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data

public class Customer {
    private List<Account> account = new ArrayList<Account>();
    private Bvn bvn;
    private String firstName;
    private String lastName;
}
