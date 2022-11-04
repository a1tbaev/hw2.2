public class Main {
    public static void main(String[] args) {
        University university = new University();

        university.setName("Ala-Too");
        university.setPlace("Kyrgyzstan");
        university.setPupil(213);
        University[] universities = {university};
        array(universities);

        School school = new School();
        school.setName("Sapat");
        school.setPlace("Kyrgyzstan");
        school.setPupil(365);
        School[] schools = {school};
        array1(schools);

        Car car = new Car();
        car.setName("BMW");
        car.setType("M5");
        car.setSpeed(268);
        Car[] cars = {car};
        array2(cars);

        Person person = new Person();
        person.setName("Adil");
        person.setFrom("Talas");
        person.setAge(18);
        Person[] people = {person};
        array3(people);
    }
    public static void array(University[] universities){
        for (University university :universities) {
            System.out.println("name: "+university.getName());
            System.out.println("place: "+university.getPlace());
            System.out.println("students: "+university.getPupil()+"\n");
        }
    }
    public static void array1(School[] schools){
        for (School school:schools) {
            System.out.println("name: "+school.getName());
            System.out.println("place: "+school.getPlace());
            System.out.println("pupils: "+school.getPupil()+"\n");
        }
    }
    public static void array2(Car[] cars){
        for (Car car: cars) {
            System.out.println("name: " +car.getName());
            System.out.println("type: "+car.getType());
            System.out.println("max speed: "+car.getSpeed()+"\n");
        }
    }
    public static void array3(Person[] person){
        for (Person persons:person) {
            System.out.println("name: "+persons.getName());
            System.out.println("from: "+persons.getFrom());
            System.out.println("age: "+persons.getAge());
        }
    }
}