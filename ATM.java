public interface ATM<B, M> {
    void withdrawMoney(B bank, M mode, double amount, String pin);
    void depositMoney(B bank, double amount);
    double checkBalance(B bank, String pin);
}