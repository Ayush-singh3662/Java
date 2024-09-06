import java.util.ArrayList;

public class MemberInvitation {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c1 = new Customer("Ayush");
        Customer c2 = new Customer("Shivam");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
        System.out.println(Member.x);
    }
}

interface Member {
    final static int x = 19;
    void callback();
}

class Store {
    ArrayList<Member> list = new ArrayList<>();

    void register(Member m) {
        list.add(m);
    }

    void inviteSale() {
        for(int i=0; i<list.size(); ++i) {
            list.get(i).callback();
        }
    }
}

class Customer extends Store implements Member {
    String name;
    
    Customer(String name) {
        this.name = name;
    }

    public void callback() {
        System.out.println("Ok, I will visit "+name);
    }
}