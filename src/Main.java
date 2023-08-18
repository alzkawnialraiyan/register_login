import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the System, Login choose (1), Register choose (2), Exit choose (3).");
            int choice = read.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Please enter your email to login: ");
                    String logemail = read.next();
                    boolean emaillog = login.isValidmail(logemail);
                    if (emaillog == true)
                        System.out.println("Provided email address " + logemail + " is valid");
                    else
                        System.out.println("Provided email address " + logemail + " is invalid");

                    System.out.println("Please enter your password: ");
                    String loginpass = read.next();
                    boolean passlogin = login.isValidPassLog(loginpass);
                    if (passlogin == true) {
                        System.out.println("Correct Password");
                    }else {
                        System.out.println("Woring password");
                        break;
                    }System.exit(0);
                case 2:
                    System.out.println("PLease enter your data for registration");
                    //user name
                    System.out.println("Name: ");
                    String name = read.next();
                    //user phone number
                    System.out.println("Please enter you phone number : ");
                    String phonenumber = read.next();
                    boolean num = register.isValidPhoneNumber(phonenumber);
                    if (num == true)
                        System.out.println("Provided number is valid");
                    else
                        System.out.println("Provided number is invalid");
                    //user email
                    System.out.println("Please enter your email : ");
                    String email = read.next();
                    boolean result = register.isValid(email);
                    if (result == true)
                        System.out.println("Provided email address " + email + " is valid");
                    else
                        System.out.println("Provided email address " + email + " is invalid");
                    //user password
                    System.out.println("Enter your password : ");
                    String password = read.next();
                    boolean validpass = register.isValidPassword(password);
                    if (validpass == true)
                        System.out.println("Password is valid");
                    else
                        System.out.println("Password is not valid");
                    break;
                case 3:
                    System.out.println("Thank you.");
                    System.exit(0);
                default:
                    System.out.println("Please choose.");
            }
        }
    }
}
