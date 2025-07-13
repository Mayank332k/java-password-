import java.util.*;
public class builder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Press any key to continue or 4 to exit: ");
            int exit = sc.nextInt();
            sc.nextLine();  

            if (exit == 4) {
                System.out.println("Exited!");
                break;
            }
             {
        System.out.print("enter the password : ");
        String user = sc.nextLine();
        int counter = 0;
        boolean isupper = false;
        boolean islower = false;
        boolean isdigit = false;
        boolean spcl = false;
        boolean length = false;

        for (int i = 0; i < user.length(); i++) {
        char ch = user.charAt(i);

       if (Character.isUpperCase(ch)){
        isupper = true;

    }
       if (Character.isLowerCase(ch)){
        islower = true;
    }
       if (Character.isDigit(ch)){
        isdigit = true;
    }
       if (ch == '!' || ch == '@' || ch == '$' || ch == '%' || ch == '&' ){
       spcl = true;
    }  
       if (user.length() > 8){
        length = true;
       }
    }   if (isupper) counter++;
        if (islower) counter++;
        if (isdigit) counter++;
        if (spcl) counter++;
        if (length) counter++;
    
        if (counter == 0){
        System.out.println("thoda strong pass bana bail budhhi.");
        System.out.println(" 🔴🔴🔴🔴🔴 ");
    }
    if (counter == 1 ){
    System.out.println("tu bhi dimaag se paidal hi hai..");
    System.out.println(" 🟢🔴🔴🔴🔴 ");
    }
    if (counter == 2 ){
        System.out.println("achhe se likh bhai pass");
        System.out.println("🟢🟢🔴🔴🔴 ");
    }
    if (counter == 3 ){
        System.out.println("hack ho jayega mereko na bolna samjha bkl! ");
        System.out.println("🟢🟢🟢🔴🔴" );
    }
    if (counter == 4 ){
        System.out.println("shi hai par thoda aur strong bana le plssllssll...");
        System.out.println("🟢🟢🟢🟢🔴 ");
    }
    if (counter == 5){
        System.out.println("tumne kiya!, tumne kiya! , tumne kiya! hurreyyyyy!!!");
        System.out.println("🟢🟢🟢🟢🟢");
    }
}
        }
    }
}

