public class School {
    private String name;
    private String city;
    private int capacity;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setCity(String city){
        this.city = city;
    }
    String getCity(){
        return city;
    }
    void setCapacity(int capacity){
        this.capacity = capacity;
    }
    int getCapacity(){
        return capacity;
    }
    void getSchoolInfo(){
        System.out.println();
        System.out.println("School name: " + getName());
        System.out.println("City       : " + getCity());
        System.out.println("Capacity   : " + getCapacity());
        System.out.println();
    }
}
