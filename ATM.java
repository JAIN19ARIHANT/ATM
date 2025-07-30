public interface ATM {
    void withdrawMoney(BankName bankName, WithdrawalMode mode, double amount, String pin);
    void depositMoney(BankName bankName, double amount);
    double checkBalance(BankName bankName, String pin);
}
