import EMS.*;
import java.util.*;

public class Lab{
    public static void main(String[] args) {
        Header h = new Header();
        h.run(args[0]);
        EMS.User.displayCount();
        EMS.Admin a1 = new EMS.Admin(21, "devyadav@live.com", "Dev Yadva", "adasknd@ndkand");
        a1.display();
        a1.adminCheck();

        EMS.User u1 = new EMS.User(19,"devadeva@gmai.com","Prabhas","adasdsdasd",1000);
        u1.display();
        u1.adminCheck();
        EMS.User.displayCount();

        EMS.User u2 = new EMS.User();
        u2.read();
        u2.display();
        u2.adminCheck();
        EMS.User.displayCount();
    }
}

class Header extends Thread{
	public void run(String name){
		System.out.println("\tWelcome "+name);
	}
}