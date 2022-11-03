import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] universityNames = new String[3];
        String[] universityCountries = new String[3];
        int[] universityRanks = new int[3];
        University university1 = new University();
        university1.setName("Johns Hopkins University");
        universityNames[0] = university1.getName();
        university1.setCountry("USA");
        universityCountries[0] = university1.getCountry();
        university1.setWorldRanking(24);
        universityRanks[0] = university1.getWorldRanking();
        University university2 = new University();
        university2.setName("ETH Zurich");
        universityNames[1] = university2.getName();
        university2.setCountry("Switzerland");
        universityCountries[1] = university2.getCountry();
        university2.setWorldRanking(9);
        universityRanks[1] = university2.getWorldRanking();
        University university3 = new University();
        university3.setName("Czech Technical University in Prague");
        universityNames[2] = university3.getName();
        university3.setCountry("Czech Republic");
        universityCountries[2] = university3.getCountry();
        university3.setWorldRanking(378);
        universityRanks[2] = university3.getWorldRanking();

        String[] schoolNames = new String[3];
        String[] schoolCities = new String[3];
        int[] schoolCapacities = new int[3];
        School school1 = new School();
        school1.setName("Academic Magnet high School");
        schoolNames[0] = school1.getName();
        school1.setCity("North Charleston, SC");
        schoolCities[0] = school1.getCity();
        school1.setCapacity(698);
        schoolCapacities[0] = school1.getCapacity();
        School school2 = new School();
        school2.setName("Signature School");
        schoolNames[1] = school2.getName();
        school2.setCity("Evansville, IN");
        schoolCities[1] = school2.getCity();
        school2.setCapacity(390);
        schoolCapacities[1] = school2.getCapacity();
        School school3 = new School();
        school3.setName("Tesla STEM High School");
        schoolNames[2] = school3.getName();
        school3.setCity("Redmond, WA");
        schoolCities[2] = school3.getCity();
        school3.setCapacity(606);
        schoolCapacities[2] = school3.getCapacity();

        String[] carModels = new String[4];
        int[] carYears = new int[4];
        String[] carColors = new String[4];
        Car car1 = new Car();
        car1.setModel("BMW 7 Series");
        carModels[0] = car1.getModel();
        car1.setYear(2022);
        carYears[0] = car1.getYear();
        car1.setColor("Grey");
        carColors[0] = car1.getColor();
        Car car2 = new Car();
        car2.setModel("Chevrolet Corvette");
        carModels[1] = car2.getModel();
        car2.setYear(2021);
        carYears[1] = car2.getYear();
        car2.setColor("Dark Red");
        carColors[1] = car2.getColor();
        Car car3 = new Car();
        car3.setModel("Genesis G80");
        carModels[2] = car3.getModel();
        car3.setYear(2022);
        carYears[2] = car3.getYear();
        car3.setColor("Black");
        carColors[2] = car3.getColor();
        Car car4 = new Car();
        car4.setModel("Skoda Superb");
        carModels[3] = car4.getModel();
        car4.setYear(2020);
        carYears[3] = car4.getYear();
        car4.setColor("White");
        carColors[3] = car4.getColor();

        String[] personNames = new String[4];
        int[] personAges = new int[4];
        String[] personPlaces = new String[4];
        Person person1 = new Person();
        person1.setFullName("Elon Musk");
        personNames[0] = person1.getFullName();
        person1.setAge(51);
        personAges[0] = person1.getAge();
        person1.setPlaceOfBirth("South Africa");
        personPlaces[0] = person1.getPlaceOfBirth();
        Person person2 = new Person();
        person2.setFullName("Bernard Arnault");
        personNames[1] = person2.getFullName();
        person2.setAge(73);
        personAges[1] = person2.getAge();
        person2.setPlaceOfBirth("Roubaix, France");
        personPlaces[1] = person2.getPlaceOfBirth();
        Person person3 = new Person();
        person3.setFullName("Gautam Adani");
        personNames[2] = person3.getFullName();
        person3.setAge(60);
        personAges[2] = person3.getAge();
        person3.setPlaceOfBirth(" Ahmedabad, India");
        personPlaces[2] = person3.getPlaceOfBirth();
        Person person4 = new Person();
        person4.setFullName("Jeff Bezos");
        personNames[3] = person4.getFullName();
        person4.setAge(58);
        personAges[3] = person4.getAge();
        person4.setPlaceOfBirth("Albuquerque, New Mexico, United States");
        personPlaces[3] = person4.getPlaceOfBirth();

        String enter;
        System.out.println("Choose one of the belows to see more information");
        System.out.println("--------------------------------------------------");
        System.out.println("Universities (enter U)");
        System.out.println("Schools (enter S)");
        System.out.println("Cars (enter C)");
        System.out.println("People (enter P)");
        System.out.println();
        System.out.println("~in order to Quit enter Q");
        System.out.println();

        while (true) {
            System.out.print("Enter here: ");

            enter = scanner.nextLine();

            if (Objects.equals(enter, "U")) {
                System.out.println("--------- Universities -----------");
                System.out.println();
                for (int i = 0; i < 3; i++) {
                    System.out.println("University:     " + universityNames[i]);
                    System.out.println("Country:        " + universityCountries[i]);
                    System.out.println("World Ranking:  " + universityRanks[i]);
                    System.out.println();
                }
                System.out.println("-------------------------------------");
                System.out.println();
            } else if (Objects.equals(enter, "S")) {
                System.out.println("--------- Schools -----------");
                System.out.println();
                for (int i = 0; i < 3; i++) {
                    System.out.println("School:      " + schoolNames[i]);
                    System.out.println("City:        " + schoolCities[i]);
                    System.out.println("Capacity:    " + schoolCapacities[i]);
                    System.out.println();
                }
                System.out.println("-------------------------------------");
                System.out.println();
            } else if (Objects.equals(enter, "C")) {
                System.out.println("--------- Cars -----------");
                System.out.println();
                for (int i = 0; i < 4; i++) {
                    System.out.println("Car model    " + carModels[i]);
                    System.out.println("Year:        " + carYears[i]);
                    System.out.println("Car color:   " + carColors[i]);
                    System.out.println();
                }
                System.out.println("-------------------------------------");
                System.out.println();
            } else if (Objects.equals(enter, "P")) {
                System.out.println("--------- People -----------");
                System.out.println();
                for (int i = 0; i < 4; i++) {
                    System.out.println("Full Name:       " + personNames[i]);
                    System.out.println("Age:             " + personAges[i]);
                    System.out.println("Place of birth:  " + personPlaces[i]);
                    System.out.println();
                }
                System.out.println("-------------------------------------");
                System.out.println();
            } else if (Objects.equals(enter, "Q")) {
                System.out.println("Thank You!");
                break;
            } else {
                System.out.println("Not on the list. Try again.");
            }
        }


    }
}