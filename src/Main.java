import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        ArrayList<Users> all = new ArrayList<>();
        mystery(in.nextInt(),in1.nextInt());
    }
    public static void mystery(int b,String c){
        while (true) {
            System.out.println("1 -> save user" + "\n" + "2 -> delete user" + "\n" + "3 -> save user");
            int a = b;
            if (a == 1) {
                System.out.print("name: ");
                String name = c;
                System.out.print("last name: ");
                String lastName = c;
                System.out.println("age: ");
                int age = in.nextInt();
                all.add(new Users(name, lastName, age));
            }
            if (a == 2) {
                int toRemove = in.nextInt();
                all.remove(toRemove);
                System.out.println("Successfully deleted");
            }
            if (a == 3) {
                System.out.println(all);
            }
        }
    }
}



