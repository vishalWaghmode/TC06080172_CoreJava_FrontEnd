package synchDeposite;

public class Account {
    private float bal;

    public Account(float initialBalance) {
        this.bal = initialBalance;
    }

    public synchronized void deposit(float amount) {
        float temp = this.bal;
        temp += amount;
        this.bal = temp;
    }

    public float getBalance() {
        return this.bal;
    }

    public static void main(String[] args) {
        Account account = new Account(4000);
        
     // Creating two threads for depositing
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                account.deposit(10);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                account.deposit(10);
            }
        });
        

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}
