public class Car {
    private String model;
    private int year;
    private String color;

    void setModel(String model){
        this.model = model;
    }
    String getModel(){
        return model;
    }
    void setYear(int year){
        this.year = year;
    }
    int getYear(){
        return year;
    }
    void setColor(String color){
        this.color = color;
    }
    String getColor(){
        return color;
    }
    void getCarInfo(){
        System.out.println();
        System.out.println("Model: " + getModel());
        System.out.println("Year : " + getYear());
        System.out.println("Color: " + getColor());
        System.out.println();
    }
}
