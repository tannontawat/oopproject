package command;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String id=null,password=null;
        id=input.nextLine();
        password=input.nextLine();
        
        login login =new login(id,password);
        login.check();        
    }
    
    
}