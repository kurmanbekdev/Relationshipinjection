import java.util.List;

public class Parents {
    private String name;
    private  int countChild;
    private List<Child>child;

    public Parents(String name, int countChild, List<Child> child) {
        this.name = name;
        this.countChild = countChild;
        this.child = child;
    }

    @Override
    public String toString() {
        return "Parents{" +
                "name='" + name + '\'' +
                ", countChild=" + countChild +
                ", child=" + child +
                '}';
    }
}



