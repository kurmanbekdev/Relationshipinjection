import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Users> al = new ArrayList<>();
        int b ;
        System.out.println("1 -> save user" + "\n" + "2 -> delete user" + "\n" + "3 -> save user");
        int a = in.nextInt();
        while (a != 3) {
            if (a == 1) {
                al.add(new Users(in.next(), in.next(), in.nextInt()));
                System.out.println("1 -> save user" + "\n" + "2 -> delete user" + "\n" + "3 -> save user");
                a = in.nextInt();
            }
            if (a == 2) {
                System.out.println("Imdex:");
                b = in.nextInt();
                al.remove(b);
            }
        }
        if (a == 3) {
            System.out.println("\n" + al);
        }
    }
}



