package EMS;

public class Admin extends Person{
    final String adminName;
    StringBuffer adminPassword = new StringBuffer(22);

    public Admin(int age, String email, String name, String passw) {
        super(age,email,true);
        this.adminName = name;
        this.adminPassword.append(passw);
    }
    public void display() {
        super.display();
        System.out.println("Name : "+this.adminName);
    }
}