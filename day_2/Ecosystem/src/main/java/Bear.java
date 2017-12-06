import java.util.ArrayList;

public class Bear {

    private String name;
    private ArrayList<Salmon> belly;

    public Bear(String inputName) {
        this.name = inputName;
        this.belly = new ArrayList<>();

    }

    public int foodCount() {
        return this.belly.size();
    }

    public void eat(River inputRiver) {
        belly.add(inputRiver.removeFish());
    }

    public void sleep() {
        belly.clear();
    }


}
