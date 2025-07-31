import java.util.HashMap;
public class GenericATM implements ATM<BankName, WithdrawalMode> {
    private double balance;
    private final HashMap<String, String> cardPinMap = new HashMap<>();

    public GenericATM() {
        cardPinMap.put("1234-5678-9000", "4321");
        cardPinMap.put("1111-2222-3333", "1234");
    }

    private boolean validatePin(String cardNumber, String pin) {
        return pin.equals(cardPinMap.get(cardNumber));
    }

    @Override
    public void withdrawMoney(BankName bank, WithdrawalMode mode, double amount, String pin) {
        if (!validatePin("1234-5678-9101", pin)) {
            System.out.println(bank + ": Invalid PIN.");
            return;
        }

        if (amount <= 50000 && balance >= amount) {
            balance -= amount;
            System.out.println(bank + ": ₹" + amount + " withdrawn using " + mode);
        } else if (amount > 50000) {
            System.out.println(bank + ": Withdraw limit exceeded! LIMIT : ₹50000");
        } else {
            System.out.println(bank + ": Insufficient balance.");
        }
    }

    @Override
    public void depositMoney(BankName bank, double amount) {
        balance += amount;
        System.out.println(bank + ": ₹" + amount + " deposited.");
    }

    @Override
    public double checkBalance(BankName bank, String pin) {
        if (!validatePin("1234-5678-9101", pin)) {
            System.out.println(bank + ": Invalid PIN.");
            return -1;
        }
        return balance;
    }
}