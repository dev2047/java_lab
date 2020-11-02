import EMS.*;
import java.util.*;

public class Lab {
    public static void main(String[] args) {
        EMS.User.displayCount();
        EMS.Admin a1 = new EMS.Admin(21, "devyadav@live.com", "Dev Yadva", "adasknd@ndkand");
        a1.display();
        a1.adminCheck();
        EMS.User.displayCount();
        EMS.User u1 = new EMS.User(19,"devadeva@gmai.com","Prabhas","adasdsdasd",1000);
        u1.display();
        u1.adminCheck();
        EMS.User.displayCount();
    }
}