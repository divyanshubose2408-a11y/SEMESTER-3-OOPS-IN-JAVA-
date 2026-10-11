//Demonstate working of runtime polymorphism
class Security {
    void blackpearl() {
        System.out.println("Base security check");
    }
}


class Regular extends Security {
    @Override
    void blackpearl() {
        System.out.println("Regular check");
    }
}


class VIP extends Security {
    @Override
    void blackpearl() {
        System.out.println("VIP check");
    }

    void DNSsecurity() {
        System.out.println("DNS security");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Security ref;

      
        ref = new Regular();
        ref.blackpearl(); 

       
        ref = new VIP();
        ref.blackpearl(); 

        
    }
}
