class Account {
    private String accNo;
    private String name;
    protected long balance;
    private String dob;
    private String phnNo;
    public Account() {

    }
    public Account(String accNo, String name, String dob) {
        this.accNo = accNo;
        this.name = name;
        this.dob = dob;
    }
    public void setPhnNo(String phnNo) {
        this.phnNo = phnNo;
    }
    public String getaccNo() {
        return accNo;
    }
    public String getName() {
        return name;
    }
    public String getDob() {
        return dob;
    }
    public String getPhnNo() {
        return phnNo;
    }
    public long balance() {
        return balance;
    }
}

class SavingsAccount extends Account {
    public void deposit(long amount) {
        balance += amount;
    }
    public void withdraw(long amount) {
        balance -= amount;
    }
}

public class Account_Test {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount();
        acc.setPhnNo("+91 9142931013");
        acc.deposit(1200);
        System.out.println(acc.balance());
        acc.withdraw(200);
        System.out.println(acc.balance());
        // System.out.println(acc.getName());
    }
}


// class Account
// {
//     private String accNo;
//     private String name;
//     private String address;
//     private String phno;
//     private String dob;
//     protected long balance;

//     public Account() {

//     }
    
//     public Account(String acc,String n,String add,String phno,String dob)
//     {
//         accNo=acc;
//         name=n;
//         address=add;
//         this.phno=phno;
//         this.dob=dob;
//         balance=0;
//     }
//     public String getAccNo(){return accNo;}
//     public String getName(){return name;}
//     public String getAddress(){return address;};
//     public String getPhno(){return phno;}
//     public String getDOB(){return dob;}
//     public long getBalance(){return balance;}
    
//     public void setAddress(String add)
//     {
//         address=add;
//     }
//     public void setPhno(String phno)
//     {
//         this.phno=phno;
//     }
            
// }

// class SavingsAccount extends Account
// {
//     public void deposit(long amt)
//     {
//         balance+=amt;
//     }
//     public void withdraw(long amt)
//     {
//         balance-=amt;
//     }
// }

// class LoanAccount extends Account
// {
//     public void payEMI(long amt)
//     {
//         balance-=amt;
//     }
//     public void repay(long amt)
//     {
//         if(balance==amt)
//             balance=0;
//     }
// }