package africa.semicolon.bankingApplication.data.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Bank {
    private  String id;
    private  String name;
    private  List<Account> accounts = new ArrayList<>();
}
