import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        University university1 = new University();
        university1.setName("Johns Hopkins University");
        university1.setCountry("USA");
        university1.setWorldRanking(24);
        University university2 = new University();
        university2.setName("ETH Zurich");
        university2.setCountry("Switzerland");
        university2.setWorldRanking(9);
        University university3 = new University();
        university3.setName("Czech Technical University in Prague");
        university3.setCountry("Czech Republic");
        university3.setWorldRanking(378);
        University[] universities = {university1,university2,university3};


        School school1 = new School();
        school1.setName("Academic Magnet high School");
        school1.setCity("North Charleston, SC");
        school1.setCapacity(698);
        School school2 = new School();
        school2.setName("Signature School");
        school2.setCity("Evansville, IN");
        school2.setCapacity(390);
        School school3 = new School();
        school3.setName("Tesla STEM High School");
        school3.setCity("Redmond, WA");
        school3.setCapacity(606);
        School[] schools = {school1, school2, school3};

        Car car1 = new Car();
        car1.setModel("BMW 7 Series");
        car1.setYear(2022);
        car1.setColor("Grey");
        Car car2 = new Car();
        car2.setModel("Chevrolet Corvette");
        car2.setYear(2021);
        car2.setColor("Dark Red");
        Car car3 = new Car();
        car3.setModel("Genesis G80");
        car3.setYear(2022);
        car3.setColor("Black");
        Car car4 = new Car();
        car4.setModel("Skoda Superb");
        car4.setYear(2020);
        car4.setColor("White");
        Car[] cars = {car1, car2, car3, car4};

        Person person1 = new Person();
        person1.setFullName("Elon Musk");
        person1.setAge(51);
        person1.setPlaceOfBirth("South Africa");
        Person person2 = new Person();
        person2.setFullName("Bernard Arnault");
        person2.setAge(73);
        person2.setPlaceOfBirth("Roubaix, France");
        Person person3 = new Person();
        person3.setFullName("Gautam Adani");
        person3.setAge(60);
        person3.setPlaceOfBirth(" Ahmedabad, India");
        Person person4 = new Person();
        person4.setFullName("Jeff Bezos");
        person4.setAge(58);
        person4.setPlaceOfBirth("Albuquerque, New Mexico, United States");
        Person[] people = {person1, person2, person3, person4};

        String enter;
        System.out.println("Choose one of the belows to see more information");
        System.out.println("--------------------------------------------------");
        System.out.println("Universities (enter U)");
        System.out.println("Schools (enter S)");
        System.out.println("Cars (enter C)");
        System.out.println("People (enter P)");
        System.out.println();
        System.out.println("~to Quit (enter Q)");
        System.out.println();


        while (true) {
            System.out.print("Enter here: ");

            enter = scanner.nextLine();

            if (Objects.equals(enter, "U")) {
                System.out.println("--------- Universities -----------");
                System.out.println();
                for (University university : universities) {
                    university.getUniversityInfo();
                }
                System.out.println("-------------------------------------");
                System.out.println();
            } else if (Objects.equals(enter, "S")) {
                System.out.println("--------- Schools -----------");
                System.out.println();
                for (School school : schools) {
                    school.getSchoolInfo();
                }
                System.out.println("-------------------------------------");
                System.out.println();
            } else if (Objects.equals(enter, "C")) {
                System.out.println("--------- Cars -----------");
                System.out.println();
                for (Car car : cars) {
                    car.getCarInfo();
                }
                System.out.println("-------------------------------------");
                System.out.println();
            } else if (Objects.equals(enter, "P")) {
                System.out.println("--------- People -----------");
                System.out.println();
                for (Person person : people) {
                    person.getPersonInfo();
                }
                System.out.println("-------------------------------------");
                System.out.println();
            } else if (Objects.equals(enter, "Q")) {
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("Not on the list. Try again.");
            }
        }


    }
}