public class Main {


    public static void main(String[] args) {

        // have a person with age, name
        Human teacher = new Teacher(42, "Andries");
        Human student = new Student(21, "Robin");
        Enterable apv = new House();
        Enterable line58 = new Bus();

//        Enterable box = new Enterable();

        // Casting
        String msg = ((Student) student).complain();
        System.out.println(msg);

        apv.enter(student);
        apv.leave();
        line58.enter(student);

//        if(apv.hasHumanInside()) {
//            System.out.println("There is a human in the house!");
//        }
        ((Bus) line58).report();


        System.out.println("Hello " + teacher.name
                + " you are " + teacher.age + " years old.");

        System.out.println("Hello " + student.name
                + " you are " + student.age + " years old.");
    }
}