/**
 * Created by snake on 04.06.14.
 */
public class Human {

    private static final String N_A = "N/A";

    private final String name;

    private int age = 0;

//    public Human() {
//        System.out.println("....in def. constr.");
//        this.name = N_A;
//    }

    public Human(String name) {
        System.out.println("In human");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void birthDay() {
        age++;
    }
}
