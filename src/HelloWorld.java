import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("In main");

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.printf("%s", name);
	// this is a comment to push to github
    }
}
