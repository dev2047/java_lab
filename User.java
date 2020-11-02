package EMS;
import java.util.*;

public class User extends Person{
    static int count;
    String userName;
    StringBuffer userPassword = new StringBuffer(22);
    double userBalance = 0.0;

    public User() {
        super();
        User.count = User.count + 1;
    }
    
    public User(int age, String email, String name, String passw) {
        super(age, email);
        this.userName = name;
        this.userPassword.append(passw);
        User.count = User.count + 1;
    }

    public User(int age, String email, String name, String passw, double bal) {
        super(age, email);
        this.userName = name;
        this.userPassword.append(passw);
        if(bal < super.maxBalance) {
            this.userBalance = bal;
        }
        else {
            System.out.println("Amount must be less than Rs.1,00,000");
        }
        User.count = User.count + 1;
    }

    public void display() {
        System.out.println("Name : "+this.userName);
        super.display();
        System.out.println("Balance : "+this.userBalance);
    }
    public void read() {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter Age : ");  
        this.userAge= sc.nextInt();
        System.out.print("Enter Email :");  
        this.userEmail= sc.nextLine();
        System.out.print("Enter Name : ");  
        this.userName= sc.nextLine();
        System.out.print("Enter Password :");  
        this.userPassword.append(sc.nextLine());
        sc.close();
    }
    public static void displayCount() {
        System.out.println(User.count + " Users are currently registered.");
    }
}