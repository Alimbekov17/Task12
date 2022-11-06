public class University {
    private String name;
    private String country;
    private int worldRanking;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setCountry(String country){
        this.country = country;
    }
    String getCountry(){
        return country;
    }
    void setWorldRanking(int worldRanking){
        this.worldRanking = worldRanking;
    }
    int getWorldRanking(){
        return worldRanking;
    }
    void getUniversityInfo(){
        System.out.println();
        System.out.println("University   : " + getName());
        System.out.println("Country      : " + getCountry());
        System.out.println("World Ranking: " + getWorldRanking());
        System.out.println();
    }

}
