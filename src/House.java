import java.util.List;

public class House {
    private int number;
    private String adresses;
   private Parents parents;

    public House(int number, String adresses,Parents parents) {
        this.number = number;
        this.adresses = adresses;
        this.parents = parents;
    }

    @Override
    public String toString() {
        return "House{" +
                "number=" + number +
                ", adresses='" + adresses + '\'' +
                ", parents=" + parents +
                '}';
    }
}
