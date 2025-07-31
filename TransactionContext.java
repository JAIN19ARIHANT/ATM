public class TransactionContext<B, M> {
    private B bank;
    private String accountNumber;
    private String pin;
    private String city;
    private M mode;

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCity() {
        return city;
    }

    public String getPin() {
        return pin;
    }

    public B getBank() {
        return bank;
    }

    public M getMode() {
        return mode;
    }
}
