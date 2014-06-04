/**
 * Created by snake on 04.06.14.
 */
public class House {

    private Human human;

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public String getOwnerName() {
        return human.getName();
    }


}
