package EMS;

abstract class AllUsers {
    abstract void adminCheck();
}

public class Person extends AllUsers{
    int userAge;
    String userEmail;
    boolean adminStatus = false;
    final double maxBalance = 100000.00;

    Person() {
        
    }
    
    Person(int a, String em) {
        this.userAge = a;
        this.userEmail = em;
    }
    Person(int a, String em, boolean admin){
        this.userAge = a;
        this.userEmail = em;
        this.adminStatus = admin;
    }

    void display() {
        System.out.println("\t USER DETAILS");
        System.out.println("Age : "+this.userAge);
        System.out.println("Email : "+this.userEmail);
    }

    public void adminCheck() {
        if (this.adminStatus) {
            System.out.println("You have admin privileges.");
        }
        else {
            System.out.println("You're not an admin!");
        }
    }
}