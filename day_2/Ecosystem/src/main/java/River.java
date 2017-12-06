import java.util.ArrayList;

public class River {

    private ArrayList<Salmon> contents;

    public River() {
        this.contents = new ArrayList<>();
    }

    public int fishCount() {
        return contents.size();
    }


    public void addFish(Salmon inputFish) {
        this.contents.add(inputFish);
    }

    public Salmon removeFish() {
       return this.contents.remove(0);
    }
}
