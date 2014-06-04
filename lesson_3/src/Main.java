/**
 * Created by snake on 04.06.14.
 */
public class Main {

    public static void main(String[] args) {
        Human human = new Human("Max");
        System.out.println(human.getName());
        System.out.println("------------------");
        Student student = new Student("Vasya");
        System.out.println(student.getName());
        System.out.println("------------------");
        House house = new House();
        Human houseOwner = student;
        house.setHuman(houseOwner);
        System.out.println("Owner name: " + house.getOwnerName());
        System.out.println("------------------");
        Teacher teacher = new Teacher("Ivan Petrovich");
        house.setHuman(teacher);
        System.out.println("Owner name: " + house.getOwnerName());
        System.out.println("------------------");
        System.out.println(student);
    }

}

