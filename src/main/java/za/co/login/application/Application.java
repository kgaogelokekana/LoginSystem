import java.util.Scanner;

class Application {

public static void main(String [] args){
Scanner scan = new Scanner(System.in);

System.out.println("Enter Username: ");
String username = scan.nextLine();

System.out.println("Enter Password: ");
String password = scan.nextLine();

if(username.equals("admin") && password.equals("123#!")){
System.out.print("WELCOME TO ABC SOFTWARE INC.");
scan.close();
}else{
System.out.print("Invalid Username or Password. 2/3 attempts left! ");

System.out.println(" \n Enter Username: ");
String username2 = scan.nextLine();

System.out.println("Enter Password: ");
String password2 = scan.nextLine();

if(username2.equals("admin") && password2.equals("123#!")){
System.out.println("WELCOME TO ABC SOFTWARE INC!");
scan.close();
}else{

System.out.println("Invalid Username or Password. 1/3 attempts left! \n");

System.out.println("Enter Username:");
String username3 = scan.nextLine();

System.out.println("Enter Password \n");
String password3 = scan.nextLine();

if(username3.equals("admin") && password3.equals("123#!")){
System.out.println("WELCOME TO ABC SOFTWARE INC.");
}else{
System.out.println("YOUR ACCOUNT HAS BEEN BLOCKED!");
}
}
}

}


}
