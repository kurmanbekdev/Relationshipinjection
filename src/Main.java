import java.util.List;

public class Main {
    public static void main(String[] args) {

        Child child = new Child("Roma", 23);
        Child child1 = new Child("Reo", 15);
        Child child2 = new Child("Kruel", 13);
        Child child3 = new Child("Ronald", 3);
        Child[] children = {child,child1,child2,child3};

        Parents parents = new Parents("Jack", children.length, List.of(children));

        House house = new House(57,"Psospect Manas",parents);

        System.out.println(house);
    }
}