public class Challenge1 {
    public static void main(String[] args) {
        Atm a = new Atm();
        Customer c1 = new Customer(a, "A", 1000);
        Customer c2 = new Customer(a, "B", 2000);
        Customer c3 = new Customer(a, "C", 3000);
        Customer c4 = new Customer(a, "D", 4000);
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}

class Customer extends Thread {
    Atm atm;
    String name;
    int amount;
    Customer(Atm a, String name, int amount) {
        this.atm = a;
        this.name = name;
        this.amount = amount;
    }
    public void run() {
        useAtm();
    }

    void useAtm() {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
}

class Atm {
    synchronized void checkBalance(String name) {
        System.out.println(name+" is checking balance...");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Checked");
    }
    synchronized void withdraw(String name, int amount) {
        System.out.println(name+" is withdrawing...");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("WithDrawn");
    }
}
