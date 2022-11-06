public class Person {
    private String fullName;
    private int age;
    private String placeOfBirth;

    void setFullName(String fullName){
        this.fullName = fullName;
    }
    String getFullName(){
        return fullName;
    }
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }
    void setPlaceOfBirth(String placeOfBirth){
        this.placeOfBirth = placeOfBirth;
    }
    String getPlaceOfBirth(){
        return placeOfBirth;
    }
    void getPersonInfo(){
        System.out.println();
        System.out.println("Full name     : " + getFullName());
        System.out.println("Age           : " + getAge());
        System.out.println("Place of birth: " + getFullName());
        System.out.println();
    }
}
