package africa.semicolon.bankingApplication.data.models;

import lombok.Data;

@Data
public final class Bvn {
    private final String id;
    private final Customer customer = new Customer();
    //save, delete, findAll, findById, deleteById Create Read Update Delete
}